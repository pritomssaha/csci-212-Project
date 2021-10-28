
/*
 * Project2
 * Name: Pritom Saha Shuvo
 **/


//Import required classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
//Define the class name Project2
public class Project2{
//main method
	
public static void main(String[] args) throws FileNotFoundException{
  //Defining sorted and unsorted Candle lists objects
  SortedCandleList sortedCandleListObject = new SortedCandleList();
  UnsortedCandleList unsortedCandleList = new UnsortedCandleList();
  //Read File
  @SuppressWarnings("resource")
  Scanner readFile = new Scanner(new File("input.txt"));
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
         sortedCandleListObject.add(candleObject);
         unsortedCandleList.add(candleObject);
      		}
      
  		}
  
  	new CandleGUI(sortedCandleListObject, unsortedCandleList);
	}
}