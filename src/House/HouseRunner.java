package House;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;


public class HouseRunner {
	public static ArrayList<House> houses = new ArrayList<House>();
	
	public static void main(String[] args) 
	//doing throws exception
			throws Exception 
	{
		//Used for setting up houses
		int sqft = 0, beds = 0, cost = 0;
		double baths = 0.0;
		String address = "";
		
		// create an Array List called pets to store Pet instances
			
		
			// then use a loop to scan in all the pets from the file
			Scanner inFile = new Scanner(new File("src/House/HouseData.txt"));
			while( inFile.hasNext()) {
			//scan house into variables
			inFile.nextLine();
			address = inFile.nextLine();
			sqft = inFile.nextInt();
			beds = inFile.nextInt();
			baths = inFile.nextDouble();
			cost = inFile.nextInt();
			
			//Now that we have all variables, puts them into a new pet index and sends
			houses.add(new House(sqft, beds, baths, cost, address));//put variables in House()
			}
			
			init();
	}
	
	public static void init () {
		JFrame frame = new JFrame("Main Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //delete when x button pressed
		frame.setSize(350, 380); //width, height
		
		//create button
			JButton house1 = new JButton(houses.get(0).getAddress()); 
			house1.setBounds(20, 20, 150, 150);
			house1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//what happens when pressed
					
					//create images
					ImageIcon house1 = new ImageIcon("src/House/house1.jpeg");
					//scale if you want
					ImageIcon scaledImage = new ImageIcon(house1.getImage().getScaledInstance(
							200, //width 
							200, //height
							java.awt.Image.SCALE_SMOOTH));
					
					JFrame frame1 = new JFrame(houses.get(0).getAddress()); //creates new window
					frame1.setSize(400, 300); //width, height
					
					JLabel sqft1 = new JLabel(String.valueOf(houses.get(0).getSQFT()) + " square feet."); //New label
					sqft1.setBounds(20, 20, 150, 40); //x, y, width, height
					frame1.add(sqft1); //adds label to frame
					
					JLabel beds1 = new JLabel(String.valueOf(houses.get(0).getBeds()) + " beds."); //New label
					beds1.setBounds(20, 80, 150, 50); //x, y, width, height
					frame1.add(beds1); //adds label to frame
					
					JLabel baths1 = new JLabel(String.valueOf(houses.get(0).getBaths()) + " baths."); //New label
					baths1.setBounds(20, 140, 150, 50); //x, y, width, height
					frame1.add(baths1); //adds label to frame
					
					JLabel cost1 = new JLabel("$" + String.valueOf(houses.get(0).getCost())); //New label
					cost1.setBounds(20, 200, 160, 50); //x, y, width, height
					frame1.add(cost1); //adds label to frame
					
					JLabel pictureLabel1 = new JLabel(scaledImage);
					pictureLabel1.setBounds(170, 35,  //x, y, width, height
							scaledImage.getIconWidth(),
							scaledImage.getIconHeight());
					frame1.add(pictureLabel1);
					
					frame1.setLayout(null); //don't use a default layout
					frame1.setVisible(true); //make visible
				}
			});
			
			
			//create button
			JButton house2 = new JButton(houses.get(1).getAddress()); 
			house2.setBounds(170, 20, 150, 150);
			house2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//what happens when pressed
					
					//create images
					ImageIcon house1 = new ImageIcon("src/House/house2.jpeg");
					//scale if you want
					ImageIcon scaledImage = new ImageIcon(house1.getImage().getScaledInstance(
							200, //width 
							200, //height
							java.awt.Image.SCALE_SMOOTH));
					
					JFrame frame1 = new JFrame(houses.get(1).getAddress()); //creates new window
					frame1.setSize(400, 300); //width, height
					
					JLabel sqft1 = new JLabel(String.valueOf(houses.get(1).getSQFT()) + " square feet."); //New label
					sqft1.setBounds(20, 20, 150, 40); //x, y, width, height
					frame1.add(sqft1); //adds label to frame
					
					JLabel beds1 = new JLabel(String.valueOf(houses.get(1).getBeds()) + " beds."); //New label
					beds1.setBounds(20, 80, 150, 50); //x, y, width, height
					frame1.add(beds1); //adds label to frame
					
					JLabel baths1 = new JLabel(String.valueOf(houses.get(1).getBaths()) + " baths."); //New label
					baths1.setBounds(20, 140, 150, 50); //x, y, width, height
					frame1.add(baths1); //adds label to frame
					
					JLabel cost1 = new JLabel("$" + String.valueOf(houses.get(1).getCost())); //New label
					cost1.setBounds(20, 200, 160, 50); //x, y, width, height
					frame1.add(cost1); //adds label to frame
					
					JLabel pictureLabel1 = new JLabel(scaledImage);
					pictureLabel1.setBounds(170, 35,  //x, y, width, height
							scaledImage.getIconWidth(),
							scaledImage.getIconHeight());
					frame1.add(pictureLabel1);
					
					frame1.setLayout(null); //don't use a default layout
					frame1.setVisible(true); //make visible
				}
			});
			
			//create button
			JButton house3 = new JButton(houses.get(2).getAddress()); 
			house3.setBounds(20, 170, 150, 150);
			house3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//what happens when pressed
					
					//create images
					ImageIcon house1 = new ImageIcon("src/House/house3.jpeg");
					//scale if you want
					ImageIcon scaledImage = new ImageIcon(house1.getImage().getScaledInstance(
							200, //width 
							200, //height
							java.awt.Image.SCALE_SMOOTH));
					
					JFrame frame1 = new JFrame(houses.get(2).getAddress()); //creates new window
					frame1.setSize(400, 300); //width, height
					
					JLabel sqft1 = new JLabel(String.valueOf(houses.get(2).getSQFT()) + " square feet."); //New label
					sqft1.setBounds(20, 20, 150, 40); //x, y, width, height
					frame1.add(sqft1); //adds label to frame
					
					JLabel beds1 = new JLabel(String.valueOf(houses.get(2).getBeds()) + " beds."); //New label
					beds1.setBounds(20, 80, 150, 50); //x, y, width, height
					frame1.add(beds1); //adds label to frame
					
					JLabel baths1 = new JLabel(String.valueOf(houses.get(2).getBaths()) + " baths."); //New label
					baths1.setBounds(20, 140, 150, 50); //x, y, width, height
					frame1.add(baths1); //adds label to frame
					
					JLabel cost1 = new JLabel("$" + String.valueOf(houses.get(2).getCost())); //New label
					cost1.setBounds(20, 200, 160, 50); //x, y, width, height
					frame1.add(cost1); //adds label to frame
					
					JLabel pictureLabel1 = new JLabel(scaledImage);
					pictureLabel1.setBounds(170, 35,  //x, y, width, height
							scaledImage.getIconWidth(),
							scaledImage.getIconHeight());
					frame1.add(pictureLabel1);
					
					frame1.setLayout(null); //don't use a default layout
					frame1.setVisible(true); //make visible
				}
			});
			
			//create button
			JButton house4 = new JButton(houses.get(3).getAddress()); 
			house4.setBounds(170, 170, 150, 150);
			house4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//what happens when pressed
					
					//create images
					ImageIcon house1 = new ImageIcon("src/House/house4.jpeg");
					//scale if you want
					ImageIcon scaledImage = new ImageIcon(house1.getImage().getScaledInstance(
							200, //width 
							200, //height
							java.awt.Image.SCALE_SMOOTH));
					
					JFrame frame1 = new JFrame(houses.get(3).getAddress()); //creates new window
					frame1.setSize(400, 300); //width, height
					
					JLabel sqft1 = new JLabel(String.valueOf(houses.get(3).getSQFT()) + " square feet."); //New label
					sqft1.setBounds(20, 20, 150, 40); //x, y, width, height
					frame1.add(sqft1); //adds label to frame
					
					JLabel beds1 = new JLabel(String.valueOf(houses.get(3).getBeds()) + " beds."); //New label
					beds1.setBounds(20, 80, 150, 50); //x, y, width, height
					frame1.add(beds1); //adds label to frame
					
					JLabel baths1 = new JLabel(String.valueOf(houses.get(3).getBaths()) + " baths."); //New label
					baths1.setBounds(20, 140, 150, 50); //x, y, width, height
					frame1.add(baths1); //adds label to frame
					
					JLabel cost1 = new JLabel("$" + String.valueOf(houses.get(3).getCost())); //New label
					cost1.setBounds(20, 200, 160, 50); //x, y, width, height
					frame1.add(cost1); //adds label to frame
					
					JLabel pictureLabel1 = new JLabel(scaledImage);
					pictureLabel1.setBounds(170, 35,  //x, y, width, height
							scaledImage.getIconWidth(),
							scaledImage.getIconHeight());
					frame1.add(pictureLabel1);
					
					frame1.setLayout(null); //don't use a default layout
					frame1.setVisible(true); //make visible
				}
			});
			
			
			
			frame.add(house1); //adds button
			frame.add(house2); //adds button
			frame.add(house3); //adds button
			frame.add(house4); //adds button
			
			
			frame.setLayout(null); //don't use a default layout
			frame.setVisible(true); //make visible
	}
	
	public static void initHouse (int hNum) {
		
	}
}
