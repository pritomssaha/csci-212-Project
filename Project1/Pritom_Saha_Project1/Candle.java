/**
 * 
 * @author Pritom Saha Shuvo
 * This is the candle class
 *
 */
public class Candle {
   private int height;
   private int width;
   private float price;
   private boolean isLit;
   public Candle(int height, int width, float price) {
       this.height = height;
       this.width = width;
       this.price = price;
       this.isLit = false;
   }//constructor
   /**
    * 
    * @return the height of the candle
    */
   public int getHeight() {
       return height;
   }
   /**
    * 
    * @param height will set the height
    */
   public void setHeight(int height) {
       this.height = height;
   }
   /**
    * 
    * @return the width of the candle
    */
   public int getWidth() {
       return width;
   }
   /**
    * 
    * @param width the width of the candle
    */
   public void setWidth(int width) {
       this.width = width;
   }
   /**
    * 
    * @return the price of the candle
    */
   public float getPrice() {
       return price;
   }
   /**
    * 
    * @param price the price of the candle 
    */
   public void setPrice(float price) {
       this.price = price;
   }
   /**
    *	 
    * @return if the candle is lit
    */
   public boolean isLit() {
       return isLit;
   }
   /**
    * 
    * @param isLit assign the value the candle is lit
    */
   public void setLit(boolean isLit) {
       this.isLit = isLit;
   }
   /**
    * return the Candle information in the same format as the input file
    */
   public String toString() {
       return this.height + "," + this.width + "," + this.price ;
   }
}