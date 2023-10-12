package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		super();
	}

	
	
	public Apple(String name, String color, float weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}


	@Override
	public String taste() {
		return "Sweet n sour Taste";
	}
	
	public boolean equals(String taste){
		boolean result=false;
		if(this.taste()==taste)
		return true;
		return false;
	}

	
	
	
}
