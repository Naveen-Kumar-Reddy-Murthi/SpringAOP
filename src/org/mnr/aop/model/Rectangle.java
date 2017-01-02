package org.mnr.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Rectangle {
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
		builder.append("Rectangle [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
