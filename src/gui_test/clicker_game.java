package gui_test;

import java.awt.event.*;
import javax.swing.*;

public class clicker_game {
	public static int clicks = 0;
	public static int money = 0;
	public static int level = 1;
	public static int upgradeCost = 25;
	public static int boostCost = 100;
	public static int boostedClicks = 0;
	public static boolean isBoosted = false;
	
	public static void main(String[] args) {
		buildGUI();
	}
	
	public static void buildGUI() {
		
		//create frame
		JFrame frame = new JFrame("Clicker Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //delete when x button pressed
		frame.setSize(500, 450); //width, height
		
		
		//how many clicks
		JLabel label1 = new JLabel("Clicks: "); //create a text label
		label1.setBounds(20, 40, 150, 30); //x, y, width, height
		frame.add(label1); //adds label to frame
		
		
		//how many clicks
		JLabel clicksAmount = new JLabel(String.valueOf(clicks)); //create a text label
		clicksAmount.setBounds(100, 40, 150, 30); //x, y, width, height
		frame.add(clicksAmount); //adds label to frame
		
		
		//how much money
		JLabel label2 = new JLabel("Money: "); //create a text label
		label2.setBounds(20, 80, 150, 30); //x, y, width, height
		frame.add(label2); //adds label to frame
		
		
		//how much money
		JLabel moneyAmount = new JLabel(String.valueOf(money)); //create a text label
		moneyAmount.setBounds(100, 80, 150, 30); //x, y, width, height
		frame.add(moneyAmount); //adds label to frame
		
		
		//is boosted?
		JLabel isBoosted1 = new JLabel("Boosted?: "); //create a text label
		isBoosted1.setBounds(20, 120, 150, 30); //x, y, width, height
		frame.add(isBoosted1); //adds label to frame
		
		
		//s boosted?
		JLabel isBoosted2 = new JLabel(String.valueOf(isBoosted)); //create a text label
		isBoosted2.setBounds(100, 120, 150, 30); //x, y, width, height
		frame.add(isBoosted2); //adds label to frame
		
		
		//shows how much an upgrade is
		JLabel label3 = new JLabel("Cost to Upgrade: $"); //create a text label
		label3.setBounds(310, 10, 150, 30); //x, y, width, height
		frame.add(label3); //adds label to frame
		
		
		//shows how much an upgrade is
		JLabel label4 = new JLabel(String.valueOf(upgradeCost)); //create a text label
		label4.setBounds(460, 10, 150, 30); //x, y, width, height
		frame.add(label4); //adds label to frame
		
		
		//shows what level you are
		JLabel levelNumber = new JLabel("Level: "); //create a text label
		levelNumber.setBounds(20, 160, 150, 30); //x, y, width, height
		frame.add(levelNumber); //adds label to frame
				
				
		//shows how much an upgrade is
		JLabel label5 = new JLabel(String.valueOf(level)); //create a text labe
		label5.setBounds(100, 160, 150, 30); //x, y, width, height
		frame.add(label5); //adds label to frame
		
		
		//shows how much an upgrade is
		JLabel label6 = new JLabel("Cost to Boost: $"); //create a text label
		label6.setBounds(310, 190, 150, 30); //x, y, width, height
		frame.add(label6); //adds label to frame
				
				
		//shows how much an upgrade is
		JLabel label7 = new JLabel(String.valueOf(boostCost)); //create a text label
		label7.setBounds(460, 190, 150, 30); //x, y, width, height
		frame.add(label7); //adds label to frame
		
		
		
		
//		JTextField fieldInput = new JTextField("Type here.... Or else."); //create type field
//		fieldInput.setBounds(20, 100, 560, 100); //works the same as line 20
//		frame.add(fieldInput); //adds text field to frame
		
		
//		JLabel output = new JLabel("Will output the text box here"); //outputs fieldInput when enter is pressed
//		output.setBounds(20, 200, 560, 100); //works same as line 20
//		frame.add(output); //adds output when enter is pressed
//		
		
		//create button
		JButton clicker = new JButton("Click for Money!"); 
		clicker.setBounds(150, 40, 150, 150);
		clicker.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//what happens when pressed

				//make the output label say whatever is in the input box
				addToClicks(); //runs methods to increase variables
				addMoney();
				clicksAmount.setText(String.valueOf(clicks));//updates labels
				moneyAmount.setText(String.valueOf(money));
				isBoosted2.setText(String.valueOf(isBoosted)); //updates labels
			}
		});
		frame.add(clicker); //adds button
		
		
		JButton upgrader = new JButton("Upgrade Money Per Click"); 
		upgrader.setBounds(310, 40, 150, 150);
		upgrader.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//what happens when pressed

				//make the output label say whatever is in the input box
				upgrade();//runs methods to increase variable
				label4.setText(String.valueOf(upgradeCost)); //updates labels
				moneyAmount.setText(String.valueOf(money));
				label5.setText(String.valueOf(level));
			}
		});
		frame.add(upgrader); //adds button
		
		
		JButton booster = new JButton("x5 $ for 50 Clicks"); 
		booster.setBounds(310, 230, 150, 150);
		booster.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//what happens when pressed

				//make the output label say whatever is in the input box
				booster();//runs methods to increase variable
				isBoosted2.setText(String.valueOf(isBoosted)); //updates labels
				moneyAmount.setText(String.valueOf(money));
				label7.setText(String.valueOf(boostCost)); //updates labels
			}
		});
		frame.add(booster); //adds button
		
		
		frame.setLayout(null); //don't use a default layout
		frame.setVisible(true); //make visible

 	}
	
	public static void addToClicks() {
		clicks++; //increases click counter
	}
	
	public static void addMoney() {
		if (boostedClicks > 0) {
			boostedClicks--;
			money += (level * 5); //increases money per click
		}
		else {
			money += level; //increases money per click
			isBoosted = false; //updates isBoosted
		}
	}

	public static void upgrade() {
		if (money >= upgradeCost) {
			money -= upgradeCost; //subtracts money
			level++; // increases money gain
			upgradeCost *= level; //increases next upgrade cost
		}
	}
	public static void booster() {
		if (money >= boostCost && boostedClicks == 0) {
			money -= boostCost; //subtracts money
			boostedClicks = 50; //sets boosted clicks
			boostCost *= 5; //increases next upgrade cost
			isBoosted = true;
		}
		
	}
}
