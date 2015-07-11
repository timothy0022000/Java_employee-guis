public class Stock {

  // instance variables
   String symbol;
   String name;
   double previousClosingPrice;
  double currentPrice;


//*********************** WRITE YOUR CONSTRUCTORS HERE ********************************
  // constructors

public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
	this.symbol = symbol;
	this.name = name;
	this.previousClosingPrice = previousClosingPrice;
	this.currentPrice = currentPrice;
}



//*************************************************************************************


  // accessors (get methods)
  public String getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  public double getPreviousClosingPrice() {
    return previousClosingPrice;
  }

  public double getCurrentPrice() {
    return currentPrice;
  }

  // mutators (set methods)
  public void setSymbol( String newSymbol ) {
    symbol = newSymbol;
  }

  public void setName( String newName ) {
    name = newName;
  }

  public void setPreviousClosingPrice( double newPreviousPrice ) {
    previousClosingPrice = newPreviousPrice;
  }

  public void setCurrentPrice( double newCurrentPrice ) {
    currentPrice = newCurrentPrice;
  }

  // toString method
  public String toString() {
    return "Stock name: " + name + "\n" + "Symbol: " + symbol + "\n" + "Previous price: " + previousClosingPrice + "\n" + "Current price: " + currentPrice;
  }

  // domain specific method
  public double computePercentChange() {
    return (currentPrice - previousClosingPrice)/previousClosingPrice*100;
  }
}


class TestStock {
	public static void main (String [] agrs){
		
		Stock s1 = new Stock ("TJ" , "TIM" , 150.00, 100.00);
		String print = s1.toString();
		
		System.out.println(print);
	}

}
