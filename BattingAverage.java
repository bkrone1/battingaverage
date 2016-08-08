package com.week.two.day.one;

import java.util.Scanner;

public class BattingAverage {
	static Scanner numberOfAtBats = new Scanner(System.in);
	static double hits;
	static double atBats;
	static double single;
	static double Double;
	static double triple;
	static double homerun;
	static double average;
	static double bases;
	static double slugging;

	public static void main(String[] args) {
		BattingAverage batter = new BattingAverage();
		String name = null;

		batter.print();
		batter.calculateAverage();
		batter.calculateSlugging();
		batter.printAll(name);

	}

	public static void print() {

		System.out.println("Please enter the number of at-bats");
		atBats = numberOfAtBats.nextInt();
		
		if(atBats < 0){
	System.out.println("ERROR: CANNOT HAVE NEGATIVE at-bats");
	System.exit(0);
	
		}
		System.out.println("Please enter numer of singles");
		single = numberOfAtBats.nextInt();
		System.out.println("Please enter number of doubles");
		Double = numberOfAtBats.nextInt();
		System.out.println("Please enter number of triples");
		triple = numberOfAtBats.nextInt();
		System.out.println("Please enter number of Homeruns");
		homerun = numberOfAtBats.nextInt();


	

	}

	public static double calculateAverage() {
		hits = single + Double + triple + homerun;
		average = ((double) hits / (double) atBats);
		
		if (hits > atBats){
			System.out.println("ERROR: Number of hits cannot be greater than number of at-bats");
			
			System.exit(0);
			return(0);
		}else{
		return average;
		}

	}

	public static double calculateSlugging() {
		bases = single + (Double * 2) + (triple * 3) + (homerun * 4);
		slugging = ((double) bases / (double) atBats);
		
		return slugging;
	}

	public void printAll(String name) {

		System.out.printf("Your average is %.3f" , average);
		System.out.println();
		System.out.printf("Your slugging percentage is %.3f" , slugging);
	}

}
