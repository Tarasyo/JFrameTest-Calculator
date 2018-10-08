import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Main extends JFrame {
	
	
	double sum;
	double num1;
	double num2;
	boolean plus = false;
	boolean minus = false;
	boolean mult = false;
	boolean div = false;
	
	
	
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
		myTF.setEditable(false);
		myTF.setPreferredSize(new Dimension(500, 100));
        myTF.setMaximumSize(new Dimension(800, 300));
		myTF.setMinimumSize(new Dimension(250, 50));
	
		//Panel and its settings
		GridLayout manager2 = new GridLayout(5, 4);
		JPanel myPanel = new JPanel();
		
		//size of panel, how buttons will look 
		myPanel.setPreferredSize(new Dimension(500, 400));
        myPanel.setMaximumSize(new Dimension(800, 700));
		myPanel.setMinimumSize(new Dimension(400, 300));
		myPanel.setLayout(manager2);
		this.add(myPanel);
		
		
		
		ArrayList <JButton> buttons = new ArrayList<>();
		buttons.add(new JButton("CE"));
		buttons.add(new JButton("C"));
		buttons.add(new JButton("<="));
		buttons.add(new JButton("÷"));
		
		//Second row
		buttons.add(new JButton("7"));
		buttons.add(new JButton("8"));
		buttons.add(new JButton("9"));
		buttons.add(new JButton("*"));
		
		
		//third row
		buttons.add(new JButton("4"));
		buttons.add(new JButton("5"));
		buttons.add(new JButton("6"));
		buttons.add(new JButton("-"));
		
		//Fourth row 
		buttons.add(new JButton("1"));
		buttons.add(new JButton("2"));
		buttons.add(new JButton("3"));
		buttons.add(new JButton("+"));
		
		
		//Fifth row
		buttons.add(new JButton("+/-"));
		buttons.add(new JButton("0"));
		buttons.add(new JButton("."));
		buttons.add(new JButton("="));
		
		
		
		for(JButton button : buttons) {
			myPanel.add(button);
			
			button.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					//If plus button is pressed we will save first number and clean the text field
					if(button.getText().equals("+")) {
						
						num1 = Double.valueOf(myTF.getText());
						
						plus = true; 	//Make sure that boolean are right the same will do when its minus
						minus = false;
						mult = false;
						div = false;
						
						myTF.setText("");
					}
					//If minus button is pressed do this part 
					else if(button.getText().equals("-")) {
							
						num1 = Double.valueOf(myTF.getText());
						
						minus = true;  
						plus = false;
						mult = false;
						div = false;
							
						myTF.setText("");
					
					//The same function for multiplication
					}else if(button.getText().equals("*")) {
							
						num1 = Double.valueOf(myTF.getText());
							
						minus = false;  
						plus = false;
						mult = true;
						div = false;
								
						myTF.setText("");
							
					
					
					}else if(button.getText().equals("÷")) {
						
						num1 = Double.valueOf(myTF.getText());
							
						minus = false;  
						plus = false;
						mult = false;
						div = true;
								
						myTF.setText("");
							
						
					//if equal sign and plus sign was pressed then plus 2 numbers and show the result
					}else if(button.getText().equals("=") && plus == true ) {
						
						num2 = Double.valueOf(myTF.getText());
						
						myTF.setText("");
						
						sum = num1 + num2;
						myTF.setText(String.valueOf(sum));
						num1 = sum;
					
					//if equal sign and minus sign was pressed then minus  numbers and show the result
					}else if(button.getText().equals("=") && minus == true) {
						
						num2 = Double.valueOf(myTF.getText());
						
						myTF.setText("");
						
						sum = num1 - num2;
						myTF.setText(String.valueOf(sum));
						num1 = sum;
					
					//if equal sign and multiplication sign was pressed then multiply 2 numbers and show the result	
					}else if(button.getText().equals("=") && mult == true ) {
						
						num2 = Double.valueOf(myTF.getText());
						
						myTF.setText("");
						
						sum = num1 * num2;
						myTF.setText(String.valueOf(sum));
						num1 = sum;
					
					//if equal sign and division sign was pressed then divide numbers and show the result
					}else if(button.getText().equals("=") && div == true ) {
						
						num2 = Double.valueOf(myTF.getText());
						
						myTF.setText("");
						
						sum = num1 / num2;
						myTF.setText(String.valueOf(sum));
						num1 = sum;
					
					//Cleaning all variables and the text field if 'C' or 'CE' are pressed
					}else if(button.getText().equals("C") || button.getText().equals("CE")) {
						
						num1 = 0;
						num2 = 0;
						minus = false;  
						plus = false;
						mult = false;
						div = false;
						
						
						myTF.setText("");
					
					// if sign '<=' is pressed then remove last character from the text field
					}else if(button.getText().equals("<=")) {
						
					myTF.setText(myTF.getText().substring(0, myTF.getText().length() - 1));	
						
						
					
					//If nothing of them are pressed just continue working 
					}else{
						myTF.setText(myTF.getText()+button.getText());
						
					}
				
					
					
				}});
		}
		
		
		
		
		
		this.validate();
		this.repaint();
	}

}