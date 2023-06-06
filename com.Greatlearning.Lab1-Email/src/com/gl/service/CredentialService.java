package com.gl.service;

import com.gl.model.Employee;

public interface CredentialService {

	public String generateEmailAddress(Employee emp, String department);

	public String generatePassword();

	public void showCredentials(Employee emp, String department);
}
