package com.app.geometry;
import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	double x;
	double y;
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point2D() {
		
	}
	
	
	public String displayPoint() { 
		String x=String.valueOf(this.x);
		String y=String.valueOf(this.y);
		String point="("+x+","+y+")";
		return point;
	}
	
	public boolean isEqual(Point2D p2) {
		if((this.x==p2.x)&&(this.y==p2.y))
			return true;
		else
			return false;
	}
	
	public int calculateDistance(Point2D p1) {
		int distance;
		distance=(int) Math.sqrt(
				(Math.pow((this.x-p1.x),2.0) + Math.pow((this.y-p1.y),2.0))
				);
		return distance;	
	}	
	
	public void  acceptCoordinates() { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x coordinate : ");
		this.x=sc.nextDouble();
		System.out.println("Enter y coordinate : ");
		this.y=sc.nextDouble();
		}
	
	
}
