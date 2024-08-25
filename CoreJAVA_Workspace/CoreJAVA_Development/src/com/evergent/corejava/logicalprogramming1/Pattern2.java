package com.evergent.corejava.logicalprogramming1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k;
		int j=0;
	
		for(int i=0;i<=(2*n)-1;i++) {
			if(i<=((n/2)+1)) {
			
				for(j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			else {
				
					for(k=0;k<j-1;k++) {
						System.out.print("*");
					}
					j--;
					System.out.println();
			}
				
			
		}

	

}}
