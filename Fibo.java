package big0Homework;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("Fibonacci of " + num + " is " + findFibo(num));
		System.out.println("\n");
		System.out.println("Time complexity: 0(n)");

	}

	public static int findFibo(int number) {
		if (number == 1 || number == 0) {
			return number;
		}
		int previous = 0;
		int current = 1;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			sum = previous + current;
			previous = current;
			current = sum;
		}
		return sum;
	}

}
