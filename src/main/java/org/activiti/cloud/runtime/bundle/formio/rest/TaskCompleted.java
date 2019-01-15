package org.activiti.cloud.runtime.bundle.formio.rest;

public class TaskCompleted {
	
	private String taskId;
	
	TaskCompleted() {}

	public TaskCompleted(String taskId) {
		this.taskId = taskId;
	}	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
}
