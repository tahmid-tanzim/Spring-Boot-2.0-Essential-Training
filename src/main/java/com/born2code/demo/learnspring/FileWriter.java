package com.born2code.demo.learnspring;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("file-writer")
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);

	}

}
