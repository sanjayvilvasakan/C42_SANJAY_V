package com.tnsif.day9;

final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

class FinalChildClass extends FinalClass {
}

public class FinalClassDemo {
	public static void main(String[] args) {
		FinalClassDemo f1 = new FinalClassDemo();
		f1.show();
	}
}
