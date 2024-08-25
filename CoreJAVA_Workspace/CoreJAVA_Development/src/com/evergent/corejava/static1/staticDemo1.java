package com.evergent.corejava.static1;
//we can access static variables and methods 
//direct through classname.methodname and classname.variabe name
public class staticDemo1 {
	static String name="India";
	static public void myData() {
		System.out.println("mydata");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//staticDemo1 s=new staticDemo1();
		System.out.println(staticDemo1.name);
		staticDemo1.myData();
		

	}

}
