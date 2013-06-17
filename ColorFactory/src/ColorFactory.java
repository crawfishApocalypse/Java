/*
 Author: Julian Eljabali
 Date  : 04/10/13
 Program Name: ColorFactory.java
 Objective: The purpose of this program is to create your
            own color.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class ColorFactory extends JFrame
{
	private JPanel gridPanel;
	private JLabel jl;
	private JLabel jl1;
	private JLabel jl2;
	private JLabel jl3;
	private JLabel jl4;
	private JLabel jl5;
	private JLabel jl6;
	private JLabel jl7;
	private JRadioButton dec;
	private JRadioButton oct;
	private JRadioButton bi;
	private JRadioButton hex;
	private JScrollBar red;
	private JScrollBar green;
	private JScrollBar blue;
	private int redx = 1;
	private int greenx = 1;
	private int bluex = 1;
	float GRAPHICBARMAXHEIGHT = 300;
		
//******************************ColorFactory()**********************
	public ColorFactory() 
	{
		setLayout(new BorderLayout());
		setTitle("Color Factory");
		jl = new JLabel("               Color Factory");
		jl.setFont(new Font("Sans Serif", Font.BOLD, 30));
		add(jl, BorderLayout.NORTH);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();	
		add(gridPanel, BorderLayout.EAST);
		setVisible(true);
		OvalCanvas oc = new OvalCanvas();
	    add(oc, BorderLayout.CENTER);
	    setVisible(true);
	}
//******************************buildPanel()**********************	
	private void buildPanel()
	{
		gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(7,2));
		dec = new JRadioButton("Decimal", true);
		oct = new JRadioButton("Octal", false);
		bi = new JRadioButton("Binary", false);
		hex = new JRadioButton("Hex", false);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(dec);
		buttonGroup.add(oct);
		buttonGroup.add(bi);
		buttonGroup.add(hex);
		red = new JScrollBar(Scrollbar.HORIZONTAL,0,2,0, 255);
		green = new JScrollBar(Scrollbar.HORIZONTAL,0,2,0,255);
		blue = new JScrollBar(Scrollbar.HORIZONTAL,0,2,0,255);
		jl1 = new JLabel("   Blue");jl2 = new JLabel("   Red");jl3 = new JLabel("   Green");
		jl4 = new JLabel("");jl5 = new JLabel("");jl6 = new JLabel("");jl7 = new JLabel("");
		gridPanel.add(dec);gridPanel.add(jl4);gridPanel.add(oct);
		gridPanel.add(jl5); gridPanel.add(bi);gridPanel.add(jl6);
		gridPanel.add(hex);gridPanel.add(jl7);gridPanel.add(red);gridPanel.add(jl2);
		gridPanel.add(green); gridPanel.add(jl3); gridPanel.add(blue);gridPanel.add(jl1);
//************************AdjustmentListeners()*******************	
		red.addAdjustmentListener( new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent e) 
			{
				redx = e.getValue();
			}
		});
		
		blue.addAdjustmentListener( new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent e) 
			{
				bluex = e.getValue();
			}
		});
		green.addAdjustmentListener( new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent e) 
			{
				greenx = e.getValue();
			}
		});
		dec.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Integer.toString(redx,10);
				Integer.toString(greenx,10);
				Integer.toString(bluex,10);
			}
		});
		oct.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Integer.toString(redx,8);
				Integer.toString(greenx,8);
				Integer.toString(bluex,8);
			}
		});
		bi.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Integer.toString(redx,2);
				Integer.toString(greenx,2);
				Integer.toString(bluex,2);
			}
		});
		hex.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Integer.toString(redx,16);
				Integer.toString(greenx,16);
				Integer.toString(bluex,16);
			}
		});
	}
//******************************paint()******************************	
	public class OvalCanvas extends Canvas
	{
	     public void paint(Graphics g)
	     { 
	    	 g.drawRect(50, 300-getBarHeight(redx), 45, getBarHeight(redx) );
	    	 g.drawString("0", 65, 315);
	 		 g.drawRect(150, 300-getBarHeight(greenx), 45, getBarHeight(greenx));
	 		 g.drawString("0", 165, 315);
	 		 g.drawRect(250, 300-getBarHeight(bluex), 45, getBarHeight(bluex));
	 		 g.drawString("0", 265, 315);
	 		 g.setColor(new Color(redx, greenx, bluex));
	 		 g.fillOval(150,370,100,100);
	 		 repaint();	
	     }
//******************************getBarHeight()**********************	     
	     private int getBarHeight( int scrollBarValue )
	     {
	    	 float normalizedScrollBarValue = (float)scrollBarValue / 255;
	    	 return (int)(normalizedScrollBarValue * GRAPHICBARMAXHEIGHT);
	     }
	}		
}
