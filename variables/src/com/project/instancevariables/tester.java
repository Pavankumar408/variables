package com.project.instancevariables;

public class tester {
	public static void main(String[]args) {
		car car=new car();
		car.name="tata";
		car.model="punch";
		car.color="black";
		car.capacity=5;
		car.cost=800000;
		car.isairbagprovided=true;
		System.out.println("name is="+car.name);
		System.out.println("model is="+car.model);
		System.out.println("color is="+car.color);
		System.out.println("capacity is="+car.capacity);
		System.out.println("cost is="+car.cost);
		System.out.println("is there airbag="+car.isairbagprovided);
		car.travel();
		car.carrylaugauges();
	}

}
