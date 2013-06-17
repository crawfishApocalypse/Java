import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import java.util.ArrayList;


public class DrawingBoard extends JFrame 
{
	private JLabel title;
	private JPanel buttonsPanel;
	private JButton saveButton;
	private JButton loadButton;
	private JButton clearButton;
	private JButton colorButton;
	private JButton drawButton;
	private JButton eraseButton;
	private JButton brushButton;
	private JPanel buttonsPannel;
	private Canvas canvasBoard;
	private ArrayList<Point> brushStroke = new ArrayList<Point>();
	private String mouseStatus = "Mouse Status:";
	private int x;
	private int y;
	private int clickCount = 0;

//******************************DrawingBoard()**********************
   public DrawingBoard() 
   {
	  setLayout(new BorderLayout());
      setTitle("Drawing Board");
	  title = new JLabel("          Drawing Board");
	  title.setFont(new Font("SansSerif",Font.BOLD,40));
	  add(title, BorderLayout.NORTH);
	  setSize(600, 600);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  buttonsPanel();
	  add(buttonsPanel, BorderLayout.SOUTH);
	  CanvasBoard cb = new CanvasBoard();
	  add(cb, BorderLayout.CENTER);
	  setVisible(true);

   }
//******************************buttonsPanel()*********************
   private void buttonsPanel()
   {
	  buttonsPanel = new JPanel();
	  buttonsPanel.setLayout(new FlowLayout());
	  saveButton = new JButton ("Save");
	  loadButton = new JButton ("Load");
	  clearButton = new JButton ("Clear");
	  colorButton = new JButton ("Color");
	  drawButton = new JButton ("Draw");
	  eraseButton = new JButton ("Erase");
	  brushButton = new JButton ("Brush");
      buttonsPanel.add(saveButton); buttonsPanel.add(loadButton);
      buttonsPanel.add(clearButton);buttonsPanel.add(drawButton);
      buttonsPanel.add(colorButton);buttonsPanel.add(eraseButton);
      buttonsPanel.add(brushButton);
   }
//******************************canvasBoard()*********************
 class CanvasBoard extends JPanel implements MouseListener, MouseMotionListener 
 { 
   //private void canvasBoard()
   {
      canvasBoard = new Canvas();
      addMouseListener(this);
	  addMouseMotionListener(this);
	  this.setBackground(Color.BLACK);     
   }
   
   public void paint(Graphics g)
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
	      
   } 
   public void mouseDragged(MouseEvent e) 
   {   }
 //Empty implemented method
   public void mouseMoved(MouseEvent e) 
   {   }
 //Empty implemented method
   public void mouseClicked(MouseEvent e) 
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
 //Empty implemented method
   public void mouseEntered(MouseEvent e) 
   {   }
 //Empty implemented method
   public void mouseExited(MouseEvent e) 
   {   }
 //Empty implemented method
   public void mousePressed(MouseEvent e) 
   {   }
//Empty implemented method
   public void mouseReleased(MouseEvent e) 
   {   }
 }
 
public class ButtonListener implements ActionListener 
{
   public void actionPerformed(ActionEvent e) 
   {
      Color c = JColorChooser.showDialog(null, "Choose a Color", Color.YELLOW);
	  if (c != null);
	}
 }


 
}
