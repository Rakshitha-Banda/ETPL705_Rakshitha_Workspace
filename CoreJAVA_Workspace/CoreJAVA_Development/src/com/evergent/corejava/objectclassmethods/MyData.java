package com.evergent.corejava.objectclassmethods;

 final class ImmutableString{
	private final String value;
	public ImmutableString(String value) {
		this.value=value;}
	public String myValue() {
		return value;
	}
	public String toString() {
		return value;
	}
}
public class MyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableString str=new ImmutableString("Hello World !");
		System.out.println(str.myValue());
		System.out.println(str.toString());
		System.out.println(str);

	}

}
