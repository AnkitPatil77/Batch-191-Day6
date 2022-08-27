package com.bridgelab;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int Number, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();

		for (int i = 1; i <= Number; i++) {
			if (Number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(Number + " is a prime Number");
		} else {
			System.out.println(Number + " is NOT a prime Number");
		}
	}
}