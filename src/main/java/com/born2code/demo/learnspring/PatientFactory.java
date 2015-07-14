package com.born2code.demo.learnspring;

public class PatientFactory {
	public Patient createPatient(int id, String name){
		System.out.println("Creating Patient using factory class.");
		return new Patient(id, name);
	}
}
