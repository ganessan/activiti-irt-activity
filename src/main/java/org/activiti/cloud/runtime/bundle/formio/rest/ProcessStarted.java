package org.activiti.cloud.runtime.bundle.formio.rest;

public class ProcessStarted {
	
	private String processInstanceId;
	
	ProcessStarted() { }
	
	public ProcessStarted(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}


}
