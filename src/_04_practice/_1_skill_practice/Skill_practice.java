package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill_practice {
	public static void main(String[] args) {
//String dimes=JOptionPane.showInputDialog("how many dimes do you have.");
//int ten=Integer.parseInt(dimes);
//ten*=10;
//System.out.println(ten);
//String inches=JOptionPane.showInputDialog("how tall are you in inches.");
//int inch=Integer.parseInt(inches);
//if (inch<=36) {
//	System.out.println("eat your wheaties"); 
//}
//else {
//	System.out.println("your surprisingly tall");
//}
//
//for (int i = 1; i < 31;i++) {
//	if (i% 3==0) {
//		System.out.println(i);
//	}
//}
//JOptionPane.showInputDialog("message");
////
//Random robert  = new Random();
//Random rob  = new Random();
//System.out.println(robert.nextInt(100-50));
//System.out.println(rob.nextInt(10));
		String age = JOptionPane.showInputDialog("How old are you?");
		int old = Integer.parseInt(age);
		old += 1;
		System.out.println("Happy birthday! You are now "+old+" years old");


//String city=JOptionPane.showInputDialog("what city do you live in.");
//
//if (city.equals("San Diego")) {
//	System.out.println("you live in America's finest city.");
//	
//}
//else {
//	System.out.println("you should move to San Diego.");
//}
//		
//int wheel=4;
//	String car=JOptionPane.showInputDialog("how many cars does yoiur familey have ");	
//		if (car.equals("0")) {
//			System.out.println("i bet you use public transport.");
//			
//		}
//		else if (car.equals("1")) {
//			System.out.println("your car has "+ wheel+" wheels.");
//		}
//		
//		else if (car.equals("2")) {
//			wheel*=2;
//			System.out.println("your cars have "+ wheel+" wheels combined.");
//		}
//
//	String school=JOptionPane.showInputDialog("what is the name of your school.");	
//		System.out.println(school+" is an amazing school.");
		doubleNumber();
	}


static void doubleNumber(){
String doubleNumber = JOptionPane.showInputDialog("tell me a number");
int num =Integer.parseInt(doubleNumber);
System.out.println("here is that number times 2"+ num * 2);
}}
//		SkillPractice skills = new SkillPractice();
//		           skills.skill1();
//		           skills.skill2();
//		           skills.skill3();
//		           skills.skill4();
//		           skills.skill5();
//		}
