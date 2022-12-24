package com.application.dto;

import java.util.Scanner;

public class Toppings {

	Scanner inputtoppingNumber = new Scanner(System.in);
	public static int top;

	public void ToppingSelection() {

		System.out.println("select number of Topping from 1 to 3 : ");
		top = inputtoppingNumber.nextInt();

		TwoTopping twoTopping = new TwoTopping();
		OneTopping oneTopping = new OneTopping();
		ThreeTopping threeTopping = new ThreeTopping();

		switch (top) {
		case 1:
			oneTopping.oneTop();
			break;
		case 2:
			twoTopping.twoTop();
			break;
		case 3:
			threeTopping.threeTop();
			break;
		default:
			System.out.println("please select minimum 3 topping");
			break;
			
		}
		inputtoppingNumber.close();
	}

	public int price() {
		int i = (top) * 2;
		return i;
	}

	public String printToppingName() {
		if (top == 1) {
			return " ,and,one Topping Pizza";
		} else if (top == 2) {
			return" ,and,two Topping Pizaa";
		} else if (top == 3) {
			return" ,and,Three Topping papaPaneer";
		}else 
			return "error";
	}
}
