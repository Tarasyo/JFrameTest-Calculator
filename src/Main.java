import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Main extends JFrame {
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Main();
	}
	
	public Main() {
		//setting of the window
		this.setVisible(true);
		this.setSize(520,560);
		this.setTitle("Test");
		
		
		FlowLayout manager = new FlowLayout();
		this.setLayout(manager);
	
		
		//text field settings
		JTextField myTF = new JTextField(45);
		this.add(myTF);
		myTF.setPreferredSize(new Dimension(500, 100));
        myTF.setMaximumSize(new Dimension(800, 300));
		myTF.setMinimumSize(new Dimension(250, 50));
		myTF.setText("People like numbers");
	
		//Panel and its settings
		GridLayout manager2 = new GridLayout(5, 4);
		JPanel myPanel = new JPanel();
		
		//size of panel, how buttons will look 
		myPanel.setPreferredSize(new Dimension(500, 400));
        myPanel.setMaximumSize(new Dimension(800, 700));
		myPanel.setMinimumSize(new Dimension(400, 300));
		myPanel.setLayout(manager2);
		this.add(myPanel);
		
		
		//First row
		JButton myButton = new JButton("CE");
		myPanel.add(myButton);
		JButton myButton2 = new JButton("C");
		myPanel.add(myButton2);
		JButton myButton3 = new JButton("<=");
		myPanel.add(myButton3);
		JButton myButton4 = new JButton("÷");
		myPanel.add(myButton4);
		
		//Second row
		JButton myButton5 = new JButton("7");
		myPanel.add(myButton5);
		JButton myButton6 = new JButton("8");
		myPanel.add(myButton6);
		JButton myButton7 = new JButton("9");
		myPanel.add(myButton7);
		JButton myButton8 = new JButton("x");
		myPanel.add(myButton8);
		
		//third row
		JButton myButton9 = new JButton("4");
		myPanel.add(myButton9);
		JButton myButton10 = new JButton("5");
		myPanel.add(myButton10);
		JButton myButton11 = new JButton("6");
		myPanel.add(myButton11);
		JButton myButton12 = new JButton("-");
		myPanel.add(myButton12);
		
		//Fourth row 
		JButton myButton13 = new JButton("1");
		myPanel.add(myButton13);
		JButton myButton14 = new JButton("2");
		myPanel.add(myButton14);
		JButton myButton15 = new JButton("3");
		myPanel.add(myButton15);
		JButton myButton16 = new JButton("+");
		myPanel.add(myButton16);
		
		//Fifth row
		JButton myButton17 = new JButton("+/-");
		myPanel.add(myButton17);
		JButton myButton18 = new JButton("0");
		myPanel.add(myButton18);
		JButton myButton19 = new JButton(".");
		myPanel.add(myButton19);
		JButton myButton20 = new JButton("=");
		myPanel.add(myButton20);
		
		this.validate();
		this.repaint();
	}

}