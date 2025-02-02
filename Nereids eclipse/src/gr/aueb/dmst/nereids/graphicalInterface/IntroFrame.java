//package gameplay;
package gr.aueb.dmst.nereids.graphicalInterface;

/**
 * displays a frame with the logo for 3 seconds
 */
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class IntroFrame {
	
	
	public IntroFrame() throws InterruptedException {
		JFrame frame = new JFrame("Nereids");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(600, 600);
		frame.setVisible(true);
	    frame.setResizable(true);
	    
	    JLabel label = new JLabel("A DMST student original game 2021", SwingConstants.RIGHT);
	    label.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    frame.add(label, BorderLayout.PAGE_END);
	    
	    IntroPanel panel = new IntroPanel();
	    frame.add(panel);
	    
	    
	    frame.pack();
	    frame.setVisible(true);
	    
	    Thread.sleep(3000); //delay 3 seconds
	    
	    frame.setVisible(false); //make invisible
	    frame.dispose(); //dispose the frame 
	    

	}
	

}
