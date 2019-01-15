package org.activiti.cloud.formio.model.webhook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.activiti.cloud.formio.model.submission.Metadata;

public class Request implements Serializable {

	private Map<String, Object> data;
	private List<Object> access = new ArrayList<Object>();
	private Metadata metadata;
	private String form;
	private final static long serialVersionUID = 2546019662446137532L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Request() {
	}

	/**
	 * 
	 * @param form
	 * @param data
	 * @param access
	 * @param metadata
	 */
	public Request(Map<String, Object> data, List<Object> access, Metadata metadata, String form) {
		super();
		this.data = data;
		this.access = access;
		this.metadata = metadata;
		this.form = form;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public List<Object> getAccess() {
		return access;
	}

	public void setAccess(List<Object> access) {
		this.access = access;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

}
