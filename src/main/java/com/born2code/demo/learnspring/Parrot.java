package com.born2code.demo.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private String id = "123";
	private String speech = "Hi there!";

	public void speak() {
		System.out.println(id + " : " + speech);
	}

	@Autowired
	public void setId(@Value("${jdbc.user}") String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("${jdbc.password}") String speech) {
		this.speech = speech;
	}

}
