package magic;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);

		System.out.println("Enter your question ");
		ui.next();
		ui.close();

		Random rando = new Random();
		int r = rando.nextInt(5);
		System.out.print(r);

		if (r == 0) {
			System.out.println(" You Got it love! ");
		} else if (r == 1) {
			System.out.println(" Nah bro! ");
		} else if (r == 2) {
			System.out.println(" Signs point to yes! ");
		} else if (r == 3) {
			System.out.println(" Dont count on it. ");
		} else if (r == 4) {
			System.out.println(" Outlook not so good. ");
		}

	}

}
