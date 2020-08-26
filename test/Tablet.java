package test;

class NegativeQtyException extends Exception
{
	NegativeQtyException(String s)
	{
		super(s);
	}
}

public class Tablet {
	
	String tabname;
	int price;
	int qty;
	
	public Tablet(String tabname,int pr,int q)
	{
		this.tabname=tabname;
		price=pr;
		qty=q;
	}
	public String getTabname() {
		return tabname;
	}
	public void setTabname(String tabname) {
		this.tabname = tabname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int calculateCost()
	{
		return qty*price;
	}
	
   public boolean validateTabname()
   {
	   return tabname.length()>=3;
	   
   }
   
   public boolean validatePrice()
   {
	   if (price<=0)
			   return false;
	   else
		   return true;
   }
	public boolean validateQty() throws NegativeQtyException
	{
		if (qty<0)
			throw new NegativeQtyException("Qty<0");
		else
			return true;
		
	}
   
   
}
