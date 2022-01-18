package gui_test;

import java.awt.event.*;
import javax.swing.*;

public class test {
	public static void main(String[] args) {
		buildGUI();
	}
	
	public static void buildGUI() {
		
		//create frame
		JFrame frame = new JFrame("Basic GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //delete when x button pressed
		frame.setSize(600,400); //width, height
		
		
		//add to frame
		JLabel label1 = new JLabel("Label the First"); //create a text label
		label1.setBounds(20, 40, 150, 30); //x, y, width, height
		frame.add(label1); //adds label to frame
		
		JTextField fieldInput = new JTextField("Type here.... Or else."); //create type field
		fieldInput.setBounds(20, 100, 560, 100); //works the same as line 20
		frame.add(fieldInput); //adds text field to frame
		
		JLabel output = new JLabel("Will output the text box here"); //outputs fieldInput when enter is pressed
		output.setBounds(20, 200, 560, 100); //works same as line 20
		frame.add(output); //adds output when enter is pressed
		
		//create button
		JButton button1 = new JButton("Set new text"); //sus
		button1.setBounds(270, 40, 150, 30);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//what happens when pressed
				
				
				//make the output label say whatever is in the input box
				output.setText(fieldInput.getText());
			}
		});
		frame.add(button1); //adds button
		
		frame.setLayout(null); //don't use a default layout
		frame.setVisible(true); //make visible

 	}
}
