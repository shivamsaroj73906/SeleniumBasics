package seleinum;
public class java {
	public static void main(String[] args) {
		//m1(17,20,23);
		marks(71);
	}
	public static void m1(int a,int b,int c) {
		if(a%2==0) {
			System.out.println("it is evan number "+a);
		}
		else {
			System.out.println("it is odd mumber "+a);
		}
		if(b%2==0) {
			System.out.println("it is even number "+b);
		}
		else {
			System.out.println("it is odd number "+b);
		}
		if(c%2==0) {
			System.out.println("it is evan number "+c);
		}
		else {
			System.out.println("it is odd number "+c);
		}
		 
				int r=11;
		if(a/2==0) {
			System.out.println("Number is`evan"+r);
			
		}else {
			System.out.println("odd number"+r);
		}
	}
	public static void marks(int number) {
		if(number>=80) {
		System.out.println("Grade A"+number);
		}else if(number>=75){
			System.out.println("Grade B"+number);
			
		}else if(number>=45) {
			System.out.println("Grade C"+number);
		}else {
			System.out.println("fail");
		}
	}

	}


