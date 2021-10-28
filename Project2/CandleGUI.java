//Import required packages
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
//declare the class
@SuppressWarnings("serial")
public class CandleGUI extends JFrame{
//Constructor which takes an array of Box objects as parameter
public CandleGUI(SortedCandleList sortedCandleList,UnsortedCandleList unsortedCandleList){    
  setDefaultCloseOperation(EXIT_ON_CLOSE);
    //GridLayout with 1 row and 2 columns, 
  JFrame a=new JFrame();
  a.setTitle("Project 2");
  a.setSize(200, 100);
  setLayout(new GridLayout(1, 2));
   //Defining a Text area for displaying unsorted list
  
  JTextArea left = new JTextArea();
  
  // making it not editable (by user)
  left.setEditable(false);
  
  String candle = "Unsorted candles\n";
  
  candle+=unsortedCandleList.toString();
  
  //Setting text for unsorted list
  left.setText(candle);
  
  //Adding the text area
  add(left);
  
  //Defining a text area for displaying sorted list, and adding the details of each candles
  JTextArea right = new JTextArea();
  right.setEditable(false);
  
  candle = "Sorted candle\n";
  candle+=sortedCandleList.toString();
  right.setText(candle);
  add(right);
  setVisible(true);
  //Adjust the length and width of the window
  pack();
}
}
