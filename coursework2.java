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

public void actionPerformed(ActionEvent e)
   {
	ImageIcon empty = new ImageIcon("bart0.jpg"); // stores an empty image 
        Icon tiles = new ImageIcon(); // 

	if(e.getSource() == button[0])
	{
		nextposition = 0;	
		if(position == 1|| position == 4){
			tiles = button[0].getIcon();
			button[0].setIcon(empty);
			button[position].setIcon(tiles);
			position = 0;
		}
	}
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
     Coursework a = new Coursework();
     
  }

}
}

