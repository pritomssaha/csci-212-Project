import javax.swing.*;
import java.awt.*;
/**
 * 
 * @author Pritom Saha Shuvo
 * this is the gui file. It has gridLayout of 1 column and 2 rows
 * 
 */

public class CandleGui {
	/**
	 * 
	 * @param unsortedcandles
	 * @param sortedcandles
	 */
	
	public CandleGui(Candle[] unsortedcandles,Candle[] sortedcandles){
		
		createAndShowGUI(unsortedcandles,sortedcandles);

	}
	
	private void createAndShowGUI(Candle[] unsortedcandles,Candle[] sortedcandles) {
		   JFrame frame = new JFrame("Project1");
	       frame.setLayout(new GridLayout(1,2));
	      
	       StringBuilder unsortedCandlesBuilder = new StringBuilder("<html>");
	       StringBuilder sortedCandlesBuilder = new StringBuilder("<html>");
	       unsortedCandlesBuilder.append("Unsorted Candle"+"<br/>");
	       for(Candle candle:unsortedcandles) {
	           unsortedCandlesBuilder.append(candle);
	           unsortedCandlesBuilder.append("<br/>");
	          
	       }
	       unsortedCandlesBuilder.append("</html>");
	       sortedCandlesBuilder.append("Sorted Candle"+"<br/>");
	       
	       for(Candle candle:sortedcandles) {
	           sortedCandlesBuilder.append(candle);
	           sortedCandlesBuilder.append("<br/>");
	       }
	       sortedCandlesBuilder.append("</html>");
	       JLabel unsortedCandlesLabel = new JLabel(unsortedCandlesBuilder.toString());
	       JLabel sortedCandlesLabel = new JLabel(sortedCandlesBuilder.toString());
	      
	       frame.add(unsortedCandlesLabel);
	       frame.add(sortedCandlesLabel);
	       frame.setSize(350,350);
	      
	       frame.setVisible(true);	
	}
	
}
