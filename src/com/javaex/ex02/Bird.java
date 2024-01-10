package com.javaex.ex02;

public abstract class Bird {

	// 필드

	private String name;

	// 생성자

	public Bird() {

	}

	public Bird(String name) {
		this.name = name;
	}

	// 메소드 g/s

	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Bird [name=" + name + "]";
	}
	
	public abstract void sing();
	public abstract void fly();
	public abstract void showName();
}
