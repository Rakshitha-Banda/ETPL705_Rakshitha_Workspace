package com.evergent.corejava.exceptionhandling;
//finally is block,if exceptions is occur not finally block is excecuted
public class ExceptionDemo5final1 {
		String name=null;
		int k=2;
		public void myData() {
			try {
				System.out.println("one");
				System.out.println(name.length());
				int t=10/k;
				System.out.println(t);
				System.out.println("end");
			}
		catch(NullPointerException e) {
			System.out.println("I acn handle :"+e);
			}
			catch(ArithmeticException e) {
				System.out.println("I can handle :"+e);
			}
			catch(Exception e) {
				System.out.println("I can handle :"+e);
			}
			finally {
				System.out.println("finally block close connection");
			}
			
		}
	public static void main(String[] args) {
		ExceptionDemo5final1 ed=new ExceptionDemo5final1();
		ed.myData();

		
		


	}

}
