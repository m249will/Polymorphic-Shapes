package polymorphism1;

// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape {
	public void drawShape(Graphics g)
   {
	   Polygon octagon = new Polygon();
	   octagon.addPoint(230,400);
	   octagon.addPoint(260,440);
	   octagon.addPoint(260,490);
	   octagon.addPoint(230,530);
	   octagon.addPoint(180,530);
	   octagon.addPoint(150,490);
	   octagon.addPoint(150,440);
	   octagon.addPoint(180,400);
	   g.fillPolygon(octagon);
   }
}
