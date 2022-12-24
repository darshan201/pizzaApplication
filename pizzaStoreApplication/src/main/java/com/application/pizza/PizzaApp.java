package com.application.pizza;

import com.application.pizzaService.CreatePizza;

public class PizzaApp {

	public static void main(String[] args) {
		CreatePizza create = new CreatePizza();
		create.createPizza();
		create.printPizzaName();
		create.Totalprice();
	}
}
