import acm.program.*;
import acm.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * SliderProgram spawns new Slider thread upon each Slide button press
 *
 */
public class SliderProgram extends GraphicsProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Animate a GRect across the screen
	 * @param args
	 */
	public void run() {
		add(new JButton("Slide"), SOUTH);
		addActionListeners();
		validate();

	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Slide")) {
			Slider slider = new Slider(SIZE,rgen.nextColor());
			add(slider, 0, rgen.nextDouble(0,500));
			
			//run the slider on a new thread
			Thread sliderThread = new Thread(slider);
			sliderThread.start();
		}
	}
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int SIZE = 30;
	

}
