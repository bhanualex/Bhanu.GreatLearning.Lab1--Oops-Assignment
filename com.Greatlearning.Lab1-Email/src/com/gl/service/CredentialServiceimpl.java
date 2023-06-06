package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;

public class CredentialServiceimpl implements CredentialService {

	@Override
	public String generateEmailAddress(Employee emp, String department) {
		// TODO Auto-generated method stub
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + department + ".abc.com";
	}

	@Override
	public String generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$^&*_-=+/?<>";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();
		String password = "";

		for (int i = 0; i < 8; i++) {
			password += values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	@Override
	public void showCredentials(Employee employee, String department) {

		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Email --->  "+ generateEmailAddress(employee, department));
		System.out.println("Password --->  "+ generatePassword());

	}

}
