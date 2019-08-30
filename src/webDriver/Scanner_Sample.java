package webDriver;

import java.util.Scanner;

public class Scanner_Sample {

	public static void main(String[] args) {
		// Two number addition

		int a;//= 90;
		int b;//= 80;
		int c;
		
		System.out.println(" Please enter two integers values: ");
		System.out.println("***************************************");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		
		c = a + b;
		System.out.println(c);

	}

}
