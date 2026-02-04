package seleinum;

public class Studentclass {
static String college="Eva";
String name; 

	void display() {
		
		System.out.println(name+"---college name is---"+college);
}
	public static void main(String[] args) {
	
		Studentclass stu1=new Studentclass ();
		stu1.name="shivam";
		stu1.display();
		Studentclass stu2=new Studentclass ();
		stu2.name="yuvraj";
		stu2.display();
		Studentclass stu3=new Studentclass ();
		stu3.name="amardeep";
		stu3.display();
		Studentclass stu4=new Studentclass ();
		stu4.name="vikash";
		stu4.display();
		Studentclass stu5=new Studentclass ();
		stu5.name="raj";
		stu5.display();

	}

}
