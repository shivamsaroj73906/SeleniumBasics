package seleinum;
import java.util.ArrayList;
public class ArraPractitce {


	public static void main(String[] args) {
		//		roll();
		//		age();
		//		product();
		//		salary();
		//		marks();
		//		array();
		//		Stname();
		//Swap();
		//sharray();
//		listarray();
//		products();
//		 evennumbers();
		fruits();
		 


	}

	public static void roll() {


		int[]roll= {0,1,2,3,4,5,6,7,8,9,};
		int	shyam=roll[0];
		int ram=roll[1];
		int deepak=roll[2];
		int vimal=roll[3];
		int rahul=roll[4];
		int raj=roll[5];
		int abjit=roll[6];
		int dhruve=roll[7];
		int shubham=roll[8];
		int rajan=roll[9];
		System.out.println(shyam);
		System.out.println(rahul);

	}
	public static void age() {
		int[]age= {80,75,90,85,70};
		int deepak=age[0];
		int ram=age[1];
		int vimal=age[2];
		int rahul=age[3];
		int abjit=age[4];
		System.out.println(ram);
		System.out.println(abjit);

	}
	public static void product() {
		int[] product= {18,29,15};
		int suger=product[0];
		int salt=product[1];
		int milk=product[2];
		System.out.println(milk);

	}
	public static void salary() {
		int[] salary= {30000,25000,40000,};
		int roshan=salary[0];
		int aman=salary[1];
		int sumit=salary[2];
		int total=salary[0]+salary[2];
		System.out.println(total);
	}
	public static void marks() {
		int []marks= {80,75,90,85,70};
		int english=marks[0];
		int hindi=marks[1];
		int math=marks[2];
		int science=marks[3];
		System.out.println("mark English ="+english +", mark math ="+math);
	}
	public static void array() {
		int a[]=new int[10];
		a[0]=26;
		a[1]=12;
		a[2]=79;
		a[3]=34;
		a[4]=35;
		a[5]=37;
		a[6]=81;
		a[7]=33;
		a[8]=54;
		a[9]=70;
		for(int i=0;i<=5;i++)
			System.out.println(a[i]);

	}
	public static void Stname() {
		String[] name=new String[7];
		name[0]="sumit";
		name[1]="krishna";
		name[2]="rajratan";
		name[3]="roshan";
		name[4]="vikash";
		name[5]="babadeen";
		name[6]="kumarsnnu";
		for(int i=0;i<=6;i++) {
			System.out.println(name[i]);
		}



	}
	public static void Swap() {
		int []a=new int[10];
		a[1]=5;
		a[0]=10;
		System.out.println("Bfore Swep = "+a[0]);
	}

	public static void sharray() {
		int[] k=new int[1000];
		int	count=k.length;
		for(int i=0;i<count;i++) {
			
			k[i]=5*i;
			System.out.println(k[i]);
				}
		

 

	}
	public static void listarray() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("babaden");
		list.add("Sukaru");
		list.add("naresh");
		list.add("ghagaru");
		list.add("papu");
		
			System.out.println(list);
		}
	public static void products() {
		ArrayList<Double> price=new ArrayList<Double>();
		price.add(12.2);
		price.add(23.24);
		price.add(42.14);
		price.add(66.76);
		System.out.println("total price"+price.size());
	}
	public static void evennumbers() {
	ArrayList<Integer> evan1=new ArrayList<Integer>();
	evan1.add(2);
	evan1.add(4);
	evan1.add(6);
	evan1.add(8);
	evan1.add(10);
	evan1.add(12);
	evan1.add(14);
	evan1.add(16);
	evan1.add(18);
	evan1.add(20);
	int num=0;
	for(int i=0;i<evan1.size();i=i+2) {
		num=num+evan1.get(i);
		}
	System.out.println(num);
	System.out.println("Evan Number"+evan1);
	}
	public static void linklist() {
		
	}
	public static void fruits() {
		ArrayList<String> fruit=new	ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Mango");
		fruit.add("Orange");
		if(fruit.contains("Mango")) {
			System.out.println("MANGO IS MATCH");
		}else {
			System.out.println("MANGO IS NOT MATCH");
		}
		
			
		}
	public static void studentmarks() {
		ArrayList<Integer>	marks=new	ArrayList<Integer>();
	}
	}
	

