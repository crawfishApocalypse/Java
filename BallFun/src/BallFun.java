//<applet code ='BallFun' width = 800 height = 650> </applet>

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BallFun extends Applet implements ActionListener 
{
   Button left, up, right, down, inflate, deflate;
   int increment = 10;
   int x = 320;
   int y = 300;
   int ballRatioW = 100;
   int ballRatioH = 100;
   int screenH = 650;
   int screenW = 800;

   
   public void init()
   {
      left = new Button("LEFT");
      up = new Button("UP");
      right = new Button("RIGHT");
      down = new Button("DOWN");
      inflate = new Button("INFLATE");
      deflate = new Button("DEFLATE");
      add(left); add(up); add(right); add(down); add(inflate); add(deflate);
      
      left.addActionListener(this);
      up.addActionListener(this);
      right.addActionListener(this);
      down.addActionListener(this);
      inflate.addActionListener(this);
      deflate.addActionListener(this);
      
      setBackground(Color.PINK);    
	   	   
   }

   
   public void paint (Graphics g)
   {
	   g.fillOval(x, y, ballRatioW, ballRatioH);
	   g.setColor(Color.BLACK);
   }
   
   
   public void actionPerformed(ActionEvent ae)
   {
	   String msg = ae.getActionCommand();
	   Graphics g = getGraphics();
	   
	   if (msg.equals("LEFT"))
	   {
		   if (increment + x + ballRatioW/2 <= screenW)
		   g.fillOval(x -= increment, y, ballRatioW, ballRatioH);  
	   }
	   repaint();
	   
	   if (msg.equals("RIGHT"))
	   {
		   if (increment + x + ballRatioW/2 <= screenW)
		   g.fillOval(x += increment, y, ballRatioW, ballRatioH);
	   }
	   repaint();
      
	   if (msg.equals("UP"))
	   {
		   if (increment + x - ballRatioW/2 <= screenW)
		   g.fillOval(x, y -= increment, ballRatioW, ballRatioH);   
	   }
	   repaint();
	   
	   if (msg.equals("DOWN"))
	   {
		   if (increment + x - ballRatioW/2 <= screenW)
		   g.fillOval(x, y += increment, ballRatioW, ballRatioH);   
	   }
	   repaint();
	   
	   if (msg.equals("INFLATE"))
	   {
		   if (increment + x - ballRatioW/2 <= screenW)
		   g.fillOval(x, y, ballRatioW += increment, ballRatioH += increment);   
	   }
	   repaint();
	   
	   if (msg.equals("DEFLATE"))
	   {
		   if (increment + x - ballRatioW/2 <= screenW)
		   g.fillOval(x, y, ballRatioW -= increment, ballRatioH -= increment);   
	   }
	   repaint();
	   
   }
   

   
}
