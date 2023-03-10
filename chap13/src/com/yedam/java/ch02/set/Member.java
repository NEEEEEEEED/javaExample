package com.yedam.java.ch02.set;

public class Member {
	// 필드
	public int id;
	public String name;

	// 생성자
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	// 메서드

	@Override
	public int hashCode() {
		return id + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (id == member.id) && (name.equals(member.name));

		}
		return false;
	}

}
