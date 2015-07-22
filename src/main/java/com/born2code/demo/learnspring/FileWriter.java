package com.born2code.demo.learnspring;

import org.springframework.stereotype.Component;

@Component("filewriter")
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);

	}

}
