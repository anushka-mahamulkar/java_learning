/**
 * 
 */
package edu.anushka.java.core.collections;

/**
 * @author MyGuest
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int number = 13;
		System.out.printf(" %d is prime? %s %n", number, isPrime(number));

		for (int i = 0; i < 100; i++) {
			if (isPrime(i).equals("prime")) {
				System.out.printf(" %d is prime? %s %n", i, isPrime(i));
			}
		}

	}

	public static String isPrime(int num) {
		if (num < 0) {
			return "not valid";
		}
		if (num == 0 || num == 1) {
			return "not prime";
		}
		if (num == 2 || num == 3) {
			return "prime number";
		}
		if ((num * num - 1) % 24 == 0) {
			return "prime";
		} else {
			return "not prime";
		}
	}
}

