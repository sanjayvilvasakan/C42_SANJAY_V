package com.tnsif.day13;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(5, "First");
		ChildThread threadTwo = new ChildThread(10, "Second");

		threadOne.start();
		//threadOne.start();
		// threadOne.run(); 
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}
