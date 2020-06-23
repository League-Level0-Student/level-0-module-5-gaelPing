package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: 
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet=JOptionPane.showInputDialog("what kind of pet do you want ");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
int mad=0;
int play=0;
int hunger=0;
int stamina=0;
int fur=0;
int poop=0;
for (int i = 0; i < 100; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do.", "Make your pet happy.", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water","take a walk","groom","clean up poop" }, null);

	if (task==0) {
	System.out.println("you cuddled your "+ pet);
		happinessLevel++;
		mad++;
		if (mad==4) {
			System.out.println("your cat is tired of cuddles do something else");
			mad=0;
			}
	}
	if (task==1) {
		System.out.println("you gave food to your. "+ pet);
			happinessLevel++;
			hunger++;
			if (hunger==4) {
			System.out.println("your cat is to full to eat do somemthing else");
			hunger=0;
			}
		}
	if (task==2) {
		System.out.println("you gave water to your. "+ pet);
			happinessLevel++;
			if (play==4) {
				System.out.println("your cat is not thirsty do something else");
				play=0;
				}
		}
	if (task==3) {
			System.out.println("you took your "+ pet+" for a walk.");
			happinessLevel++;
			if (stamina==4) {
				System.out.println("your cat is to full to eat do something else");
				stamina=0;
				}
		}
	//Hey Gael sorry Jackie closed the meeting, but you should save and commit when you get the chance
	if (task==4) { //ok thankes for leting me know
			System.out.println("you groomed your "+ pet);
			happinessLevel++;
			if (fur==4) {
				System.out.println("your"+ pet+"is to full to eat do something else");
				fur=0;
				}
		}
	if (task==5) {
			System.out.println("you cleaned up your "+ pet+"s poop");
			happinessLevel++;
			if (poop==4) {
				System.out.println("your "+pet+" has not pooped something else");
				poop=0;
				}
		}
	if (happinessLevel==50) {
		System.out.println("your cat fully loves you now.");
	}
	if (task==-1) {
		System.exit(0);
	}
	}			
}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
