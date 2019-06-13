import javax.swing.JFrame;

public class MMFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("Mickey Mouse");  // Makes a new object(frame) called frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // method that stops the program when the joption frame is closed
		frame.setSize(400, 400); // sets the size of the frame

    MMouse head = new MMouse();
    frame.add(head);

		frame.setVisible(true); // lets us see the frame
	}
}
