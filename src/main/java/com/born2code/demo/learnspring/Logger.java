package com.born2code.demo.learnspring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jmx.export.annotation.ManagedResource;

public class Logger {
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;

	@Inject
	@Named(value="consoleWriter2")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Inject
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Creating BEAN");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("Destroying BEAN");
	}	
	
}
