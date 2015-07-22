package com.born2code.demo.learnspring;

import javax.annotation.Resource;

import org.springframework.jmx.export.annotation.ManagedResource;

public class Logger {
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;

	@Resource
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Resource(name="newFileWriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

}
