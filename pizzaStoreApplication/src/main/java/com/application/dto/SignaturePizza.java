package com.application.dto;

import java.util.Scanner;

public class SignaturePizza {
	public int sizeprice;
	public String pizzasize;
	Scanner SelectStyle = new Scanner(System.in);

	public void size() {
		System.out.println("select Size 1 = small ,2 = medium , 3 = large ");
		int style = SelectStyle.nextInt();
		switch (style) {
		case 1:
			pizzasize = " Small pizaz ";
			sizeprice = 12;
			break;

		case 2:
			pizzasize = " Medium pizza";
			sizeprice = 14;
			break;
		case 3:
			pizzasize = " Large pizza";
			sizeprice = 16;
			break;
		default:
			System.out.println("please select valid size from the list ");
		}

		Select select = new Select();
		select.toppping();

		SelectStyle.close();
	}

}
