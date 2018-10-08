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
	
	int sum;
	int num1;
	int num2;
	
	
	
	
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
					
					if(button.getText().equals("+")) {
						
						num1 = Integer.valueOf(myTF.getText());
						System.out.println(num1);
						myTF.setText("");

					}else if(button.getText().equals("=")) {
						num2 = Integer.valueOf(myTF.getText());
						System.out.println(num2);
						myTF.setText("");
						sum = num1 + num2;
						System.out.println(sum);
						myTF.setText(String.valueOf(sum));
					}else{
						myTF.setText(myTF.getText()+button.getText());
						
					}
				
					
					
				}});
		}
		
		
		
		
		
		this.validate();
		this.repaint();
	}

}