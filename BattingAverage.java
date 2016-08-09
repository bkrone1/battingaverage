package com.week.two.day.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BattingAverage {

	static Scanner numberOfAtBats = new Scanner(System.in);
	static float hits;
	static float atBats;
	static float single;
	static float Double;
	static float triple;
	static float homerun;
	static float average;
	static float bases;
	static float slugging;

	public static void main(String[] args) {

		BattingAverage batter = new BattingAverage();
		String name = null;

		batter.print(name);
		batter.calculateAverage();
		batter.calculateSlugging();
		batter.printAll(name);

	}

	public static void print(String name) {

		System.out.println("Please enter the number of at-bats");

		try {

			atBats = numberOfAtBats.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: Must enter valid number");
			System.exit(0);

		}

		if (atBats < 0) {
			System.out.println("ERROR: CANNOT HAVE NEGATIVE at-bats");
			main(null);

		}
		System.out.println("Please enter number of singles");
		single = numberOfAtBats.nextInt();
		if (single < 0) {
			System.out.println("ERROR: Cannot have NEGATIVE at-bats");
			main(null);
		}
		System.out.println("Please enter number of doubles");
		Double = numberOfAtBats.nextInt();
		if (Double < 0) {
			System.out.println("ERROR: Cannot have NEGATIVE at-bats");
			main(null);
		}
		System.out.println("Please enter number of triples");
		triple = numberOfAtBats.nextInt();
		if (triple < 0) {
			System.out.println("ERROR: Cannot have NEGATIVE at-bats");
			main(null);
		}
		System.out.println("Please enter number of Homeruns");
		homerun = numberOfAtBats.nextInt();
		if (homerun < 0) {
			System.out.println("ERROR: Cannot have NEGATIVE at-bats");
			main(null);
		}

	}

	public static float calculateAverage() {
		hits = single + Double + triple + homerun;
		average = ((float) hits / (float) atBats);

		if (hits > atBats) {
			System.out.println("ERROR: Number of hits cannot be greater than number of at-bats");
			main(null);
			return (0);
		} else {
			return average;
		}

	}

	public static float calculateSlugging() {
		bases = single + (Double * 2) + (triple * 3) + (homerun * 4);
		slugging = ((float) bases / (float) atBats);

		return slugging;
	}

	public static void printAll(String name) {

		System.out.printf("Your batting average is %.3f", average);
		System.out.println();
		System.out.printf("Your slugging percentage is %.3f", slugging);
		System.out.println();
		System.out.println();
		main(null);
	}

}
