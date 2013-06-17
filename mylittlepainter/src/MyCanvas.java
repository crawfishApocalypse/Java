import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

class MyCanvas extends JPanel implements MouseListener, MouseMotionListener
{
   // 
	
   private ArrayList<Point> brushStroke = new ArrayList<Point>();
   private String mouseStatus = "Mouse Status:";
   private int x;
   private int y;
   private int clickCount = 0;
   
   public MyCanvas()
   {
	  addMouseListener(this);
	  addMouseMotionListener(this);
	  this.setBackground(Color.darkGray);
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); 
      g.setColor(Color.green);
      g.drawString("Mouse position: "+ x + " , " + y, 10, 10);
      g.drawString(mouseStatus,                       10, 20);
      g.drawString("Click Count = " + clickCount,     10, 30);
      g.drawString("Right click to reset",            10, 40);
      
      
      if(brushStroke.size() > 0)
      {
    	  for(Point p : brushStroke)
          {
    		  g.fillOval((int)p.getX() - 5, (int)p.getY() - 5, 10, 10);
          }
      }
      
	  
   }  // end of paintComponent



	public void mouseEntered(MouseEvent event) 
	{
		mouseStatus = "Mouse Status: IN THE FRAME";
		repaint();
	}
	public void mouseExited(MouseEvent event)  
	{
		mouseStatus = "Mouse Status: OUT OF FRAME";
		x = y = -1; 
		repaint();
	} 	
	public void mouseClicked(MouseEvent event) 
	{
		if(event.getButton() == event.BUTTON3) 
		{
			brushStroke.clear();
			clickCount = 0;
		}
		else
		{
			x=event.getX(); 
			y=event.getY(); 
			
			Point p = new Point(x,y);
			brushStroke.add(p);
		}
		
		repaint();
	}
	public void mousePressed(MouseEvent event) 
	{
		clickCount += event.getClickCount(); 
		repaint();
	}
	public void mouseReleased(MouseEvent event){}

	// mouse motion listener
	public void mouseDragged(MouseEvent event)
	{
		x=event.getX(); 
		y=event.getY(); 
		
		Point p = new Point(x,y);
		brushStroke.add(p);
		
		repaint();
	}
	public void mouseMoved(MouseEvent event)
	{
		x=event.getX(); 
		y=event.getY(); 
		repaint();
	}
	
}	
	
	
	
	

