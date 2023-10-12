package Tester;

import java.util.Scanner;
import com.app.fruits.*;

public class Tester {

	static int menu() {
		int choice = 0;
		System.out.println("**************** MENU ***************");
		System.out.println("0.EXIT ");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display all fruits");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits");
		System.out.println("6. Display tastes of all stale(not fresh) fruits");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		System.out.println("*************************************");
		System.out.println("Enter your choice :");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, counter = 0, n;
		Fruit basket[] = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("How many fruits you want to add in basket :");
		n = sc.nextInt();
		basket = new Fruit[n];

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (counter >= 0 && counter < n)
					basket[counter++] = new Mango("Mango", "Yellow", 300, true);
				else
					System.out.println("Basket is Full ");
				break;

			case 2:
				if (counter >= 0 && counter < n)
					basket[counter++] = new Orange("Orange", "Orange", 200, true);
				else
					System.out.println("Basket is Full ");
				break;

			case 3:
				if (counter >= 0 && counter < n)
					basket[counter++] = new Apple("Apple", "Red", 250, true);
				else
					System.out.println("Basket is Full ");
				break;
			case 4:
				System.out.println("Fruits in the basket are : ");
				if(counter!=0) {
				for (Fruit fruit : basket) {
					if (fruit != null)
						System.out.print(fruit.getName() + "		");
					
				}
				}
				else
					System.out.print("Basket is Empty");
				System.out.println();

				break;
			case 5:
				for (Fruit fruit : basket) {
					if (fruit != null) {
						System.out.println(fruit.toString());
						if (fruit instanceof Mango) {
							Mango mango = (Mango) fruit;
							System.out.println(mango.taste());
						} else if (fruit instanceof Apple) {
							Apple apple = (Apple) fruit;
							System.out.println(apple.taste());
						} else if (fruit instanceof Orange) {
							Orange orange = (Orange) fruit;
							System.out.println(orange.taste());
						}
						if (fruit.isFresh()) {
							System.out.println("Fruit is Fresh");
						} else {
							System.out.println("Fruit is Stale");
						}
					} else
						System.out.print("Fruits Basket is empty");
				}

				break;
			case 6:
				for (Fruit fruit : basket) {
					if (fruit != null) {
						if (!fruit.isFresh()) {
							System.out.println("Stale");
							System.out.println(fruit.taste());
						} else
							System.out.println("All fruits are fresh in the basket");

					} else
						System.out.print("Fruits Basket is empty");
				}

				break;
				
			case 7:
				int index;
				System.out.println("Enter index to make fruit stale in the basket :");
				index = sc.nextInt();
				if(index>=0 && index <n) {
				if (basket[index] != null) {
					if (basket[index].isFresh()) 
					{
						basket[index].setFresh(false);//making fruit stale
						}
						else
						System.out.println("Fruit is already stale");
				}
				else
						System.out.print("Fruits Basket is empty");
				}else 
					System.out.print("Invalid index enter correct index");
				
				break;
				
			case 8:			
				for (Fruit fruit : basket) {
				if (fruit != null) {
					if (fruit instanceof Mango) 
					{
						Mango mango = (Mango) fruit;
						if(mango.equals("Sour Taste"))
						{
							fruit.setFresh(false);
						}
						
					} else if (fruit instanceof Apple) {
						Apple apple = (Apple) fruit;
						if(apple.equals("Sour Taste"))
						{
							fruit.setFresh(false);
						}
					} else if (fruit instanceof Orange)
						{
							Orange orange = (Orange) fruit;
							if(orange.equals("Sour Taste"))
							{
							fruit.setFresh(false);
							}				
						}
					
				}
				}

				break;

			}
		}
	}

}


//8. Mark all sour fruits stale (optional)
//eg : for-each , taste --equals(String)
