package com.evergent.corejava.rakshitha.application4;

class Vegetable extends Category 
{
	
   public Vegetable(String name, int price) {
        super(name, price);
    }
   //overriding method
   public String getName() {
       return name;
   }
}