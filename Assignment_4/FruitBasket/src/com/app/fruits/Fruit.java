package com.app.fruits;

public class Fruit {
	
	String name ;
	String color ;
	float weight;
	boolean isFresh;

	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

public Fruit(String name, String color, float weight, boolean isFresh) {
	super();
	this.name = name;
	this.color = color;
	this.weight = weight;
	this.isFresh = isFresh;
}

public String taste() {
	return "No specific tase";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public boolean isFresh() {
	return isFresh;
}

public void setFresh(boolean isFresh) {
	this.isFresh = isFresh;
}

@Override
public String toString() {
	return "Fruit name=" + name + ", color=" + color + ", weight=" + weight  ;
}



}
