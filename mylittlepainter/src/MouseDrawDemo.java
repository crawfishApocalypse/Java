//  Author: Chuck Griffin
//  Purpose: an example for my friends
//  Date:  4/19/13

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class MouseDrawDemo extends JFrame
{
   public static void main(String[] args) 
   {
      JFrame mf = new JFrame();
      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mf.setSize(800, 600);
      mf.setTitle("My Little Painter");
      mf.setVisible(true);
      
      MyCanvas mc = new MyCanvas();
      mf.add(mc);
      
   }
}

