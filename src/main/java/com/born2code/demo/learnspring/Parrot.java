package com.born2code.demo.learnspring;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private int id;
	private String speech;

	public void speak() {
		System.out.println(id + " : " + speech);
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

}
