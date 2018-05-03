import java.util.Random;
import java.util.Scanner;

public class PsswordClass2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int userInput = s.nextInt();

		for (int i = 0; i <= userInput; i++) {
			
			randomCalcOneTwo();
		}
		s.close();
	}
	
	public static void randomCalcOneTwo() {

		int randNum = 0;

		randNum = (int) (1 + (Math.random() * (3 - 1)));

		mainCalc(randNum);

	}

	public static void mainCalc(int randNum) {

		char alphaFinal = 0;
		int numberFinal = 0;
		String finalCharMove = "";
		String finalNumMove = "";
		String finalCharString = "";
		String finalNumString = "";
		String finalPassword = "";

		if (randNum == 1) {

			alphaFinal = alphabet();
			finalCharMove = String.valueOf(alphaFinal);

			finalCharString = finalCharString + finalCharMove;
			
			finalPassword = finalPassword + finalCharString;

		} else {

			numberFinal = numberMethod();
			finalNumMove = String.valueOf(numberFinal);

			finalNumString = finalNumString + finalNumMove;
			finalPassword  = finalPassword + finalNumString;
		}

		System.out.print(finalPassword);
	}

	public static char alphabet() {

		Random ran = new Random();
		char c = (char) (ran.nextInt(26) + 'a');

		int randNumAlpha = (int) (1 + (Math.random() * (3 - 1)));

		char finalReturn = 0;

		if (randNumAlpha == 1) {

			finalReturn = Character.toUpperCase(c);
			
		} else {
			
			finalReturn = c;
		}

		return finalReturn;
	}

	public static int numberMethod() {

		return (int) (1 + (Math.random() *(9-1)));

	}
}
