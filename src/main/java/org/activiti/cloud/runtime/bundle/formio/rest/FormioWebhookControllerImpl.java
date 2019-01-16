package org.activiti.cloud.runtime.bundle.formio.rest;

import org.activiti.cloud.formio.model.webhook.WebhookPayload;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormioWebhookControllerImpl implements FormioWebhookController {

	private final RuntimeService runtimeService;
	private final TaskService taskService;
    
	public FormioWebhookControllerImpl(RuntimeService runtimeService, TaskService taskService) {
		this.runtimeService = runtimeService;
		this.taskService = taskService;
	}
	
	@Override
	public ResponseEntity<TaskCompleted> completeTask(String taskId, @RequestBody WebhookPayload payload) {
		//log.info("CompleteTask: taskId: {}, payload: {}", taskId, payload);
		
	    taskService.complete(taskId);

		return ResponseEntity.ok(new TaskCompleted(taskId));
	}

	@Override
	public ResponseEntity<ProcessStarted> startProcess(String processDefinitionKey,
													   String processName, 
													   String businessKey, 
													   @RequestBody WebhookPayload payload) {
		// start process instance with businessKey
		//log.info("StartProcess: processDefinitionKey: {}, businessKey: {}", processDefinitionKey, payload);
		
		ProcessInstance processInstance = runtimeService.createProcessInstanceBuilder()
			.processDefinitionKey(processDefinitionKey)
			.businessKey(businessKey)
			.name(processName != null ? processName : processDefinitionKey)
			.variable("submissionId", payload.getSubmission().getId())
			.variable("formId", payload.getSubmission().getForm())
			.start();
		
		return ResponseEntity.ok(new ProcessStarted(processInstance.getId()));
	}
}
