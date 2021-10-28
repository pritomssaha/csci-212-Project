
//Pritom Saha Shuvo
//CSCI 212-11B

import javax.swing.*;
public class Project0{

	public static void main(String[] args){	
	
		while(true){
		int lower_e=0;   //initial value of all lower case e
		int upper_E=0;	 //initial value of all upper case E
		String y="Stop"; 	
		
		String input=JOptionPane.showInputDialog(null,"Please Enter a sentence: ");  //ask the user to type a sentence
		
		if(input.equalsIgnoreCase(y))	//if user type stop the program will terminate				
			System.exit(0);
			
		else{
			for(int i=0;i<input.length();i++){
				if(input.charAt(i)=='e'){
					lower_e++;		//count the all lower case e
					}
				else if(input.charAt(i)=='E'){
					upper_E++;		//count the all upper case E
					}
				}
				JOptionPane.showMessageDialog(null,"Number of lower case letter e's: "+lower_e+"\nNumber of Upper case letter E's: "+upper_E);		//print all the upper and lower case e
			}
		}
	}

}