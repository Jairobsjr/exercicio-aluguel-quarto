package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Guest;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Guest[] guest = new Guest[10];
		int room;
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Rent #%d%n", i+1);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			room = sc.nextInt();
			sc.nextLine();
			
			System.out.println("");
			
			guest[room] = new Guest(name, email);
			
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < 10; i++) {
			
			if(guest[i] != null) {
				
				System.out.print(i + ": ");
				System.out.println(guest[i]);
			}
		}
		sc.close();
	}

}
