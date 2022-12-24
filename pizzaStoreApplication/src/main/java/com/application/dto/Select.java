package com.application.dto;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Select {
	enum topping {
		cheese, panner, corn, spinach, olives;
	}

	String adtopping;
	public static int topp;

	public void toppping() {
		System.out.println("selct TOPPING from this : cheese  panner  corn  spinach  olives");
		List<topping> list = new LinkedList<>();
		Scanner addtopping = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {

			adtopping = addtopping.next();
			switch (adtopping) {
			case "cheese":
				list.add(topping.cheese);

				break;
			case "panner":
				list.add(topping.panner);

				break;
			case "corn":
				list.add(topping.corn);

				break;
			case "spinach":
				list.add(topping.spinach);

				break;
			case "olives":
				list.add(topping.olives);

				break;
			case "exit":
				i = 4;
				break;
			default:
				break;
			}

		}

		topp = (list.size() * 2);
		addtopping.close();
		System.out.println("your selcted toping is below : " + '\n');
		for (topping s : list) {
			System.out.println(s);
		}

	}
}
