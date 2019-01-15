package org.activiti.cloud.formio.model.form;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Validate implements Serializable {

	private Boolean required;
	private Boolean unique;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 6530724139545852140L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Validate() {
	}

	/**
	 * 
	 * @param unique
	 * @param required
	 */
	public Validate(Boolean required, Boolean unique) {
		super();
		this.required = required;
		this.unique = unique;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Validate withRequired(Boolean required) {
		this.required = required;
		return this;
	}

	public Boolean getUnique() {
		return unique;
	}

	public void setUnique(Boolean unique) {
		this.unique = unique;
	}

	public Validate withUnique(Boolean unique) {
		this.unique = unique;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Validate withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}