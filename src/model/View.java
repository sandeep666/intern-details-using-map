package model;

import java.util.Scanner;

public class View {
	public void showDetails(InternDetails details) {
		System.out.println("Name - " + details.getName());
		System.out.println("Phone Number - " + details.getPhoneNumber());

	}
	public void addDetails(InternDetails details) {
		Scanner in = new Scanner(System.in);
		System.out.println("Add Name");
		details.setName(in.nextLine());
		System.out.println("Add Phone");
		details.setPhoneNumber(in.nextInt());

	}
}
