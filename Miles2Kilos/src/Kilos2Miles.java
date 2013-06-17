import javax.swing.*;
import java.awt.event.*;

//JOptionPane?
//newCaclButtonListener?

public class Kilos2Miles extends JFrame
{
	
	private JPanel jp;
	private JLabel jl;
	private JTextField jtf;
	private JButton jb;

	public Kilos2Miles() 
	{
		setTitle("Kilometer Converter");
		setSize(310, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(jp);
		setVisible(true);
	}
	

   private void buildPanel()
   {
	   jl = new JLabel("Enter a distance in kilometers: ");
	   jtf = new JTextField(10);
	   jb = new JButton("Calculate");
	   jb.addActionListener(new ActionListener()
	   {
		   public void actionPerformed(ActionEvent ae)
		   {
			   String input;
			   double miles;
			   input = jtf.getText();
			   miles = Double.parseDouble(input) * 0.6214;
			   JOptionPane.showMessageDialog(null, input + " Kilometers is " + miles + " miles");   
		   }
	   });
	   jp = new JPanel();
	   jp.add(jl); jp.add(jtf); jp.add(jb);
   }

}
