package polymorphism1;

// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape {
	public void drawShape(Graphics g) {
		g.fillOval(535, 380, 150, 150);
	}

	public void displayName(Graphics g) {
		g.drawString("Circle", 450, 450);
	}

	public void displayNumSides(Graphics g) {
		g.drawString("A circle has no sides", 450, 600);
	}
}
