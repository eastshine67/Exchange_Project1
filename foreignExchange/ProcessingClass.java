package foreignExchange;

import java.util.Scanner;

public class ProcessingClass {
	
	public void exchangeConverter() {	
		Scanner scanner = new Scanner(System.in);
//		double w; // intput money in won
//		int type;
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		
		ExchangeType exType = new ExchangeType();
		
		do {
			exType.w = inputConsole.inputWon();
			exType.type = inputConsole.inputTpye();
			ProcessingClass pc = new ProcessingClass();
			if (exType.type == ValueClass.EX_TYPE_EXIT) {
				break;
			} else if (exType.type == ValueClass.EX_TYPE_USD) {
				pc.convertToDollar(exType.w);
			} else if (exType.type == ValueClass.EX_TYPE_EUR) {
				pc.convertToEuro(exType.w);
			} else if (exType.type == ValueClass.EX_TYPE_JPY) {
				pc.convertToYen(exType.w);
			} else {
				System.out.println("Invalid Value");
			}
		} while (exType.type != ValueClass.EX_TYPE_EXIT);
		scanner.close();
		
		FileWriteClass  fw = new FileWriteClass();
		fw.srt1(exType.type, exType.w);

	}
	public void convertToDollar(double money) {
		double w = money; // won
		double exResult; // exchange result
		exResult = w / ValueClass.exRate;
		System.out.printf("달러로 환전 결과\n");
		double d = (int)exResult; // dollar converted from won
		double r = exResult - d; // (exchange result) - (dollar converted from won)
		double c = (int)(Math.round(r * ValueClass.exRate)/10)*10; // change in won
		System.out.println("달러 지급 : " + (int)d + " 달러");
		double hundredDollar = d / 100;
		double fifthyDollar = (d % 100) / 50;
		double twentyDollar = (d % 100 % 50) / 20;
		double tenDollar = (d % 100 % 50 % 20) / 10;
		double fiveDollar = (d % 100 % 50 % 20 % 10) / 5;
		double oneDollar = (d % 100 % 50 % 20 % 10 % 5) / 1;
		PrintClass p = new PrintClass();
		p.printDollar(hundredDollar, fifthyDollar, twentyDollar, tenDollar, fiveDollar, oneDollar);
		changeCalculator(c);
	}
	public void convertToEuro(double money) {
		double w = money; // won
		double exResult; // exchange result
		exResult = w / ValueClass.exRate2;
		System.out.printf("유로로 환전 결과\n");
		double e = (int)exResult; // euro converted from won
		double r = exResult - e; // (exchange result) - (euro converted from won)
		double c = (int)(Math.round(r * ValueClass.exRate2)/10)*10; // change in won
		System.out.println("유로 지급 : " + (int)e + " 유로");
		double twohundredEuro = e / 200;
		double hundredEuro = (e % 200) / 100;
		double fifthyEuro = (e % 200 % 100) / 50;
		double twentyEuro = (e % 200 % 100 % 50) / 20;
		double tenEuro = (e % 200 % 100 % 50 % 20) / 10;
		double fiveEuro = (e % 200 % 100 % 50 % 20 % 10) / 5;
		PrintClass p = new PrintClass();
		p.printEuro(twohundredEuro, hundredEuro, fifthyEuro, twentyEuro, tenEuro, fiveEuro);
		changeCalculator(c);
	}	
	public void convertToYen(double money) {
		double w = money; // won
		double exResult; // exchange result
		exResult = w / ValueClass.exRate3;
		System.out.printf("엔화로 환전 결과\n");
		double y = (int)exResult; // yen converted from won
		double r = exResult - y; // (exchange result) - (yen converted from won)
		double c = (int)(Math.round(r * ValueClass.exRate3)/10)*10; // change in won
		System.out.println("엔화 지급 : " + (int)y + " 엔화");
		double tenthousandYen = y / 10000;
		double twothousandYen = (y % 10000) / 2000;
		double thousandYen = (y % 10000 % 2000) / 1000;
		double fivehundredYen = (y % 10000 % 2000 % 1000) / 500;
		double hundredYen = (y % 10000 % 2000 % 1000 % 500) / 100;
		double fifthyYen = (y % 10000 % 2000 % 1000 % 500 % 100) / 50;
		double tenYen = (y % 10000 % 2000 % 1000 % 500 % 100 % 50) / 10;
		double fiveYen = (y % 10000 % 2000 % 1000 % 500 % 100 % 50 % 10) / 5;
		double oneYen = (y % 10000 % 2000 % 1000 % 500 % 100 % 50 % 10 % 5) / 1;
		PrintClass p = new PrintClass();
		p.printYen(tenthousandYen, twothousandYen, thousandYen, fivehundredYen, hundredYen, fifthyYen, tenYen, fiveYen, oneYen);
		changeCalculator(c);
	}
	public void changeCalculator(double d) {
		double c = d;
		System.out.println("원화 거스름 : " + (int)c + " 원");
		double fifthythousandWon = c / 50000;
		double tenthousandWon = (c % 50000) / 10000;
		double fivethousandWon = (c % 50000 % 10000) / 5000;
		double thousandWon = (c % 50000 % 10000 % 5000) / 1000;
		double fivehundredWon = (c % 50000 % 10000 % 5000 % 1000) / 500;
		double hundredWon = (c % 50000 % 10000 % 5000 % 1000 % 500) / 100;
		double fifthyWon = (c % 50000 % 10000 % 5000 % 1000 % 500 % 100) / 50;
		double tenWon = (c % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50) / 10;
		
		PrintClass p = new PrintClass();
		p.printChange(fifthythousandWon, tenthousandWon, fivethousandWon,
				thousandWon, fivehundredWon, hundredWon, fifthyWon, tenWon);
	}
}
