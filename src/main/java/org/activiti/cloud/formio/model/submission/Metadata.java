package org.activiti.cloud.formio.model.submission;

import java.io.Serializable;

public class Metadata implements Serializable {

	private String timezone;
	private Long offset;
	private String referrer;
	private String browserName;
	private String userAgent;
	private String pathName;
	private Boolean onLine;
	private final static long serialVersionUID = -3592693546888210094L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Metadata() {	}

	/**
	 * 
	 * @param referrer
	 * @param timezone
	 * @param pathName
	 * @param userAgent
	 * @param browserName
	 * @param offset
	 * @param onLine
	 */
	public Metadata(String timezone, Long offset, String referrer, String browserName, String userAgent,
			String pathName, Boolean onLine) {
		super();
		this.timezone = timezone;
		this.offset = offset;
		this.referrer = referrer;
		this.browserName = browserName;
		this.userAgent = userAgent;
		this.pathName = pathName;
		this.onLine = onLine;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Long getOffset() {
		return offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public Boolean getOnLine() {
		return onLine;
	}

	public void setOnLine(Boolean onLine) {
		this.onLine = onLine;
	}
}
