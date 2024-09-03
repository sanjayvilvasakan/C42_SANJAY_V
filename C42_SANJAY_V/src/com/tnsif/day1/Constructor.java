package com.tnsif.day1;

public class Constructor {
	
	String name;
	int age;
	String dept;
	
		public Constructor() {
       		System.out.println("Default Constructor");
		}
		
		public Constructor(String ConstructorName, int ConstructorAge, String ConstructorDept) {
			
			this();
			
			System.out.println("Parameterized Constructor");
			this.name = ConstructorName;
			this.age = ConstructorAge;
			this.dept = ConstructorDept;
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "OopsConceptDemo [Name=" + name + ", age=" + age + ", dept=" + dept + "]";
		
	}
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		obj.setName("Abhi");
		obj.setAge(22);
		obj.setDept("CSE");
		System.out.println(obj);
	}	


}
