package com.application.dto;

import java.util.Scanner;

public class OneTopping {

	public  String cheese = "cheese";
	public  String corn = "corn";
	public  String panner = "panner";
	public void oneTop() {
		OneTopping ot = new OneTopping();
		Scanner inputtoppingNumber = new Scanner(System.in);
		System.out.println("select Topping 1= cheese , 2 = corn , 3 = panner ");
		int top = inputtoppingNumber.nextInt();
		switch (top) {
		case 1:

			System.out.println(ot.cheese);
			break;
		case 2:

			System.out.println(ot.corn);
			break;
		case 3:

			System.out.println(ot.panner);
			break;
		default:
			System.out.println("please select from above list");
			break;
		}
		inputtoppingNumber.close();
	}

}
