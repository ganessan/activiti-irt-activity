package org.activiti.cloud.formio.model.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Form implements Serializable {

	private String id;
	private String type;
	private List<Object> tags = new ArrayList<Object>();
	private Object deleted;
	private Object owner;
	private List<Component> components = new ArrayList<Component>();
	private String title;
	private String name;
	private String path;
	private List<SubmissionAccess> submissionAccess = new ArrayList<SubmissionAccess>();
	private List<Access> access = new ArrayList<Access>();
	private String machineName;
	private String created;
	private String modified;
	private Long v;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -7651410934934594163L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Form() {
	}

	/**
	 * 
	 * @param machineName
	 * @param tags
	 * @param id
	 * @param v
	 * @param title
	 * @param created
	 * @param name
	 * @param path
	 * @param owner
	 * @param submissionAccess
	 * @param components
	 * @param access
	 * @param type
	 * @param deleted
	 * @param modified
	 */
	public Form(String id, String type, List<Object> tags, Object deleted, Object owner, List<Component> components,
			String title, String name, String path, List<SubmissionAccess> submissionAccess, List<Access> access,
			String machineName, String created, String modified, Long v) {
		super();
		this.id = id;
		this.type = type;
		this.tags = tags;
		this.deleted = deleted;
		this.owner = owner;
		this.components = components;
		this.title = title;
		this.name = name;
		this.path = path;
		this.submissionAccess = submissionAccess;
		this.access = access;
		this.machineName = machineName;
		this.created = created;
		this.modified = modified;
		this.v = v;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Form withId(String id) {
		this.id = id;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Form withType(String type) {
		this.type = type;
		return this;
	}

	public List<Object> getTags() {
		return tags;
	}

	public void setTags(List<Object> tags) {
		this.tags = tags;
	}

	public Form withTags(List<Object> tags) {
		this.tags = tags;
		return this;
	}

	public Object getDeleted() {
		return deleted;
	}

	public void setDeleted(Object deleted) {
		this.deleted = deleted;
	}

	public Form withDeleted(Object deleted) {
		this.deleted = deleted;
		return this;
	}

	public Object getOwner() {
		return owner;
	}

	public void setOwner(Object owner) {
		this.owner = owner;
	}

	public Form withOwner(Object owner) {
		this.owner = owner;
		return this;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public Form withComponents(List<Component> components) {
		this.components = components;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Form withTitle(String title) {
		this.title = title;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Form withName(String name) {
		this.name = name;
		return this;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Form withPath(String path) {
		this.path = path;
		return this;
	}

	public List<SubmissionAccess> getSubmissionAccess() {
		return submissionAccess;
	}

	public void setSubmissionAccess(List<SubmissionAccess> submissionAccess) {
		this.submissionAccess = submissionAccess;
	}

	public Form withSubmissionAccess(List<SubmissionAccess> submissionAccess) {
		this.submissionAccess = submissionAccess;
		return this;
	}

	public List<Access> getAccess() {
		return access;
	}

	public void setAccess(List<Access> access) {
		this.access = access;
	}

	public Form withAccess(List<Access> access) {
		this.access = access;
		return this;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public Form withMachineName(String machineName) {
		this.machineName = machineName;
		return this;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Form withCreated(String created) {
		this.created = created;
		return this;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public Form withModified(String modified) {
		this.modified = modified;
		return this;
	}

	public Long getV() {
		return v;
	}

	public void setV(Long v) {
		this.v = v;
	}

	public Form withV(Long v) {
		this.v = v;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Form withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}