package com.ssafy.trip.dto;

public class MemberVO {
	private String id, pw, name, email, sido_code, gugun_code;

	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String id, String pw, String name, String email, String sido_code, String gugun_code) {
		setId(id);
		setPw(pw);
		setName(name);
		setEmail(email);
		setSido_code(sido_code);
		setGugun_code(gugun_code);
	}

	public MemberVO(String id, String pw, String name) {
		setId(id);
		setPw(pw);
		setName(name);
	}

	public MemberVO(String id, String pw) {
		setId(id);
		setPw(pw);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null && email.trim().length() > 0) {
			this.email = email;
		}
	}

	public String getSido_code() {
		return sido_code;
	}

	public void setSido_code(String sido_code) {
		if (sido_code != null && sido_code.trim().length() > 0) {
			this.sido_code = sido_code;
		}
	}

	public String getGugun_code() {
		return gugun_code;
	}

	public void setGugun_code(String gugun_code) {
		if (gugun_code != null && gugun_code.trim().length() > 0) {
			this.gugun_code = gugun_code;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id != null && id.trim().length() > 0) {
			this.id = id;
		}
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		if (pw != null && pw.trim().length() > 0) {
			this.pw = pw;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		}
	}

	@Override
	public String toString() {
		return "MemberVO{" +
				"id='" + id + '\'' +
				", pw='" + pw + '\'' +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", sido_code='" + sido_code + '\'' +
				", gugun_code='" + gugun_code + '\'' +
				'}';
	}
}
