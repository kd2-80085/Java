package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		super();
	}

	public Orange(String name, String color, float weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}
	
	@Override
	public String taste() {
		return "Sour Taste";
	}

	
	public boolean equals(String taste){
		boolean result=false;
		if(this.taste()==taste)
		return true;
		return false;
	}

}
