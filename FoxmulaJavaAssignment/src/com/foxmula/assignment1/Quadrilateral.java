package com.foxmula.assignment1;

import java.util.Scanner;

public class Quadrilateral {
	
int x0, y0, x1, y1, x2, y2, x3, y3;
	
	void set (int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
}

class Square extends Quadrilateral
{
	Square (int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		set (x0, y0, x1, y1, x2, y2, x3, y3);
	}
	
	int area()
	{
		int side = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		return side*side;
	}
}

class Rectangle extends Quadrilateral
{
	Rectangle (int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		set (x0, y0, x1, y1, x2, y2, x3, y3);
	}
	
	int area()
	{
		int side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		int side2 = (int)Math.sqrt((x0-x3)*(x0-x3) + (y0-y3)*(y0-y3));
		return side1*side2;
	}
}

class Trapezoid extends Quadrilateral
{
	int height;
	Trapezoid (int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3, int height)
	{
		set (x0, y0, x1, y1, x2, y2, x3, y3);
		this.height = height;
	}
	
	int area()
	{
		int side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		int side2 = (int)Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
		int res = (int) ((side1 + side2)*height)/2;
		return res;
	}
}

class Parallelogram extends Quadrilateral
{
	int height;
	Parallelogram (int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3, int height)
	{
		set (x0, y0, x1, y1, x2, y2, x3, y3);
		this.height = height;
	}
	
	int area()
	{
		int side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		int res = (int) (side1*height);
		return res;
	}
}

 class MainClass
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		int result;
		int x0, y0, x1, y1, x2, y2, x3, y3, h;
		System.out.println("Enter the coordinates of the quadilateral");
		x0 = sc.nextInt();
		y0 = sc.nextInt();
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		
		Square obj1 = new Square(x0, y0, x1, y1, x2, y2, x3, y3);
		result = obj1.area();
		System.out.println("The area of the square is" + result);
		
		Rectangle obj2 = new Rectangle(x0, y0, x1, y1, x2, y2, x3, y3);
		result = obj2.area();
		System.out.println("The area of the rectangle is" + result);
		
		System.out.println("Enter the height");
		h = sc.nextInt();
		
		Trapezoid obj3 = new Trapezoid(x0, y0, x1, y1, x2, y2, x3, y3,h);
		result = obj3.area();
		System.out.println("The area of the trapezoid is" + result);
		
		Parallelogram obj4 = new Parallelogram(x0, y0, x1, y1, x2, y2, x3, y3,h);
		result = obj4.area();
		System.out.println("The area of the parallelogram is" + result);
		sc.close();
	}
}
