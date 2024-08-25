package com.evergent.corejava.strings.immutable;

public class PersonImmutable {
		// TODO Auto-generated method stub
		private final String name;
		private final int age;
		
		//constructor to initialize the final fields
		public PersonImmutable(String name,int age) {
			this.name=name;
			this.age=age;
			
		}
		public String myName() {
			//name="chinni";
			return name;
			
		}
		public int myAge() {
			return age;
		}

	}


