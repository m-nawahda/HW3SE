package shopping;

public class Cshopping {

	
	public int pcount;
	public int totalcount;
	public Cshopping() {
		
		pcount = 0;
		totalcount=0;
	}
	public void add(Book bookk) {
		this.pcount++;
		this.totalcount+=bookk.amount*bookk.price;
	}



}
