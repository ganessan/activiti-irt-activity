package org.activiti.cloud.runtime.bundle.formio.rest;

import org.activiti.cloud.formio.model.webhook.WebhookPayload;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/formio", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
public interface FormioWebhookController {

	@RequestMapping(value = "/tasks/complete")
	ResponseEntity<TaskCompleted> completeTask(@RequestParam("taskId") String taskId, @RequestBody(required=false) WebhookPayload cmd);	

	@RequestMapping(value = "/process-instances/start")
	ResponseEntity<ProcessStarted> startProcess(@RequestParam("processDefinitionKey") String processDefinitionKey, 
    					@RequestParam("businessKey") String businessKey,
    					@RequestBody(required=false) WebhookPayload cmd);	
}
