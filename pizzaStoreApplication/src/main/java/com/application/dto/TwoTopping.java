package com.application.dto;

import java.util.Scanner;

public class TwoTopping {
	public String cheese = "cheese";
	public String corn = "corn";
	public String panner = "panner";

	public void twoTop() {
		TwoTopping ott = new TwoTopping();

		Scanner twotoppingname = new Scanner(System.in);
		System.out.println(" select from this list  " + '\n' + "1 = cheese and corn" + '\n' + "2 = corn and panner "
				+ '\n' + "3 = panner and cheese  ");
		int top = twotoppingname.nextInt();

		switch (top) {
		case 1:

			System.out.println(ott.cheese + " and " + ott.corn);

			break;
		case 2:

			System.out.println(ott.corn + " and " + ott.panner);
			break;
		case 3:

			System.out.println(ott.panner + " and " + ott.cheese);
			break;
		default:
			System.out.println("please select from above list");
			break;
		}
		twotoppingname.close();
	}
}
