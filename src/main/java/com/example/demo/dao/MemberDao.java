package com.example.demo.dao;

public class MemberDao {
	
	public void login() {
		System.out.println("로그인했고요!");
	}
	
	public void listMember() {
		System.out.println("listMember");
		System.out.println("회원정보를 수정하였습니다.");
	}
	
	public void insertMember() {		
		System.out.println("회원을 등록하였습니다.");
		System.out.println("회원 정보를 수정함.");
	}

	public void updateMember() {
		System.out.println("회원의 정보를 고쳤습니다.");
		System.out.println("회원의 정보를 수정함!!");
	}

	public void deleteMember() {
		System.out.println("회원의 정보를 삭제함!");
	}

}
