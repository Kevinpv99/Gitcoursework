import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

//class bullet point 1 task 1.  
public class Coursework implements ActionListener   // creating the class and implementing the actionlistener.  
{ 
  // constructor bullet point 2 task 1. 
	private int position =0; // declaring the variable position in order to do part 2 and 3
	private int nextposition=0;
	JButton[] button = new JButton[12]; // Creating the array
	public Coursework()// Creating the constructor.
 	{
  		GridLayout layout = new GridLayout (3,4); // making the grid 3 by 4. 
 		JFrame z = new JFrame(); // creating the frame.
  		JPanel panel = new JPanel(); // creating the panel. 
		z.add(panel);
   		panel.setLayout(layout); 

 		for(int i=0; i<12; i++)
		{
			ImageIcon a = new ImageIcon ("bart"+i+".jpg");
			button[i]= new JButton(a);
			panel.add(button[i]);
			button[i].addActionListener(this);
		}
   
   		z.setVisible(true); // Makes the grid visible.
  		z.setTitle("Puzzle"); // Gives the grid the title Puzzle.
   		z.setSize(450,370); // Sets the size of the grid.
  		z.setContentPane(panel); 

  		z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the grid.
	}
