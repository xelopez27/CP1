/**
 * Write a description of class LoopDrawing here.
 *
 * @author Sabir
 * @version 1-21-19
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;

	/******** Put your code here  *********/

  //tail
    int Txpoints[] = {280, 310, 320, 360};
    int Typoints[] = {420, 230, 200, 200};
    Polygon tail = new Polygon(Txpoints, Typoints, 4);
    g2.setColor(new Color(255,255,0));
    g2.fill(tail);
    g2.draw(tail);

  //tail shading
    int TSxpoints[] = {310, 310, 320, 360};
    int TSypoints[] = {230, 230, 200, 200};
    Polygon tailS = new Polygon(TSxpoints, TSypoints, 4);
    g2.setColor(new Color(219,187,24));
    g2.fill(tailS);
    g2.draw(tailS);

  //pikabody
      Ellipse2D.Double pikabody = new Ellipse2D.Double(100, 175, 200, 300);
      g2.setColor(new Color(255,255,0));
      g2.fill(pikabody);
      g2.setColor(Color.black);
      g2.setStroke(new BasicStroke(2));
      g2.draw(pikabody);

  // triangle for left ear
    //yellow part
      int LExpoints[] = {150, 100, 125};
      int LEypoints[] = {115, 0, 135};
      Polygon leftear = new Polygon(LExpoints, LEypoints, 3);
      g2.setColor(new Color(255,255,0));
      g2.fill(leftear);
      g2.draw(leftear);

    //black part
      int LETxpoints[] = {110, 100, 130};
      int LETypoints[] = {50, 0, 65};
      Polygon lefteartop = new Polygon(LETxpoints, LETypoints, 3);
      g2.setColor(Color.black);
      g2.fill(lefteartop);
      g2.draw(lefteartop);

  // triangle for right ear
      //yellow part
        int RExpoints[] = {250, 300, 275};
        int REypoints[] = {115, 0, 135};
        Polygon rightear = new Polygon(RExpoints, REypoints, 3);
        g2.setColor(new Color(255,255,0));
        g2.fill(rightear);
        g2.draw(rightear);

      //black part
        int RETxpoints[] = {277, 300, 287};
        int RETypoints[] = {50, 0, 65};
        Polygon righteartop = new Polygon(RETxpoints, RETypoints, 3);
        g2.setColor(Color.black);
        g2.fill(righteartop);
        g2.draw(righteartop);

    //pikahead
        Ellipse2D.Double pikahead = new Ellipse2D.Double(100, 100, 200, 200);
        g2.setColor(new Color(255,255,0));
        g2.fill(pikahead);
        g2.setStroke(new BasicStroke(0));
        g2.draw(pikahead);

        Ellipse2D.Double pikaheadoutline = new Ellipse2D.Double(100, 100, 200, 200);
        g2.setColor(new Color(0,0,0));
        g2.setStroke(new BasicStroke(2));
        g2.draw(pikaheadoutline);
        g2.setStroke(new BasicStroke(0));

    //righteye
        Ellipse2D.Double pikare = new Ellipse2D.Double(160, 160, 20, 20);
        g2.setColor(Color.black);
        g2.fill(pikare);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2));
        g2.draw(pikare);

    //lefteye
        Ellipse2D.Double pikale = new Ellipse2D.Double(220, 160, 20, 20);
        g2.setColor(Color.black);
        g2.fill(pikale);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2));
        g2.draw(pikale);

    //mouth
      int mxpoints[] = {175, 190, 200, 210, 225, 210, 200, 190, 175};
      int mypoints[] = {225, 250, 235, 250, 225, 250, 235, 250, 225};
      Polygon mouth = new Polygon(mxpoints, mypoints, 9);
      g2.setColor(Color.black);
      g2.draw(mouth);

    //leftcircle
        Ellipse2D.Double pikalp = new Ellipse2D.Double(120, 200, 20, 20);
        g2.setColor(Color.red);
        g2.fill(pikalp);
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(2));
        g2.draw(pikalp);
    //leftcircle
        Ellipse2D.Double pikarp = new Ellipse2D.Double(260, 200, 20, 20);
        g2.setColor(Color.red);
        g2.fill(pikarp);
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(2));
        g2.draw(pikarp);


/*
   	comment this out once you have finished
        drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));

        // Draw vertical lines
        for(int x = 0; x < 1000; x += 25){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }

        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 25){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
*/
    }
}
