package com.application.dto;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ThreeTopping {
	public String[] ThreeToppingName = {"cheese", "corn", "panner"}; 
	  String result = Arrays.stream(ThreeToppingName).collect(Collectors.joining(", "));
	public void threeTop() {
		System.out.println(  "This is the Three Topping you  have selected   = "+ result);
	}
}
