package org.mnr.aop.service;

import org.mnr.aop.model.Circle;
import org.mnr.aop.model.Rectangle;
import org.mnr.aop.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	private Rectangle retangle;
	public Rectangle getRetangle() {
		return retangle;
	}
	public void setRetangle(Rectangle retangle) {
		this.retangle = retangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShapeService [circle=");
		builder.append(circle);
		builder.append(", triangle=");
		builder.append(triangle);
		builder.append(", retangle=");
		builder.append(retangle);
		builder.append("]");
		return builder.toString();
	}
	

}
