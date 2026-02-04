package seleinum;

import java.util.Scanner;

public class Senario {

	public static void main(String[] args) {
		String Y_N="";
		Scanner	sc=new Scanner(System.in);
		
	do {
		System.out.println("Please enter your choice number 1/2/3/4");
		int choice=sc.nextInt();
		switch(choice) {
		case 2:
		System.out.println("I am case two");
		System.out.println("You are in case two");
		System.out.println("Do you want to enter another record ?");
		 Y_N=sc.nextLine();
		 break;
		  
		 default:
		 System.out.println("Wrong choice you have to chose from 1/2/3/4 Only:");
		}
//		 System.out.println("Please enter your choice number 1/2/3/4:");
//		 sc.nextLine();
		
//		 System.out.println("Do you want to enter another record ?  Y/N");
//		 sc.nextLine();
		 
		 Y_N=sc.nextLine();
		
		 } while(Y_N.equalsIgnoreCase("yes"));
	System.out.println("no");
		 System.out.println("Good Byyy!!");
			
		
	
	}
}
