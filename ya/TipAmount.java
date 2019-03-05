package tipamount;

import java.util.Scanner;

public class TipAmount {
	public static void main(String[] args) {

		Scanner yal = new Scanner(System.in);
		System.out.println("Enter your bill amount here: ");
		float billAmount = yal.nextInt();

		System.out.println("Rate the quality of service from 0 to 10");
		int serviceQuality = yal.nextInt();

		double tipAmount = calculateTipAmount(billAmount, serviceQuality);

		double totalamount = calculateTotalAmount(billAmount,tipAmount);

	}

	public static double calculateTipAmount(float billAmount, int serviceQuality) {

		double tipAmount = 0;

		if (serviceQuality <= 3 && serviceQuality > -1) {
			System.out.println(" Total bill with no tip = " + " " + billAmount);

		} else if (serviceQuality > 3 && serviceQuality <= 7) {
			float tip = (float) (0.10 * billAmount);
			System.out.println("Total bill with 10 % tip =" + " " + (tip + billAmount));

		} else if (serviceQuality >= 8 && serviceQuality <= 10) {
			float tip = (float) (0.15 * billAmount);
			System.out.println("Total bill with 15% tip =" + (tip + billAmount));
		}

		else {
			System.out.println("Invalid input. Enter the value again.Thank you.");
		}
		return tipAmount;
	}

	public static double calculateTotalAmount(float billAmount, double tipAmount) {
		double totalAmount = billAmount+tipAmount;
		return totalAmount;

	}
}
