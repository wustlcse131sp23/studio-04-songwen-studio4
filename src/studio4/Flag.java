package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color color = new Color(190, 10, 10);
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.309);
        StdDraw.setPenColor(StdDraw.CYAN);
        StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.309);
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.filledEllipse(0.5, 0.5, 0.3, 0.1);
       
	}
}