package com.ssafy.trip.dto;

public class AttractionSidoGugunDTO {
	int sido_code;
	int gugun_code;
	int searchContentId;
	
	public AttractionSidoGugunDTO(int sido_code, int gugun_code, int searchContentId) {
		super();
		this.sido_code = sido_code;
		this.gugun_code = gugun_code;
		this.searchContentId = searchContentId;
	}
	
	public AttractionSidoGugunDTO(int sido_code, int gugun_code) {
		super();
		this.sido_code = sido_code;
		this.gugun_code = gugun_code;
	}

	public AttractionSidoGugunDTO(int sido_code) {
		super();
		this.sido_code = sido_code;
	}
	
    public AttractionSidoGugunDTO() {}


	public int getSido_code() {
		return sido_code;
	}
	public void setSido_code(int sido_code) {
		this.sido_code = sido_code;
	}
	public int getGugun_code() {
		return gugun_code;
	}
	public void setGugun_code(int gugun_code) {
		this.gugun_code = gugun_code;
	}
	public int getSearchContentId() {
		return searchContentId;
	}
	public void setSearchContentId(int searchContentId) {
		this.searchContentId = searchContentId;
	}

	@Override
	public String toString() {
		return "AttractionSidoGugunDTO [sido_code=" + sido_code + ", gugun_code=" + gugun_code + ", searchContentId="
				+ searchContentId + "]";
	}
	
	
}
