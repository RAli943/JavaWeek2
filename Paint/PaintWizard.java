package Paint;

public class PaintWizard {
	
	private String paintName = "";	
	private int paintQuantity= 0;	
	private int paintCoverage = 0;	
	private double paintPrice = 0;

	public PaintWizard(String name, int quantity, int coverage, double price) {
		this.paintName = name;
		this.paintQuantity = quantity;
		this.paintCoverage = coverage;
		this.paintPrice = price;
	}

	public String getName() {
		return this.paintName;
	}
	
	public int getQuantity() {
		return this.paintQuantity;
	}
	
	public int getCoverage() {
		return this.paintCoverage;
	}
	
	public double getPrice() {
		return this.paintPrice;
	}
	
	public String stringify() {
		 return "[Paint Name: " + this.paintName + ", Coverage (per-litre): " + this.paintCoverage + ", Litres: " + this.paintQuantity + ", Price: " + Double.toString(this.paintPrice) + "]";
	}
	
}