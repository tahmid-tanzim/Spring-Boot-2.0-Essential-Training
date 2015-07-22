package com.born2code.demo.learnspring;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);

	}

}
