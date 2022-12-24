package com.application.pizzaService;

import java.util.Scanner;

import com.application.dto.*;

public class CreatePizza {
	MargaritaPizza margaritaPizza = new MargaritaPizza();
	VeggiePizaa veggiePizaa = new VeggiePizaa();
	PapaPaneer papaPaneer = new PapaPaneer();
	Toppings toppings = new Toppings();
	SignaturePizza signaturePizza = new SignaturePizza();
	Select select = new Select();

	int pizza;

	public void createPizza() {

		System.out.println("select pizza 1 = margaritaPizza 2= veggiePizaa 3 = papaPaneer 4 = signaturePizza");
		Scanner inputpizzatype = new Scanner(System.in);
		pizza = inputpizzatype.nextInt();

		switch (pizza) {
		case 1:
			margaritaPizza.margaritaPizzaPrice();

			break;
		case 2:
			veggiePizaa.veggiePizaaPizzaPrice();
			break;
		case 3:
			papaPaneer.papaPaneerPizzaPrice();
			break;
		case 4:
			signaturePizza.size();
			break;
		default:
			System.out.println("please select from above options");
			createPizza();
			break;
		}
		inputpizzatype.close();
	}

	public void printPizzaName() {

		if (pizza == 1) {
			System.out.println("margaritaPizza" + toppings.printToppingName());
		} else if (pizza == 2) {
			System.out.println("veggiePizaa" + toppings.printToppingName());
		} else if (pizza == 3) {
			System.out.println("papaPaneer" + toppings.printToppingName());
		} else if (pizza == 4) {
			System.out.println("  Selected pizza ::  signature piZZA " + signaturePizza.pizzasize);
		}
	}

	public int baseprice() {
		int basepizzaprice = 12;
		return basepizzaprice;
	}

	public void Totalprice() {
		if (pizza == 1 || pizza == 2 || pizza == 3) {
			System.out.println('\n' + "pizza base price is :" + baseprice() + "$  and each TOPPING 2$ " + '\n');
			double tax = ((13 * (baseprice() + toppings.price())) / 100);
			System.out.println("TAX : " + tax);
			System.out.println("TOTAL PRICE OF PIZZA IS : " + ((baseprice() + toppings.price()) + tax) + "$");
		} else {
			System.out.println("Base price : " + signaturePizza.sizeprice + " topping price is : " + Select.topp);

			double tax = ((0.13 * (signaturePizza.sizeprice + Select.topp)));
			System.out.println("Tax : " + tax);
			System.out.println("TOTAL PRICE OF PIZZA IS : " + " " + (signaturePizza.sizeprice + Select.topp + tax));
		}
	}
}
