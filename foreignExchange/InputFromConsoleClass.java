package foreignExchange;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null;
	
		public InputFromConsoleClass() {
			scanner = new Scanner(System.in);
		}
		
		public double inputWon() {
			System.out.println("받은 원화 입력 : ");
			int w;
			w = scanner.nextInt();
		
			return w;
		}
	
		public int inputTpye() {
			System.out.println("환전할 종류 선택(1:USD, 2:EUR, 3:JPY, 0:EXIT) ?");
			int type;
			type = scanner.nextInt();
		
			return type;
	}
}
