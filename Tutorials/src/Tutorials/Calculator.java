package Tutorials;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("/......Calculator Menu....../");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 for finding Square");
		System.out.println("Press 6 for finding Square root");
		System.out.println("Press 7 for finding Reciprocal");
		
		System.out.println("Display Numpad");
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		System.out.println("Enter the first number");
		
		int num2 = scanner.nextInt();
		System.out.println("Enter the second number");
		
		double num11 = scanner.nextDouble();
		int op = 0;
	if (op == 5) {
		System.out.println(num1 * num2);
	}
	else if (op == 6) {
		System.out.println(Math.sqrt(num11));
	}
	else if (op == 7) {
		System.out.println(1/num11);
	}
	else if (op == 4) {
		System.out.println(num11/num2);
	}
	else if (op == 3) {
		System.out.println(num11 * num2);
	}
	else if (op == 2) {
		System.out.println(num11 - num2);
	}
	else if (op == 1) {
		System.out.println(num11 + num2);
	}
	else {
		System.out.println("To continue Press 1");
	}
		







	}

}
