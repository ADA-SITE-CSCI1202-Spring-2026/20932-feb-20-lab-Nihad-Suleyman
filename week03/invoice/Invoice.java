package week03.invoice;

public class Invoice {
	private String partn;
	private String partd;
	private int quantity;
	private double price;

	public Invoice(String partn, String partd, int quantity, double price) {
		this.partn = partn;
		this.partd = partd;
		this.quantity = quantity;
		this.price = price;
	}

	public String getpartn() {
		return partn;
	}

	public void setpartn(String partn) {
		this.partn = partn;
	}

	public String getPartDescription() {
		return partd;
	}

	public void setPartDescription(String partd) {
		this.partd = partd;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getprice() {
		return price;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public double getInvoiceAmount() {
		return quantity * price;
	}
}