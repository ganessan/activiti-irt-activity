package org.activiti.cloud.runtime.bundle;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RuntimeBundleApplication.class)
@DirtiesContext
public class RuntimeBundleApplicationIT {

	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	private TaskService taskService;

    @Test
    public void contextLoads() throws Exception {
    	//
    }
    
    @Test
    public void startProcess() throws Exception {
    	// given
        Map<String, Object> variableMap = new HashMap<String, Object>();
        variableMap.put("isHighRisk", false);
        variableMap.put("isOverLimit", false);
        
        // when
        ProcessInstance processInstance = runtimeService.createProcessInstanceBuilder()
        		.processDefinitionKey("IRTProcessWorkflow")
        		.variables(variableMap)
        		.businessKey("businessKey")
        		.start();
        
 	    assertNotNull(processInstance);
        
        // Complete Due Diligence
        Task task = taskService.createTaskQuery()
        		   .processInstanceBusinessKey("businessKey")
        		   .singleResult();
        
        assertNotNull(task);
        
        taskService.complete(task.getId());

        // Key Directive  into iApprove
        task = taskService.createTaskQuery()
     		   .processInstanceBusinessKey("businessKey")
     		   .singleResult();
     
	    assertNotNull(task);
	     
	    taskService.complete(task.getId());

	    // Verify Information  Correct
        task = taskService.createTaskQuery()
      		   .processInstanceBusinessKey("businessKey")
      		   .singleResult();
      
 	    assertNotNull(task);
 	     
 	    taskService.complete(task.getId());
	    
        // then
        ProcessInstance result = runtimeService.createProcessInstanceQuery()
        		.processInstanceBusinessKey("businessKey")
        		.singleResult();
        
        assertNotNull(result);

 	    
    }
}