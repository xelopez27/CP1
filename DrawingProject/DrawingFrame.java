 import javax.swing.JFrame;

public class DrawingFrame
{
    public static void main(String[] args){

	// You should change the Title
        JFrame frame = new JFrame("Frame for Picture");
        frame.setSize(1000, 562);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPicture picture = new DrawingPicture();
        frame.add(picture);

        frame.setVisible(true);
    }
}
