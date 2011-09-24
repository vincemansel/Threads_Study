import java.awt.Color;
import acm.graphics.*;

@SuppressWarnings("serial")
public class Slider extends GRect implements Runnable {
	
	public Slider(int size, Color color) {
		super(size,size);
		setFilled(true);
		setColor(color);
	}
	
	public void run() {
		// animate slide across the screen
		for (int i = 0; i < 2000/STEP; i++) {
			pause(40);
			move(STEP,0);
		}
	}
	
	private static final double STEP = 5;

}
