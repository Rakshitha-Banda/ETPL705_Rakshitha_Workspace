package com.evergent.corejava.rakshitha.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;
public class SupportTicketSystem {
	
	ArrayDeque<String> ticketQueue=new ArrayDeque<>();
	public void addTicket(String ticket) {
		ticketQueue.add(ticket);
		System.out.println(ticket+" "+"is added");
		
	}
	public void processNextTicket(){
		String s=ticketQueue.poll();
		if(s==null) {
			System.out.println("there is no ticket to process");
		}
		else {
			System.out.println(s+" "+"is processed");
		}
	}
	public void peekNextTicket() {
		String s1=ticketQueue.peek();
		if(s1==null) {
			System.out.println("no process are left in queue");
		}
		else {
			System.out.println(s1+" "+" is next ticket");
		}
	}
	public void displayQueue() {
		Iterator i=ticketQueue.iterator();
		System.out.println("All queue products are:");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
//		for(String s: ticketQueue) {
//			System.out.println(s);
//		}
	}
	public static void main(String[] args) {
		SupportTicketSystem system=new SupportTicketSystem();
	//	ArrayDeque<String> ticketQueue=new ArrayDeque<>();
		system.addTicket("ticket1:login");
		system.addTicket("ticket2:select product");
		system.addTicket("ticket3:conform order");
		system.addTicket("ticket4:do payment");
		
		system.processNextTicket();
		system.displayQueue();
		

	}

}
