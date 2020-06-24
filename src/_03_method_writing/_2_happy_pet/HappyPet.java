package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line:
	static int happinessLevel = 0;
	static int mad = 0;
	static int play = 0;
	static int hunger = 0;
	static int stamina = 0;
	static int fur = 0;
	static int poop = 0;
	static int task;
	static String pet;

	public static void main(String[] args) {
		pet = JOptionPane.showInputDialog("what kind of pet do you want ");
		for (int i = 0; i < 100; i++) {
			task = JOptionPane.showOptionDialog(null, "What do you want to do.", "Make your pet happy.", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water", "take a walk", "groom", "clean up poop" }, null);

			if (task == 0) {
				cuddle();
			}
			if (task == 1) {
				hunger();
			}
			if (task == 2) {
				water();
			}
			if (task == 3) {
				walk();
			}
			if (task == 4) {
				groom();
			}
			if (task == 5) {
				poop();
			}

			love();

			if (task == -1) {
				System.exit(0);
			}
		}
	}

	private static void cuddle() {

		System.out.println("you cuddled your " + pet);
		happinessLevel++;
		mad++;
		if (mad == 4) {
			System.out.println("your cat is tired of cuddles do something else");
			mad = 0;
		}
	}

	private static void hunger() {

		System.out.println("you gave food to your. " + pet);
		happinessLevel++;
		hunger++;
		if (hunger == 4) {
			System.out.println("your cat is to full to eat do somemthing else");
			hunger = 0;
		}
	}

	private static void water() {

		System.out.println("you gave water to your. " + pet);
		happinessLevel++;
		if (play == 4) {
			System.out.println("your cat is not thirsty do something else");
			play = 0;
		}
	}

	private static void walk() {

		System.out.println("you took your " + pet + " for a walk.");
		happinessLevel++;
		if (stamina == 4) {
			System.out.println("your cat is to full to eat do something else");
			stamina = 0;
		}
	}

	private static void groom() {
		if (task == 4) {
			System.out.println("you groomed your " + pet);
			happinessLevel++;
		} else if (fur == 4) {
			System.out.println("your" + pet + "is to full to eat do something else");
			fur = 0;
		}
	}

	private static void poop() {

		System.out.println("you cleaned up your " + pet + "s poop");
		happinessLevel++;
		if (poop == 4) {
			System.out.println("your " + pet + " has not pooped something else");
			poop = 0;
		}
	}

	private static void love() {
		if (happinessLevel == 50) {
			System.out.println("your cat fully loves you now.");
		}

	}

	{

	}

}
