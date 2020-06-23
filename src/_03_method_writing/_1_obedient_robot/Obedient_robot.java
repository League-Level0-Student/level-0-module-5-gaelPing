package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	public static void main(String[] args) {
		String move = JOptionPane.showInputDialog("what do you want to draw");
		
		if (move.equals("square")) {
			drawSquare();
		} else if (move.equals("triangle")) {
			drawTriangle();
		} else if (move.equals("circle")) {
			drawCircle();
		}
	}

	public static void drawSquare() {
		String color = JOptionPane.showInputDialog("what color do you want" + "\n red , blue ,or green");
		Robot delta = new Robot();
		delta.penDown();
		if (color.equals("red")) {
			delta.setPenColor(Color.red);
		} else if (color.equals("blue")) {
			delta.setPenColor(Color.blue);
		} else if (color.equals("green")) {
			delta.setPenColor(Color.green);
		}
		delta.setSpeed(50);
		for (int i = 0; i < 4; i++) {
			delta.move(100);
			delta.turn(90);
		}
		delta.setX(100);
	}

	public static void drawTriangle() {
		Robot ƒ = new Robot();
		String color = JOptionPane.showInputDialog("what color do you want" + "\n red , blue ,or green");
		if (color.equals("red")) {
			ƒ.setPenColor(Color.red);
		} else if (color.equals("blue")) {
			ƒ.setPenColor(Color.blue);
		} else if (color.equals("green")) {
			ƒ.setPenColor(Color.green);
		}

		ƒ.penDown();
		ƒ.setSpeed(50);
		for (int i = 0; i < 3; i++) {
			ƒ.move(100);
			ƒ.turn(120);

		}
		ƒ.setX(100);
	}

	public static void drawCircle() {
		Robot rob = new Robot();
		String color = JOptionPane.showInputDialog("what color do you want" + "\n red , blue ,or green");
		if (color.equals("red")) {
			rob.setPenColor(Color.red);
		} else if (color.equals("blue")) {
			rob.setPenColor(Color.blue);
		} else if (color.equals("green")) {
			rob.setPenColor(Color.green);
		}

		rob.penDown();
		rob.setSpeed(50);
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
		rob.setX(100);

	}

}
