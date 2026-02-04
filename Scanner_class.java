package seleinum;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		String y_n="";
		Scanner	sc=new Scanner(System.in);
		do {
			System.out.println("please enter your name !!!!");
			String str=sc.nextLine();
			System.out.println("Please enter your School  Name");
			String	nextenter=sc.nextLine();
			System.out.println("Please enter your Roll no !!!");
			String nextenter1=sc.nextLine();
			System.out.println("Please enter yuor class name");
			String nextenter2=sc.nextLine();
			System.out.println("Hello "+"->"+str+","+  " your  school name is "+"->"+nextenter+","+"  your Roll no is" +"->"+nextenter1+","+ " Welcome you are in " +"->"+nextenter2+","+ " class!!");
			System.out.println("Do you want to enter another record ?");
			y_n=sc.nextLine();
		}while(y_n.equals("yes"));
		System.out.println(" Good by...");

	}

}
