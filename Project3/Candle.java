//declare class which implements
//comparable interface
public class Candle{
	int height;
	int width;
	float price;
	boolean islit;
  
   //Default constructor
   public Candle(){
       this.height=0;
       this.width=0;
       this.price=0.0f;
       this.islit=false;
       
   }
 //getter and setter method for Islit
   public boolean isIslit()   {
     return islit;
   }
   public void setIslit(boolean islit){
     this.islit = islit;
   }
   //getter and setter method for height
   public int getHeight(){
     return height;
   }
   public void setHeight(int height){
     this.height = height;
   }

   //getter and setter method for width
   public int getWidth(){
     return width;
   }
   public void setWidth(int width){
     this.width = width;
   }

   //getter and setter method for price
   public float getPrice(){
     return price;
   }
   public void setPrice(float price){
     this.price = price;
   }
  
   
 //paremetrized construtor
   public Candle(int height, int width,double price){
     super();
     this.height = height;
     this.width = width;
     this.price = (float) price;
     this.islit = false;
   }
  
   //override method toString()
   @Override
   public String toString(){
	   return height + "," + width+ ", " + price;
   }
}
   