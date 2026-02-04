package seleinum;

public class Classobjct {
	String student;
	int rool;
	
	public static void main(String[] args) {
		text();
		
		Classobjct	sa=new Classobjct();
		sa.student="aman";
		sa.rool=23;
		Classobjct a=	new Classobjct();
		a.student="ajay";
		a.rool=21;
		System.out.println(a.student+"  "+a.rool);
		System.out.println(sa.student+"  "+sa.rool);
}
	String brand;
	String color;
	
		public static void text() {
			Classobjct	obj=new Classobjct();
			obj.brand="Mahindra";
			obj.color="Black";
			System.out.println(obj.brand+"   "+obj.color);
			
			Classobjct	bmw=new Classobjct();
			bmw.brand="Bmw_m5_Compation";
			bmw.color="Mati____Black";
			System.out.println(bmw.brand+"    "+bmw.color);
		}
		
//		String brand1;
//		String color1;
		
//		public static void Bmw() {
//			Classobjct	bmw=new Classobjct();
//			bmw.brand1="BWMm5";
//			bmw.color1="Cmoptision___black";
//			System.out.println(bmw.brand1+"     "+bmw.color1);
//			
		
}


