package org.mnr.aop.model;

public class Circle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	

}
