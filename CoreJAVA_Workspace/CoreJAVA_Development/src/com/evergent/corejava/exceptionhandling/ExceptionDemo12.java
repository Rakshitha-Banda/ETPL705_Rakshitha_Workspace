package com.evergent.corejava.exceptionhandling;

class InvalidScoreException extends Exception{
	public InvalidScoreException(String message) {
		//System.out.println(message);
		super(message);
	}
}
public class ExceptionDemo12 {
	//method that throws a custom checked exception
	public static void validateScore(int score)throws InvalidScoreException{
		
		if(score<0 ||score>100) {
			throw new InvalidScoreException("score must be between 0 and 100 ");
		}
		else {
			System.out.println("withdrawl succesful");
		}}
	public static void main(String[] args) {
		try {
			validateScore(600);//this will trigger insufficient exception
			
		}
		catch(InvalidScoreException e) {
			System.out.println("caught insufficient exception:"+e.getMessage());
			System.out.println(e);
			System.out.println("program continues after handling the exception");
		}
		
	
		

	}
	}


