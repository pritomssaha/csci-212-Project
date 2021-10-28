import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   
   /*
    * Constructor
    */
   public FileMenuHandler (JFrame jf) {
      jframe = jf;
   }
   
   /*
    * ActionPerformed method
    * only execute if user click Open or Quit 
    */
   public void actionPerformed(ActionEvent event) {
      String  menuName;
      menuName = event.getActionCommand();
      
      if (menuName.equals("Open"))
		try {
			openFile( );
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	else if (menuName.equals("Quit"))
         System.exit(0);
   } //actionPerformed
   
   /**
    * Open the file 
    * @throws FileNotFoundException
    */

    private void openFile( ) throws FileNotFoundException {
       JFileChooser chooser;
       int          status;
       chooser = new JFileChooser( );
       status = chooser.showOpenDialog(null);
       
       
       if (status == JFileChooser.APPROVE_OPTION) { 
    	  File fileselected =chooser.getSelectedFile();
    	  System.out.println("File Selected "+ fileselected.getAbsolutePath());
          readSource(chooser.getSelectedFile());
       }
       else 
          JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    } //openFile
    
    
  /**
   * 
   * @param chosenFile
   * @throws FileNotFoundException
   * read the file, token by height, width and price and show it on the 
   * GUI using GridLayout
   */
    private void readSource(File chosenFile) throws FileNotFoundException {
    	 //Defining sorted and unsorted Candle lists objects
       SortedCandleList sortedCandleList = new SortedCandleList();
       UnsortedCandleList unsortedCandleList = new UnsortedCandleList(); 
       
       String chosenFileName = chosenFile.getName();
       
       @SuppressWarnings("resource")
       Scanner readFile = new Scanner(new File(chosenFileName));
       
       //create a gridlayout
       GridLayout layout = new GridLayout(1,2);
       jframe.setLayout(layout);       
       Container myContentPane = jframe.getContentPane();
       
       //create two textarea. one for sorted candle and another for unsorted candle 
       TextArea sortedcandle = new TextArea();
       TextArea unsortedcandle = new TextArea();
       
       myContentPane.add(sortedcandle);
       myContentPane.add(unsortedcandle);       
       
       //while the textfile is not null the loop will continue
       while(readFile.hasNextLine()) {
    	      StringTokenizer token = new StringTokenizer(readFile.nextLine(), ",");
    	      
    	      if(token.countTokens()!=3){  
    	          System.out.println(token.toString());
    	      }
    	      
    	      else{
    	    	 int height = Integer.parseInt(token.nextToken());  //the first token will be height
    	         int width = Integer.parseInt(token.nextToken());	//the second token will be width
    	         float price = Float.parseFloat(token.nextToken());	//the third token will be price
    	         Candle candleObject = new Candle(height, width, price);
    	         //Add Candle objects to the classes
    	         sortedCandleList.add(candleObject);
    	         unsortedCandleList.add(candleObject);    
    	         
       	     }//else    
    	     
    	}//while
       
       
       unsortedcandle.append("Unsorted Candle List\n\n");
       sortedcandle.append("Sorted Candle List\n\n");
       
       unsortedcandle.append(unsortedCandleList.toString());
       sortedcandle.append(sortedCandleList.toString());
       jframe.setVisible(true);
              
    }
}