//declare the abstract CandleList
public abstract class CandleList{
//declare local variables
protected CandleNode head , last;
protected int size;

//define the default constructor
public CandleList(){
  head = last = new CandleNode(null);
  size = 0;
}

//implement the method to test the linked list 

public boolean isEmpty(){
  if(size == 0)
  {
   return true;
  }
  else
  {
   return false;
  }
}

//append data to the list
public void append(Candle date){
  //append the date to the last node
  last.next = new CandleNode(date);
  //set the last node to last.next
  last = last.next;
  //increment  size 
  size++;
}

//implement the method toString
public String toString(){
  //define the current node
  CandleNode curr = head.next;
  String str = "";
  //Using while loop to check the current node is null or not
  while(curr != null)  {
   //call the toString()
   str += curr.candle.toString() + "\n";
   //set current to current next
   curr = curr.next;
  		}
  //return the string
  return str;
	}
}