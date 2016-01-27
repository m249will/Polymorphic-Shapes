package polymorphism1;

	// Lab14avst.java
	// Lab14a
	// Student starting version


	import java.awt.*;
	import java.applet.*;
	import java.util.ArrayList;


	public class Lab14avst extends Applet
	{
		Shape g1 = new Shape1Square();
		Shape g2 = new Shape2Triangle();
		Shape g3 = new Shape3Octagon();
		Shape g4 = new Shape4Circle();
		
		
		public void init(){
			setSize(850,650);
		}
		
		public void paint(Graphics g)
		{
			drawGrid(g);
			
			ArrayList<Shape> shapes = new ArrayList<Shape>();
			shapes.add(g1);
			shapes.add(g2);
			shapes.add(g3);
			shapes.add(g4);
			
			for (Shape shape: shapes) {
				shape.drawShape(g);
			}
			
			for (Shape shape: shapes){
				shape.displayName(g);
			}
			
			for (Shape shape: shapes){
				shape.displayNumSides(g);
			}
				
	   }

		public void drawGrid(Graphics g)
		{
	      g.drawRect(10,10,800,600);
			g.drawLine(10,300,810,300);
			g.drawLine(410,10,410,610);
		}
	}
