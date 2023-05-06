package com.ssafy.trip.dto;

public class AttractionInfoVO {
	private int content_id, content_type_id,sido_code,gugun_code;
	private String title,addr1,addr2,zipcode,tel,first_image,first_image2,mlevel;
	private float latitude,longitude;
	
	public int getContent_id() {
		return content_id;
	}
	public int getContent_type_id() {
		return content_type_id;
	}
	public int getSido_code() {
		return sido_code;
	}
	public int getGugun_code() {
		return gugun_code;
	}
	public String getTitle() {
		return title;
	}
	public String getAddr1() {
		return addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getTel() {
		return tel;
	}
	public String getFirst_image() {
		return first_image;
	}
	public String getFirst_image2() {
		return first_image2;
	}
	public String getMlevel() {
		return mlevel;
	}
	public float getLatitude() {
		return latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setContent_id(int content_id) {
		if(content_id < 0) {
            throw new IllegalArgumentException("content_id cannot be negative");
		}
		this.content_id = content_id;
	}
	public void setContent_type_id(int content_type_id) {
		if(content_type_id < 0) {
            throw new IllegalArgumentException("content_id cannot be negative");
		}
		this.content_type_id = content_type_id;
	}
	public void setSido_code(int sido_code) {
		if(sido_code < 0) {
            throw new IllegalArgumentException("content_id cannot be negative");
		}
		this.sido_code = sido_code;
	}
	public void setGugun_code(int gugun_code) {
		if(gugun_code < 0) {
            throw new IllegalArgumentException("content_id cannot be negative");
		}
		this.gugun_code = gugun_code;
	}
	public void setTitle(String title) {
		if(title == null) return;
		this.title = title;
	}
	public void setAddr1(String addr1) {
		if(addr1 == null) return;
		this.addr1 = addr1;
	}
	public void setAddr2(String addr2) {
		if(addr2 == null) return;
		this.addr2 = addr2;
	}
	public void setZipcode(String zipcode) {
		if(zipcode == null) return;
		this.zipcode = zipcode;
	}
	public void setTel(String tel) {
		if(tel == null) return;
		this.tel = tel;
	}
	public void setFirst_image(String first_image) {
		if(first_image == null) return;
		this.first_image = first_image;
	}
	public void setFirst_image2(String first_image2) {
		if(first_image2 == null) return;
		this.first_image2 = first_image2;
	}
	public void setMlevel(String mlevel) {
		if(mlevel == null) return;
		this.mlevel = mlevel;
	}
	public void setLatitude(float latitude) {
		if(latitude < 0) return;
		this.latitude = latitude;
	}
	public void setLongitude(float longitude) {
		if(longitude < 0) return;
		this.longitude = longitude;
	}
}
