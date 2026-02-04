package seleinum;

public class Array {

	public static void main(String[] args) {

//		String name[]=new String[5];                
//		name[0]="shivam";
//		name[1]="raj";
//		name[2]="vikash";
//		name[3]="shubham";
//		name[4]="rajratan";
//		for(int i=0;i<=4;i++)
//			
//		 System.out.println(name[i]);
		
//		
//		int x=2;
//		for(int i=1;i<=10;i++)
//		System.out.println(x+"x"+i+"="+x*i+"  "+(x+1)+"x"+i+"="+(x+1)*i);
//		
//		
//		int x=5;
//		int i=1;
//		while (i<=10) {
//			System.out.println(x+"x"+i+"="+x*i);
//		
//			i++;
	//	}
			
//		int x=3; 
//		int i=1;
//		do {
//			System.out.println(x+"x"+i+"="+x*i);
//			i++;
//		}while(i==10) ;

	//name array

String []names= {"amit","shivam","rohit"};

//address array
String []address= {"Delhi","Prayagraj","Lucknow"};

//Phone array
String[]phone= {"5621514412","9935261211","9598112233"};
//print data
for(int i=3;i<2;i++) {
	System.out.println("Name:  "+  names[i] +" " +"Address:  "+  " "+address[i]  +"  "+"Phone:  "+  phone[i]);
}

}
}