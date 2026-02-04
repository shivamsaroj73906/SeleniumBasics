package seleinum;

public class ClassB {
static String Schoolname="EVA";
String StudentName;
int Rollno; 

ClassB(String name,int rollno){
	StudentName=name;
	 Rollno=rollno;
}
public void display() {
	System.out.println("Student name is ----"+StudentName+"-----School name is---- "+Schoolname+"---- roll no is---- "+ Rollno);
}


	public static void main(String[] args) {
		ClassB stu1=new ClassB("shivam",11);
		stu1.display();
		ClassB stu2=new ClassB("Vikesh",23);
		stu2.display();

	}

}
