package com.multilevel;

public class Child extends ParentClass {
	public void sQLCourse() {
		System.out.println("SQL Course");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.sQLCourse();
		c.javaCourse();
		c.courseDetails();
	}

}
