package model;

import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		Handler h = new Handler();
		DataHolder dh = new DataHolder();

		do {
			System.out.println(
					"1 to Enter Intern Data, 2 to see the Intern Data , 3 to search Intern, 4 to Remove Intern");
			Scanner in = new Scanner(System.in);
			int option = in.nextInt();
			switch (option) {
			case 1:
				h.addintern(dh);
			case 2:
				h.showDetails(dh);
				break;
			case 3:
				System.out.println("enter ID");
				Scanner sc = new Scanner(System.in);
				int key = sc.nextInt();
				h.GetDetails(dh, key);
				break;
			case 4:
				System.out.println("enter key");
				Scanner sc1 = new Scanner(System.in);
				int key1 = sc1.nextInt();
				h.removeDetails(dh, key1);
				break;
			}
		} while (true);
	}
}