package ejemplo02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // scanner for input

		boolean continueLoop = true; // determines if more input is needed
		do {
			try // read two numbers and calculate quotient
			{
				System.out.print("Please enter an integer numerator: ");
				int numerator = sc.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = sc.nextInt();
				int result = dividir(numerator, denominator);
				System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
				continueLoop = false; // input successful; end looping
			} // end try
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("\nException: %s\n", inputMismatchException);
				sc.nextLine(); // discard input so user can try again
				System.out.println("You must enter integers. Please try again.\n");
			} // end catch
			catch (ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("Zero is an invalid denominator. Please try again.\n");
			} // end catch
		} while (continueLoop); // end do...while

	}

	public static int dividir(int numerator, int denominator) {
		return numerator / denominator; // possible division by zero
	} // end method quotient

}
