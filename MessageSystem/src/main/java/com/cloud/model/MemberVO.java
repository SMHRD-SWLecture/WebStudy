package com.cloud.model;

public class MemberVO {

    // 테이블 단위로 생성
    // WEB_MEMBER 테이블에 저장된 데이터 1개를 표현할 수 있는 자료형

    // 1. 필드 -> 반드시 테이블의 컬럼명과 일치시키기
    private String email;
    private String pw;
    private String tel;
    private String address;

    // 2. 생성자, getter, setter
	public MemberVO(String email, String pw, String tel, String address) {
		this.email = email;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}

    public MemberVO() {
     
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
    
    

}
