package polymorphism1;

//Shape2Triangle.java
//Lab14a
//Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape {
	public void drawShape(Graphics g) {
		Polygon triangle = new Polygon();
		triangle.addPoint(605, 130);
		triangle.addPoint(685, 230);
		triangle.addPoint(525, 230);
		g.fillPolygon(triangle);
	}

	public void displayName(Graphics g) {
		g.drawString("Triangle", 450, 50);
	}

	public void displayNumSides(Graphics g) {
		g.drawString("A triangle has three sides", 450, 300);
	}
}
