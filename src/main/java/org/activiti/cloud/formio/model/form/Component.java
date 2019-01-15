package org.activiti.cloud.formio.model.form;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Component implements Serializable {

	private String type;
	private Boolean persistent;
	private Boolean unique;
	private Boolean _protected;
	private String defaultValue;
	private String suffix;
	private String prefix;
	private String placeholder;
	private String key;
	private String label;
	private String inputType;
	private Boolean tableView;
	private Boolean input;
	private Validate validate;
	private String theme;
	private Boolean disableOnInvalid;
	private String action;
	private Boolean block;
	private String rightIcon;
	private String leftIcon;
	private String size;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 3182788681117703163L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Component() {
	}

	/**
	 * 
	 * @param leftIcon
	 * @param unique
	 * @param placeholder
	 * @param theme
	 * @param block
	 * @param label
	 * @param type
	 * @param suffix
	 * @param validate
	 * @param _protected
	 * @param size
	 * @param input
	 * @param tableView
	 * @param persistent
	 * @param prefix
	 * @param inputType
	 * @param action
	 * @param rightIcon
	 * @param disableOnInvalid
	 * @param defaultValue
	 * @param key
	 */
	public Component(String type, Boolean persistent, Boolean unique, Boolean _protected, String defaultValue,
			String suffix, String prefix, String placeholder, String key, String label, String inputType,
			Boolean tableView, Boolean input, Validate validate, String theme, Boolean disableOnInvalid, String action,
			Boolean block, String rightIcon, String leftIcon, String size) {
		super();
		this.type = type;
		this.persistent = persistent;
		this.unique = unique;
		this._protected = _protected;
		this.defaultValue = defaultValue;
		this.suffix = suffix;
		this.prefix = prefix;
		this.placeholder = placeholder;
		this.key = key;
		this.label = label;
		this.inputType = inputType;
		this.tableView = tableView;
		this.input = input;
		this.validate = validate;
		this.theme = theme;
		this.disableOnInvalid = disableOnInvalid;
		this.action = action;
		this.block = block;
		this.rightIcon = rightIcon;
		this.leftIcon = leftIcon;
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Component withType(String type) {
		this.type = type;
		return this;
	}

	public Boolean getPersistent() {
		return persistent;
	}

	public void setPersistent(Boolean persistent) {
		this.persistent = persistent;
	}

	public Component withPersistent(Boolean persistent) {
		this.persistent = persistent;
		return this;
	}

	public Boolean getUnique() {
		return unique;
	}

	public void setUnique(Boolean unique) {
		this.unique = unique;
	}

	public Component withUnique(Boolean unique) {
		this.unique = unique;
		return this;
	}

	public Boolean getProtected() {
		return _protected;
	}

	public void setProtected(Boolean _protected) {
		this._protected = _protected;
	}

	public Component withProtected(Boolean _protected) {
		this._protected = _protected;
		return this;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public Component withDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
		return this;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Component withSuffix(String suffix) {
		this.suffix = suffix;
		return this;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Component withPrefix(String prefix) {
		this.prefix = prefix;
		return this;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public Component withPlaceholder(String placeholder) {
		this.placeholder = placeholder;
		return this;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Component withKey(String key) {
		this.key = key;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Component withLabel(String label) {
		this.label = label;
		return this;
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public Component withInputType(String inputType) {
		this.inputType = inputType;
		return this;
	}

	public Boolean getTableView() {
		return tableView;
	}

	public void setTableView(Boolean tableView) {
		this.tableView = tableView;
	}

	public Component withTableView(Boolean tableView) {
		this.tableView = tableView;
		return this;
	}

	public Boolean getInput() {
		return input;
	}

	public void setInput(Boolean input) {
		this.input = input;
	}

	public Component withInput(Boolean input) {
		this.input = input;
		return this;
	}

	public Validate getValidate() {
		return validate;
	}

	public void setValidate(Validate validate) {
		this.validate = validate;
	}

	public Component withValidate(Validate validate) {
		this.validate = validate;
		return this;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Component withTheme(String theme) {
		this.theme = theme;
		return this;
	}

	public Boolean getDisableOnInvalid() {
		return disableOnInvalid;
	}

	public void setDisableOnInvalid(Boolean disableOnInvalid) {
		this.disableOnInvalid = disableOnInvalid;
	}

	public Component withDisableOnInvalid(Boolean disableOnInvalid) {
		this.disableOnInvalid = disableOnInvalid;
		return this;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Component withAction(String action) {
		this.action = action;
		return this;
	}

	public Boolean getBlock() {
		return block;
	}

	public void setBlock(Boolean block) {
		this.block = block;
	}

	public Component withBlock(Boolean block) {
		this.block = block;
		return this;
	}

	public String getRightIcon() {
		return rightIcon;
	}

	public void setRightIcon(String rightIcon) {
		this.rightIcon = rightIcon;
	}

	public Component withRightIcon(String rightIcon) {
		this.rightIcon = rightIcon;
		return this;
	}

	public String getLeftIcon() {
		return leftIcon;
	}

	public void setLeftIcon(String leftIcon) {
		this.leftIcon = leftIcon;
	}

	public Component withLeftIcon(String leftIcon) {
		this.leftIcon = leftIcon;
		return this;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Component withSize(String size) {
		this.size = size;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Component withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
