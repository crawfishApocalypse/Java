//<applet code = 'FunDone'> </applet>

import java.awt.*;
import java.applet.*;


public class FunDone extends Applet
{
    int c;	
//******************************rand()**********************************
	public static int rand (int a, int b)
	{
	return ((int)((b - a + 1) * Math.random()) + a);
	}
	
//******************************sleep()**********************************	
	public void sleep(int msec)
	{
	try
	{
	  Thread.sleep(msec);
	}catch (InterruptedException e){}
	}
	
//******************************init()**********************************
    public void init()
	{
//Getting the size of the screen
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
	c = 0;	
	setBackground(Color.black);	
	}

//Editing the update method
    public void update (Graphics g)
    {
    paint (g);
    }
    
//****************************drawLines()******************************** 
    public void drawLines(Graphics g)
	{
	g.drawLine( rand(0,500), rand(0,500), rand(0,500), rand(0,500));
	g.setColor(new Color(rand(0,255), rand(0,255), rand(0,255)));
	c += 1;
	if (c<500) {sleep (400); repaint();}
	}

//Clearing the screen
    public void cls()
    {
    Graphics g = getGraphics();
    g.setColor(getBackground());
    g.fillRect(0, 0, getSize().width, getSize().height); 
    g.setColor(getForeground());
    }

//Editing the update method
    public void update1 (Graphics g)
    {
    paint (g);
    }    
//******************************drawCircles()**********************************
	public void drawCircles (Graphics g)
	{
	g.drawOval( rand(5, 900), rand(55, 900), 100, 100);
	g.fillOval( rand(0,(getWidth()-100)), rand(0,(getHeight()-100)), 100, 100);
	c += 1;
	if (c<500) {sleep (400); repaint();}
	}

//Clearing the screen
    public void cls1()
    {
    Graphics g = getGraphics();
    g.setColor(getBackground());
    g.fillRect(0, 0, getSize().width, getSize().height); 
    g.setColor(getForeground());
    }

//Editing the update method
    public void update2 (Graphics g)
    {
    paint (g);
    } 

//******************************drawTriangles()**********************************
  	public void drawTriangles (Graphics g)
  	{
  	g.drawLine( rand(0,500), rand(0,500), rand(0,500), rand(0,500));
  	g.drawLine( rand(0,500), rand(0,500), rand(0,500), rand(0,500));
  	g.drawLine( rand(0,500), rand(0,500), rand(0,500), rand(0,500));
    g.setColor(new Color(rand(0,255), rand(0,255), rand(0,255)));
  	c += 1;
  	if (c<500) {sleep (400); repaint();}
  	}

}