package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
	public static void main(String[] args) {
		int loop = 1;
		while (loop == 1) {

			String num = JOptionPane.showInputDialog("tell me a number from 3 - 12.");
			int i = Integer.parseInt(num);

			if (i % 2 == 1) {
				System.out.println("the number " + i + " is a primary number.");
			} else {
				System.out.println("the number " + i + " is not a primary number.");
			}

		}
	}
}