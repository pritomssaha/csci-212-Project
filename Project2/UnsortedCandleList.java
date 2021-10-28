//define the class UnsortedBoxList which extends the //CandleList
public class UnsortedCandleList extends CandleList {
//define the Constructor
public UnsortedCandleList()
{
  //call the variables
  super();
}

//implement the method add
public void add(Candle unsortedCandle)
{
  //just append values to the text area
  append(unsortedCandle);
}
}