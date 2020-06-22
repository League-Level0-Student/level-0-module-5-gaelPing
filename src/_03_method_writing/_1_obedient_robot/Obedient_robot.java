package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class Obedient_robot {
	public static void main(String[] args) {
String move=JOptionPane.showInputDialog("what do you want to draw")	;
if (move.equals("square")) {
	drawSquare();
}
else if(move.equals("triangle")) {
drawTriangle();
}
}
	


public static void drawSquare() {
	Robot delta=new Robot();
	delta.penDown();
	delta.setSpeed(50);
	for (int i = 0; i < 4; i++) {
		delta.move(50);
	delta.turn(90);}
	}
	public static void drawTriangle() {
		Robot ƒ=new Robot();
		ƒ.penDown();
		ƒ.setSpeed(50);
		for (int i = 0; i < 3; i++) {
			ƒ.move(50);
		ƒ.turn(120);
		} }
		public static void drawCircle() {
			Robot ro=new Robot();
			ro.move(50);
		}
		
	}
	
	

