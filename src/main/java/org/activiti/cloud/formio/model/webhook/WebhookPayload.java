package org.activiti.cloud.formio.model.webhook;

import java.io.Serializable;
import java.util.Map;

public class WebhookPayload implements Serializable {

	private Request request;
	private SubmissionEvent submission;
	private Map<String, Object> params;
	private final static long serialVersionUID = 7032971240069568771L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public WebhookPayload() {
	}

	/**
	 * 
	 * @param request
	 * @param submission
	 * @param params
	 */
	public WebhookPayload(Request request, SubmissionEvent submission, Map<String, Object> params) {
		super();
		this.request = request;
		this.submission = submission;
		this.params = params;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public SubmissionEvent getSubmission() {
		return submission;
	}

	public void setSubmission(SubmissionEvent submission) {
		this.submission = submission;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

}