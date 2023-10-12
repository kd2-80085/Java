package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String name, String color, float weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}
		
	@Override
	public String taste() {
		return "Sweet Taste";
	}
	public boolean equals(String taste){
		boolean result=false;
		if(this.taste()==taste)
		return true;
		return false;
	}

	

}
