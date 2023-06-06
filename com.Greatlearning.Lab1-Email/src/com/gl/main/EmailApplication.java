package com.gl.main;

import com.gl.model.Employee;
import java.util.Scanner;
import com.gl.service.CredentialService;
import com.gl.service.CredentialServiceimpl;

public class EmailApplication {

	public static void main(String[] args) {

		CredentialService service = new CredentialServiceimpl();
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee Last Name:");
			String firstName = sc.next();
			System.out.println("Enter Employee Last Name:");
			String lastName = sc.next();
			Employee emp = new Employee(firstName, lastName);

			int flag = 1;

			do {
				System.out.println("Please enter department from the following..");
				System.out.println("1-Technical");
				System.out.println("2-Admin");
				System.out.println("3-Human resource");
				System.out.println("4-Legal");
				String department1 = null;
				int i = sc.nextInt();

				flag = 1;
				switch (i) {
				case 1:
					department1 = "tech";
					break;
				case 2:
					department1 = "admin";
					break;
				case 3:
					department1 = "hr";
					break;
				case 4:
					department1 = "legal";
					break;

				default:
					System.out.println("Plese Only choose from the below list");

					flag++;
					break;

				}

				if (department1 != null) {
					String generatePassword = service.generatePassword();
					String generatedEmail = service.generateEmailAddress(emp, department1);
					service.showCredentials(emp, department1);
				} else {
					System.out.println("Plese enter department again..");
				}

			} while (flag == 2);
			sc.close();
		}

	}
}
