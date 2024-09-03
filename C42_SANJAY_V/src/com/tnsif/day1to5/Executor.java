package com.tnsif.day1;

public class Executor {
	public static void main(String[] args) {
		
	//accessing same package class
		AccessModifer b1=new AccessModifer();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		
		b1.varDefault=121;
		b1.methodDefault();
		
		b1.varProtected=1;
		b1.methodProtected();
		
		b1.varPublic=4;
		b1.methodPublic();
		
		System.out.println(b1 instanceof AccessModifer); 
		 
		}

}
