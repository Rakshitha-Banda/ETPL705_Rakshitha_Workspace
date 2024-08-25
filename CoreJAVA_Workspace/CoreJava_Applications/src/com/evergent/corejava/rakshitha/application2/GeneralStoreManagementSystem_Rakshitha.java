package com.evergent.corejava.rakshitha.application2;
import java.util.*;
public class GeneralStoreManagementSystem_Rakshitha {
	
	enum module1{B,D,P,L,E}
	enum submodule1{D,B,S,V,M}
	enum submodule2{MI,B,M}
	enum submodule3{S,J,P,M}
	enum submodule4{C,CO,N,M}
	enum submodule5{T,B,L,M}
	static int Tamount=0;
	static int dis=0;
	static int Netamount=0;
	static int tax=0;
	public static List<String> li=new ArrayList<>();
	public static List<Integer> li1=new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String module=null;
		
		while(true)
		{
			System.out.println("  Main Menu      ");
		System.out.println("=================");
		System.out.println("B for---- Buy products");
		System.out.println("D for---- Discount of products");
		System.out.println("P for---- Payment after discount");
		System.out.println("L for-----show list of items that customer has purchased");
		System.out.println("E for---- Exit form the application");
		System.out.println("=================");
		System.out.println("Enter your choice(B,D,P,L,E):");
		
		module=sc.nextLine();
		switch(module1.valueOf(module)) {
		
		case B:  
			 System.out.println("  Product categories      ");
			 System.out.println("=================");
			System.out.println("D for---- Buy Dairy Products");
			System.out.println("B for---- Buy Beverages");
			System.out.println("S for---- Buy Snacks");
			System.out.println("V for---- Buy Vegetables");
			System.out.println("M for-----Go To Menu");
			System.out.println("=================");
			System.out.println("Enter your choice(D,B,S,V,M):");
			
			module=sc.nextLine();
			
			switch(submodule1.valueOf(module)) {
			
			case D: 
				
				System.out.println("  Dairy products       ");
				System.out.println("=================");
				System.out.println("MI for---- Buy Milk");
				System.out.println("B for---- Buy Butter");
				System.out.println("M for-----Go To Menu");
				System.out.println("=================");
				System.out.println("Enter your choice(MI,B,M):");
				
				module=sc.nextLine();
				int val1;
				
				
				switch(submodule2.valueOf(module)) {
				
				case MI: System.out.println("milk is Rs.10");
					System.out.println("Enter Quantity:");
					val1=Integer.parseInt(sc.nextLine());
						Tamount=Tamount+10*val1;
						li.add("milk");
						li1.add(val1);
						break;
				case B: System.out.println("Butter is Rs.100");
					System.out.println("Enter Quantity:");
					val1=Integer.parseInt(sc.nextLine());
						Tamount=Tamount+100;//*val1;
						li.add("Butter");
						li1.add(val1);
						break;
				}
				break;
				
			case B:
				System.out.println("  Beverages          ");
				System.out.println("=================");
				System.out.println("S for---- Buy Soda");
				System.out.println("J for---- Buy Juice");
				System.out.println("P for---- Buy Pepsi");
				System.out.println("M for-----Go To Menu");
				System.out.println("=================");
				System.out.println("Enter your choice(S,J,P,M):");
				
				module=sc.nextLine();
				//System.out.println("Enter Quantity:");
				int val2;
				
				switch(submodule3.valueOf(module)) {
				
				case S:
						System.out.println("soda is Rs.50");
						System.out.println("Enter Quantity:");
						val2=Integer.parseInt(sc.nextLine());
						Tamount=Tamount+50*val2;
						li.add("soda");
						li1.add(val2);
						break;
				case J:
					System.out.println("juice is Rs.70");
					System.out.println("Enter Quantity:");
					val2=Integer.parseInt(sc.nextLine());
					Tamount+=70*val2;
					li.add("juice");
					li1.add(val2);
					break;
				case P:
					System.out.println("pepsi is Rs.100");
					System.out.println("Enter Quantity:");
					val2=Integer.parseInt(sc.nextLine());
					Tamount+=100*val2;
					li.add("pepsi");
					li1.add(val2);
					break;
				
				}
				break;
			
			case S:
				System.out.println("  Snacks        ");
				System.out.println("=================");
				System.out.println("C for---- Buy Chips");
				System.out.println("CO for---- Buy Cookies");
				System.out.println("N for---- Buy Nuts");
				System.out.println("M for-----Go To Menu");
				System.out.println("=================");
				System.out.println("Enter your choice(C,CO,N,M):");
				
				module=sc.nextLine();
				int val3;
				
				switch(submodule4.valueOf(module)) {
				
				case C:
					System.out.println("chips is Rs.50");
					System.out.println("Enter Quantity:");
					val3=Integer.parseInt(sc.nextLine());
					Tamount+=50*val3;
					li.add("Chips");
					li1.add(val3);
					break;
				case CO:
					System.out.println("cookies is Rs.500");
					System.out.println("Enter Quantity:");
					val3=Integer.parseInt(sc.nextLine());
					Tamount+=500*val3;
					li.add("Cookies");
					li1.add(val3);
					break;
				case N:
					System.out.println("Nuts is Rs.1000");
					System.out.println("Enter Quantity:");
					val3=Integer.parseInt(sc.nextLine());
					Tamount+=1000*val3;
					li.add("Nuts");
					li1.add(val3);
					break;
				}
				break;
				
			case V:
				System.out.println("  Vegetables      ");
				System.out.println("=================");
				System.out.println("T for---- Buy tomato");
				System.out.println("B for---- Buy Brinjal");
				System.out.println("L for---- Buy Lady's finger");
				System.out.println("M for-----Go To Menu");
				System.out.println("=================");
				System.out.println("Enter your choice(T,B,L,M):");
				
				 module=sc.nextLine();
					int val4;
				
				switch(submodule5.valueOf(module)) {
				
				case T:
					System.out.println("Tomato 1kg is Rs.50");
					System.out.println("Enter numberof kg's:");
					val4=Integer.parseInt(sc.nextLine());
					Tamount+=50*val4;
					li.add("Tomato");
					li1.add(val4);
					break;
				case B:
					System.out.println("Brinjal 1kg is Rs.40");
					System.out.println("Enter number of kg's:");
					val4=Integer.parseInt(sc.nextLine());
					Tamount+=40*val4;
					li.add("Brinjal");
					li1.add(val4);
					break;
				case L:
					System.out.println("Lady's finger 1kg is Rs.60");
					System.out.println("Enter number of kg's:");
					val4=Integer.parseInt(sc.nextLine());
					Tamount+=60*val4;
					li.add("Lady's Finger");
					li1.add(val4);
					break;
				}
				break;
				
			}
			break;
		case D:
			if(Tamount<=100) {
				System.out.println("The total amount is:"+Tamount);
				System.out.println("discoun amount is Rs.0");
				System.out.println();

				dis+=0;
			}
			else if(Tamount>100 && Tamount<500) {
				System.out.println("The total amount is:"+Tamount);
				System.out.println("discoun amount is Rs.20");
				System.out.println();

				dis+=20;
				
			}
			else if(Tamount>500 && Tamount<1000) {
				System.out.println("The total amount is:"+Tamount);
				System.out.println("discoun amount is Rs.60");
				System.out.println();
				dis+=60;
			}
			else {
				System.out.println("The total amount is:"+Tamount);
				System.out.println("discoun amount is Rs.100");
				System.out.println();

				dis+=100;
			}
		
			break;
			
		case P:
			System.out.println("the total amount is :"+Tamount);
			System.out.println("the total discount is :"+dis);
			
			tax=(Tamount*1)/100;
			System.out.println("The Tax amount is :"+tax);
			Netamount=Tamount+tax-dis;
			System.out.println("after discount the net amount has to pay is:"+Netamount);
			System.out.println();

			break;
		case L:
			System.out.println("The List of Items Customer purchased are:");
			System.out.println("products      Quantitity");
			System.out.println("=============================");
			System.out.println();
			for(int i=0;i<li.size();i++) {
				
				System.out.print(li.get(i)+"          ");
				System.out.print(li1.get(i));
				System.out.println();
			}
			break;
			
		case E:
			System.out.println("Thankyou For Coming!");
			System.exit(0);
			break;
			
		}
		}
		}
}
