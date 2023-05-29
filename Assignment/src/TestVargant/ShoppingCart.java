package TestVargant;

public class ShoppingCart {
	
	private String product;
	private int unitprice;
	private double gst;
	private int quantity;
	
	ShoppingCart(String product, int unitprice , float gst, int quantity){
		this.product = product;
		this.unitprice =unitprice;
		this.gst=gst;
		this.quantity=quantity;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getUnitprice() {
		if(this.unitprice>500)
			this.unitprice -=500;
		return unitprice;
	}
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(float gst) {
		this.gst = gst;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
