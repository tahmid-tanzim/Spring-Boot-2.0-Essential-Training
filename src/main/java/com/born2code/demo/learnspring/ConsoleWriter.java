package com.born2code.demo.learnspring;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);

	}

}
