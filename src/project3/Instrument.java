package project3;

public class Instrument {

	private String serialNumber;
	private double price;
	private InstrumentSpec spec;
	
	public Instrument (String serialNumber, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	// シリアルナンバーと価格用のgetとsetメソッド
	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	public InstrumentSpec getSpec() {
		return spec;
	}
	
}
