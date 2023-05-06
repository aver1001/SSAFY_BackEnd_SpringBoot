package com.ssafy.trip.dto;

public class LocationDTO {
	int gugun_code;
	int sido_code;
	String gugun_name;
	String sido_name;
	public int getGugun_code() {
		return gugun_code;
	}
	public void setGugun_code(int gugun_code) {
		if(gugun_code < 0) return;
		this.gugun_code = gugun_code;
	}
	public int getSido_code() {
		return sido_code;
	}
	public void setSido_code(int sido_code) {
		if(gugun_code < 0) return;
		this.sido_code = sido_code;
	}
	public String getGugun_name() {
		return gugun_name;
	}
	public void setGugun_name(String gugun) {
		if(gugun_code < 0) return;
		this.gugun_name = gugun;
	}
	public String getSido_name() {
		return sido_name;
	}
	public void setSido_name(String sido) {
		if(gugun_code < 0) return;
		this.sido_name = sido;
	}
	@Override
	public String toString() {
		return "LocationDTO [gugun_code=" + gugun_code + ", sido_code=" + sido_code + ", gugun=" + gugun_name + ", sido="
				+ sido_name + "]";
	}
	
	
}
