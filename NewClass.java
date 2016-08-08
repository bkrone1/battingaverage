package com.week.two.day.one;

import java.util.ArrayList;
import java.util.HashMap;

public class NewClass {

	public static void main(String[] args) {
		
	HashMap cars = new HashMap<>();
	
	cars.put("Sonic", "Chevy");
	cars.put("Malibu", "Chevy");
	cars.put("F-150", "Ford");
	cars.put("F-250", "Ford");
		
	System.out.println(cars.get("Sonic"));
	
	}
}
