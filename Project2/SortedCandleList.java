//define the class which extends the abstract class
public class SortedCandleList extends CandleList {
//Constructor
public SortedCandleList(){
  //call variables though super keyWord
  super();
}

//implement the method add()
public void add(Candle candle){
  //define the head for the previous and current nodes in the liked list
  CandleNode prev = head,
    curr = head.next;
  //define the nodes
  CandleNode node = new CandleNode(candle);
  
  //Using while loop to compare the price of the candles
  while(curr != null && candle.getPrice() > curr.candle.getPrice()){
   //set previous node as current node
   prev = curr;
   //set current node as next node
   curr = curr.next;
  }
  
  //set node to next is current node
  node.next = curr;
  //previous to next is node
  prev.next = node;
  //If node to next value is null
  if(node.next == null){
   //set that is as last node
   last = node;
   //increment the node
   size++;
  }
}
}