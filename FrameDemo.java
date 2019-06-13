import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  // Makes a new object(frame) called frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // method that stops the program when the joption frame is closed
		frame.setSize(400, 400); // sets the size of the frame

		Shapes r = new Shapes();
		frame.add(r);

		frame.setVisible(true); // lets us see the frame
	}
}
