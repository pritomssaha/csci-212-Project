import java.util.StringTokenizer;
/**
 * in this project we have to:
 * a)Create a class called Candle
 * b)Override the method toString which should return the Candle information in the same format as the input file
 * c)parse out the three pieces of information for the Candle using a StringTokenizer, instantiate the Candle and 
 * 	 store the Candle object in two different arrays
 * d)Display the contents of the arrays in a GUI that has a GridLayout with one row and two columns
 * 
 * @author Pritom Saha Shuvo
 * Date: 10/18/2019
 *
 */
public class Project1 {
	
	public static void main(String[] args) {
	Candle[] unsortedcandles =new Candle[16];  
	Candle[] sortedcandles =new Candle[16];
	int countCandle=0;
	/**
	 * will read the text file
	 */
	TextFileInput in  = new TextFileInput("input.txt");
	String line;
	/**
	 * the loop will continue untill line read the last line of the text file
	 */
	 while ((line=in.readLine()) != null) {
         StringTokenizer token = new StringTokenizer(line, ",");
         /**
          * initialize the height, width and the price
          */
         int height, width;
         float price;
         int tokenCount = token.countTokens();
         
         /**count the token number. if there is 3 token then the first will be the height, 
          * the second token will be the width, and 
          * the third token will be price         
          */        
         
         if(tokenCount == 3){
             height = Integer.parseInt(token.nextToken());  //the first token will be height
             width = Integer.parseInt(token.nextToken());	//the second token will be width
             price = Float.parseFloat(token.nextToken());	//the third token will be price
           
           unsortedcandles[countCandle] =new Candle (height,width,price); //object as an array of the candle class
           sortedcandles[countCandle] =new Candle (height,width,price);	  //object as an array of the candle class, this array later will be sort out		
           countCandle++;
         }//end of if statement
         
         incersionsort(sortedcandles,countCandle); //sort the sortedcandles
	 }//end of while
	 
	 
	 new CandleGui( unsortedcandles,sortedcandles);
	 System.out.println("Unsorted list");
	 for(int i=0;i<unsortedcandles.length;i++) {
		 System.out.print(unsortedcandles[i]+" ");
	 }//end of unsortedcandle
	 
	 System.out.print("\n");
	 
	 System.out.println("sorted list");
	 for(int i=0;i<sortedcandles.length;i++) {
		 System.out.print(sortedcandles[i]+" ");
	 }//end of sortedcandle
	
}
	/**
	 * this method is selection sort and it sort the array by their price
	 * @param candles as array of object of Candle class
	 * @param countCandle as length of the array object
	 */

	private static void incersionsort(Candle[] candles, int countCandle) {
		
		for (int i = 0; i < countCandle - 1; i++) {
			//minimum index 
            int min_idx = i;
            
            for (int j = i + 1; j < countCandle; j++)
            	//if the value at minimum index is greater than jth index, then it will swap 
                if (candles[j].getPrice() < candles[min_idx].getPrice())
                    min_idx = j;         
        
            Candle temp = candles[min_idx];
            candles[min_idx] = candles[i];
            candles[i] = temp;
			}//end of for loop
		}//end of sort method
}//main
