package foreignExchange;

public class PrintClass {
	public void printDollar(double hundredDollar, double fifthyDollar , double twentyDollar, double tenDollar,
			double fiveDollar, double oneDollar) {
		System.out.println("달러 거스름");
		System.out.println("100 달러 : " + (int)hundredDollar);
		System.out.println("50 달러 : " + (int)fifthyDollar);
		System.out.println("20 달러 : " + (int)twentyDollar);
		System.out.println("10 달러 : " + (int)tenDollar);
		System.out.println("5 달러 : " + (int)fiveDollar);
		System.out.println("1 달러 : " + (int)oneDollar);
	}
	public void printEuro(double twohundredEuro, double hundredEuro, double fifthyEuro , double twentyEuro ,
			double tenEuro , double fiveEuro) {
		System.out.println("유로 거스름");
		System.out.println("200 유로 : " + (int)twohundredEuro);
		System.out.println("100 유로 : " + (int)hundredEuro);
		System.out.println("50 유로 : " + (int)fifthyEuro);
		System.out.println("20 유로 : " + (int)twentyEuro);
		System.out.println("10 유로 : " + (int)tenEuro);
		System.out.println("5 유로 : " + (int)fiveEuro);
	}
	public void printYen(double tenthousandYen, double twothousandYen, double thousandYen, double fivehundredYen,
			double hundredYen, double fifthyYen, double tenYen, double fiveYen, double oneYen) {
		System.out.println("엔화 거스름");
		System.out.println("10000 엔 : " + (int)tenthousandYen);
		System.out.println("2000 엔 : " + (int)twothousandYen);
		System.out.println("1000 엔 : " + (int)thousandYen);
		System.out.println("500 엔 : " + (int)fivehundredYen);
		System.out.println("100 엔 : " + (int)hundredYen);
		System.out.println("50 엔 : " + (int)fifthyYen);
		System.out.println("10 엔 : " + (int)tenYen);
		System.out.println("5 엔 : " + (int)fiveYen);
		System.out.println("1 엔 : " + (int)oneYen);
	}
	public void printChange(double fifthythousandWon, double tenthousandWon, double fivethousandWon,
			double thousandWon,double fivehundredWon, double hundredWon, double fifthyWon, double tenWon) {
		System.out.println("원화 거스름");
		System.out.println("50000 원 : " + (int)fifthythousandWon);
		System.out.println("10000 원 : " + (int)tenthousandWon);
		System.out.println("5000 원 : " + (int)fivethousandWon);
		System.out.println("1000 원 : " + (int)thousandWon);
		System.out.println("500 원 : " + (int)fivehundredWon);
		System.out.println("100 원 : " + (int)hundredWon);
		System.out.println("50 원 : " + (int)fifthyWon);
		System.out.println("10 원 : " + (int)tenWon);
	}

}
