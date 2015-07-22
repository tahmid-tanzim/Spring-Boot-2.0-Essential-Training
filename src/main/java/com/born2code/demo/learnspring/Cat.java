package com.born2code.demo.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
	private int id = 0;
	private String speech = "Don't feel like";

	public void speak() {
		System.out.println(id + " -- " + speech);
	}
	
//	@Autowired
	public void setId(@Value("159") int id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("Meaow") String speech) {
		this.speech = speech;
	}

}
