package foreignExchange;

import java.io.IOException;
import java.util.Scanner;

public class ProcessingClass {
	ExchangeType exType = new ExchangeType();
	
	public void exchangeConverter() throws IOException {	
		Scanner scanner = new Scanner(System.in);
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
	
		do {
			exType.w = inputConsole.inputWon();
			exType.type = inputConsole.inputTpye();
			if (exType.type == ValueClass.EX_TYPE_EXIT) {
				break;
			} else if (exType.type == ValueClass.EX_TYPE_USD) {
				convertToDollar(exType.w);
			} else if (exType.type == ValueClass.EX_TYPE_EUR) {
				convertToEuro(exType.w);
			} else if (exType.type == ValueClass.EX_TYPE_JPY) {
				convertToYen(exType.w);
			} else {
				System.out.println("Invalid Value");
			}
			
		} while (exType.type != ValueClass.EX_TYPE_EXIT);
		scanner.close();

	}
	
	public void convertToDollar(double money) throws IOException {
		FileWriteClass fw = new FileWriteClass();
		
		exType.w = money; // won
		exType.exResult = exType.w / ValueClass.exRate; // exchange result
		System.out.printf("달러로 환전 결과\n");
		exType.d = (int)exType.exResult; // dollar converted from won
		exType.r = exType.exResult - exType.d; // (exchange result) - (dollar converted from won)
		exType.c = (int)(Math.round(exType.r * ValueClass.exRate)/10)*10; // changes in won
		System.out.println("달러 지급 : " + (int)exType.d + " 달러");
		double hundredDollar = exType.d / 100;
		double fifthyDollar = (exType.d % 100) / 50;
		double twentyDollar = (exType.d % 100 % 50) / 20;
		double tenDollar = (exType.d % 100 % 50 % 20) / 10;
		double fiveDollar = (exType.d % 100 % 50 % 20 % 10) / 5;
		double oneDollar = (exType.d % 100 % 50 % 20 % 10 % 5) / 1;
		PrintClass p = new PrintClass();
		p.printDollar(hundredDollar, fifthyDollar, twentyDollar, tenDollar, fiveDollar, oneDollar);
		changeCalculator(exType.c);
		
		fw.dataWrite("USD", exType.w, (int)exType.d, (int)exType.c);
	}
	
	public void convertToEuro(double money) throws IOException {
		FileWriteClass fw = new FileWriteClass();
		
		exType.w = money; // won
		exType.exResult = exType.w / ValueClass.exRate2; // exchange result
		System.out.printf("유로로 환전 결과\n");
		exType.e = (int)exType.exResult; // euro converted from won
		exType.r = exType.exResult - exType.e; // (exchange result) - (euro converted from won)
		exType.c = (int)(Math.round(exType.r * ValueClass.exRate2)/10)*10; // change in won
		System.out.println("유로 지급 : " + (int)exType.e + " 유로");
		double twohundredEuro = exType.e / 200;
		double hundredEuro = (exType.e % 200) / 100;
		double fifthyEuro = (exType.e % 200 % 100) / 50;
		double twentyEuro = (exType.e % 200 % 100 % 50) / 20;
		double tenEuro = (exType.e % 200 % 100 % 50 % 20) / 10;
		double fiveEuro = (exType.e % 200 % 100 % 50 % 20 % 10) / 5;
		PrintClass p = new PrintClass();
		p.printEuro(twohundredEuro, hundredEuro, fifthyEuro, twentyEuro, tenEuro, fiveEuro);
		changeCalculator(exType.c);
		
		fw.dataWrite("EUR", exType.w, (int)exType.e, (int)exType.c);
	}
	
	public void convertToYen(double money) throws IOException {
		FileWriteClass fw = new FileWriteClass();
		
		exType.w = money; // won
		exType.exResult = exType.w / ValueClass.exRate3;
		System.out.printf("엔화로 환전 결과\n");
		exType.y = (int)exType.exResult; // yen converted from won
		exType.r = exType.exResult - exType.y; // (exchange result) - (yen converted from won)
		exType.c = (int)(Math.round(exType.r * ValueClass.exRate3)/10)*10; // change in won
		System.out.println("엔화 지급 : " + (int)exType.y + " 엔화");
		double tenthousandYen = exType.y / 10000;
		double twothousandYen = (exType.y % 10000) / 2000;
		double thousandYen = (exType.y % 10000 % 2000) / 1000;
		double fivehundredYen = (exType.y % 10000 % 2000 % 1000) / 500;
		double hundredYen = (exType.y % 10000 % 2000 % 1000 % 500) / 100;
		double fifthyYen = (exType.y % 10000 % 2000 % 1000 % 500 % 100) / 50;
		double tenYen = (exType.y % 10000 % 2000 % 1000 % 500 % 100 % 50) / 10;
		double fiveYen = (exType.y % 10000 % 2000 % 1000 % 500 % 100 % 50 % 10) / 5;
		double oneYen = (exType.y % 10000 % 2000 % 1000 % 500 % 100 % 50 % 10 % 5) / 1;
		PrintClass p = new PrintClass();
		p.printYen(tenthousandYen, twothousandYen, thousandYen, fivehundredYen, hundredYen, fifthyYen, tenYen, fiveYen, oneYen);
		changeCalculator(exType.c);
		
		fw.dataWrite("JPY", exType.w, (int)exType.y, (int)exType.c);
	}
	
	public void changeCalculator(double d) {
		exType.c = d;
		System.out.println("원화 거스름 : " + (int)exType.c + " 원");
		double fifthythousandWon = exType.c / 50000;
		double tenthousandWon = (exType.c % 50000) / 10000;
		double fivethousandWon = (exType.c % 50000 % 10000) / 5000;
		double thousandWon = (exType.c % 50000 % 10000 % 5000) / 1000;
		double fivehundredWon = (exType.c % 50000 % 10000 % 5000 % 1000) / 500;
		double hundredWon = (exType.c % 50000 % 10000 % 5000 % 1000 % 500) / 100;
		double fifthyWon = (exType.c % 50000 % 10000 % 5000 % 1000 % 500 % 100) / 50;
		double tenWon = (exType.c % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50) / 10;
		
		PrintClass p = new PrintClass();
		p.printChange(fifthythousandWon, tenthousandWon, fivethousandWon,
				thousandWon, fivehundredWon, hundredWon, fifthyWon, tenWon);
	}
}
