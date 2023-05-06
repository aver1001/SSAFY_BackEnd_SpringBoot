package com.ssafy.trip.dto;

public class AttractionDTO extends AttractionInfoVO{
	String description;
	String sidoString;
	String gugunString;

	public AttractionDTO() {
		super();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if(description == null) return;
		this.description = description;
	}
	public String getSidoString() {
		return sidoString;
	}
	public void setSidoString(String sidoString) {
		if(description == null) return;
		this.sidoString = sidoString;
	}
	public String getGugunString() {
		return gugunString;
	}
	public void setGugunString(String gugunString) {
		if(description == null) return;
		this.gugunString = gugunString;
	}

	@Override
	public String toString() {
		return "AttractionDTO{" +
				"description='" + description + '\'' +
				", sidoString='" + sidoString + '\'' +
				", gugunString='" + gugunString + '\'' +
				'}';
	}
}
