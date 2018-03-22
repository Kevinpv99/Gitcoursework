import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

//class bullet point 1 task 1.  
public class coursework2 implements ActionListener   // creating the class and implementing the actionlistener.  
{ 
  // constructor bullet point 2 task 1. 
	private int position =0; // declared integers only accesible to these methods.
	private int nextposition=0; // declared integers only accesible to these methods. 
	JButton[] button = new JButton[12]; // Creating the array and making 12 buttons
	public coursework2()
 	{
  		GridLayout layout = new GridLayout (3,4); // making the grid 3 by 4. 
 		JFrame z = new JFrame(); // creating the frame.
  		JPanel panel = new JPanel(); // creating the panel. 
		z.add(panel); // adding the panel to the frame.
   		panel.setLayout(layout); // Adds grid to panel.

 		for(int i=0; i<12; i++) 
		{
			ImageIcon a = new ImageIcon ("bart"+i+".jpg");
			button[i]= new JButton(a);
			panel.add(button[i]);
			button[i].addActionListener(this); // this loop creates a new imageicon 							      and a button then adds the imageicon 								      to the button and then adds a action 								      listener to each button. 
		}
   
   		z.setVisible(true); // Makes the grid visible.
  		z.setTitle("Puzzle"); // Gives the grid the title Puzzle.
   		z.setSize(450,370); // Sets the size of the frame.
  		

  		z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If the red x is clicked the 									     window will close.
	}

public void actionPerformed(ActionEvent e)
   {
	ImageIcon empty = new ImageIcon("bart0.jpg"); // stores an empty image 
        Icon tiles = new ImageIcon(); // creates a new imageicon  

	if(e.getSource() == button[0]) 
	{
		nextposition = 0;	
		if(position == 1|| position == 4){
			tiles = button[0].getIcon();
			button[0].setIcon(empty);
			button[position].setIcon(tiles);
			position = 0; 
		}
	} /** first it gets what button is clicked and if it is button 0... the next bit of the 	      loop is ran.
		*Next position is the button you click and the if statement is saying that only 
		*buttons 1 and 4 can be swapped with nextposition because they are next to it. 
		*tiles stores the button that you have clicked on. 
		*The next line makes the button you click empty and the next line sets the last
		*button to tiles (the previously clicked button). The else if just repeat this 			 loop for the button which is clicked. 
		*/ 
	else if(e.getSource() == button[1])
	{
		nextposition = 1;
		if(position == 0|| position == 2|| position == 5){
			tiles = button[1].getIcon();
			button[1].setIcon(empty);
			button[position].setIcon(tiles);
			position = 1;
		}
	}
	else if(e.getSource() == button[2])
	{	
		nextposition = 2;
		if(position == 1|| position == 3|| position == 6){
			tiles = button[2].getIcon();
			button[2].setIcon(empty);
			button[position].setIcon(tiles);
			position = 2;
		}
	}
	else if(e.getSource() == button[3])
	{	
		nextposition = 3;
		if(position == 2|| position == 7){	
			tiles = button[3].getIcon();
			button[3].setIcon(empty);
			button[position].setIcon(tiles);
			position = 3;	
		}
	}
	else if(e.getSource() == button[4])
	{	
		nextposition = 4;
		if(position == 0|| position == 5|| position == 8){	
			tiles = button[4].getIcon();
			button[4].setIcon(empty);
			button[position].setIcon(tiles);
			position = 4;
		}
	}
	else if(e.getSource() == button[5])
	{	
		nextposition = 5;
		if(position == 1|| position == 4|| position == 6|| position == 9){	
			tiles = button[5].getIcon();
			button[5].setIcon(empty);
			button[position].setIcon(tiles);
			position = 5;
		}
	}
	else if(e.getSource() == button[6])
	{	
		nextposition = 6;	
		if(position == 2|| position == 5|| position == 7|| position == 10){
			tiles = button[6].getIcon();
			button[6].setIcon(empty);
			button[position].setIcon(tiles);
			position = 6;		
		}
	}
	else if(e.getSource() == button[7])
	{	
		nextposition = 7;
		if(position == 3 || position == 6|| position == 11){	
			tiles = button[7].getIcon();
			button[7].setIcon(empty);
			button[position].setIcon(tiles);
			position = 7;
		}
	}
	else if(e.getSource() == button[8])
	{	
		nextposition = 8;
		if(position == 9|| position == 4){
			tiles = button[8].getIcon();
			button[8].setIcon(empty);
			button[position].setIcon(tiles);
			position = 8;
		}
	}
	else if(e.getSource() == button[9])
	{	
		nextposition = 9;
		if(position == 10|| position == 8|| position == 5){
			tiles = button[9].getIcon();
			button[9].setIcon(empty);
			button[position].setIcon(tiles);
			position = 9;
		}
	}
	else if(e.getSource() == button[10])
	{	
		nextposition = 10;
		if(position == 11|| position == 9|| position == 6){	
			tiles = button[10].getIcon();
			button[10].setIcon(empty);
			button[position].setIcon(tiles);
			position = 10;
		}
	}
	else if(e.getSource() == button[11])
	{	
		nextposition = 11;
		if(position == 7|| position == 10){	
			tiles = button[11].getIcon();
			button[11].setIcon(empty);
			button[position].setIcon(tiles);
			position = 11;
		}
      }
    }
 
   public static void main(String args[])
   {
     coursework2 a = new coursework2(); // runs program 
     
  }

 
}

