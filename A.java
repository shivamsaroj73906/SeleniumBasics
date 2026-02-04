package seleinum;  

public class A {
	String stuName;
	static String SchoolName="EVS";

	A(String name){
		
stuName=name;
		
		}
	void display(){
		System.out.println(SchoolName);
		System.out.println("student name is : "+stuName);
		
	}
	public static void main(String[] args) {
		 A stuobj=new A("shivam");
		 A stuobj1=new A("Raj");
		 stuobj1.display();
		 
		 //stuobj.stuName="Raj";
		 stuobj.display();
		 
	}
	
	}


