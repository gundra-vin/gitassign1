package com.springmvcboot.demo.springmvcboot.bean;

import java.io.Serializable;

public class Subject implements Serializable {

	private static final long serialVersionUID = 21L;

	long subjectId;
	String subtitle;
	int durationInHours;
	
	
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subtitle=" + subtitle
				+ ", durationInHours=" + durationInHours + "]";
	}
	
}
