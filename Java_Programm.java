package seleinum;

public class Java_Programm {
	public static void main(String[] args) {
		//recursion(1, 100);
		//reverseNumber();
//		recursion2(21,51);
//		System.out.println("==========================================");
		recursion2(2,100);
		//Reverse();
	}

	public static void recursion(int n, int end) {

		while (n > end) { // base condition
			return;
		}
		System.out.println(" Current Number: = " + n); /// current number
		recursion(n + 1, end);/// call itself with next number

	}
	public static void Reverse() {
		int number1=123456789;
		int	remove=0;
		while(number1 !=0) {
			int reminder=number1%10;
			remove=remove*10+reminder;
			number1=number1;
		}
		System.out.println(	"removenumber"+remove);

	}

	public static void reverseNumber() {

		int number=123456; 
		int temp=number;
		int revNumber=0;
		int count=0;
		while(number != 0) {
			int remaindor= number%10;
			revNumber= revNumber*10+remaindor;
			number=number/10;
			count++;

		}
		System.out.println(" Original Number: = "+temp);
		System.out.println(" Reverse Number: = "+revNumber);
		System.out.println(" count "+count);
	}
	public static void recursion2(int a,int b) {
		while(a>b) {
			return;
		}
		System.out.println("cusunt number"+a);
		recursion2(a+1*a,b);
	}
}
