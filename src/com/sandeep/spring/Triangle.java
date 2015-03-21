package com.sandeep.spring;

public class Triangle {

	Point pointA;
	Point pointB;
	Point pointC;
	
	public void draw()
	{
		System.out.println("Triangle is Drawn");
		System.out.println("PointA "+ pointA.getX() + ":" + pointA.getY());
		System.out.println("PointB "+ pointB.getX() + ":" + pointC.getY());
		System.out.println("PointC "+pointC.getX() + ":" + pointC.getY());
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}	
}
