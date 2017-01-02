package org.mnr.aop.model;

public class Triangle {
	
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
		builder.append("Triangle [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
