package Tutorials;
import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input your age: ");
Scanner sc = new Scanner(System.in);
String str = sc.next();
// str = "hello";
int age = Integer.parseInt(str);
if (age >= 18) {
System.out.println("You're an adult");
	}
else if (age >= 13); {
	System.out.println("You're a teenager");
}
else {
	System.out.println("You are a minor!");
}
}
}