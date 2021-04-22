package foreignExchange;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type '1' for WON -> USD\nType '2' for USD -> WON");
		int option = scanner.nextInt();
		
		if (option == 1) {
			System.out.println("Amount?");
			int won = scanner.nextInt();
			double usd = 1124.50;
			
			System.out.println((Math.round(won / usd)) + " dollars");
			System.out.println("Exchange rate : 1124.50");
			
		} else if (option == 2) {
			System.out.println("Amount?");
			int usd = scanner.nextInt();
			double won = 1124.50;
			
			System.out.println((int)(Math.round(won * usd)/10)*10 + " won");
			System.out.println("Exchange rate : 1124.50");
		} else {
			System.out.println("Not Valid Value");
		}
	}
}
