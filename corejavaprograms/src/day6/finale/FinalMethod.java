package day6.finale;

public class FinalMethod {

	FinalMethod() {
		System.out.println("This is a default constructor");
	}

	final int a = 50;

	final void show() {
		System.out.println("Value of a: " + a);
	}
}	