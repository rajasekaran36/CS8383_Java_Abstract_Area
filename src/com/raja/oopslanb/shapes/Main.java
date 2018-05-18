package com.raja.oopslanb.shapes;

import java.util.Scanner;

abstract class Shape{
	double length = 0.0;
	double hight = 0.0;
	public abstract void printArea();
}

class Rectangle extends Shape{
	double area = 0.0;
	@Override
	public void printArea() {
		System.out.println("\nRectangle");
		System.out.println("---------\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length of Rectangle : ");
		this.length = input.nextDouble();
		System.out.println("Enter Breadth of Rectangle : ");
		this.hight = input.nextDouble();
		this.area = this.length * this.hight;
		System.out.println("Area of the Rectangle is : "+this.area);
	}
	
}

class Triangle extends Shape{
	double area = 0.0;
	@Override
	public void printArea() {
		System.out.println("\nTriangle");
		System.out.println("---------\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length of Triangle : ");
		this.length = input.nextDouble();
		System.out.println("Enter Hight of Triangle : ");
		this.hight = input.nextDouble();
		this.area = 0.5 * this.length * this.hight;
		System.out.println("Area of the Triangle is : "+this.area);
	}
	
}

class Circle extends Shape{
	double area = 0.0;
	@Override
	public void printArea() {
		System.out.println("\nCircle");
		System.out.println("-------\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius of Circle : ");
		this.length = input.nextDouble();
		this.area = Math.PI * this.length * this.length;
		System.out.println("Area of the Circle is : "+this.area);
	}
	
}

public class Main {
	public static void main(String[] args) {
		Shape r = new Rectangle();
		r.printArea();
		Shape t = new Triangle();
		t.printArea();
		Shape c = new Circle();
		c.printArea();
	}
}
