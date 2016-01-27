package polymorphism1;

//Shape1Square.java
//Lab14a
//Student starting version

import java.awt.*;

public class Shape1Square implements Shape {
	public void drawShape(Graphics g) {
		g.fillRect(150, 130, 100, 100);
	}

	public void displayName(Graphics g) {
		g.drawString("Square", 60, 50);
	}

	public void displayNumSides(Graphics g) {
		g.drawString("A square has four sides", 60, 300);
	}
}
