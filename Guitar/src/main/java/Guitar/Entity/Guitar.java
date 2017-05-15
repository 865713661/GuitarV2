package Guitar.Entity;

public class Guitar {

	private int id;
	private int price;
	private GuitarSpec guitarspec;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public GuitarSpec getGuitarspec() {
		return guitarspec;
	}
	public void setGuitarspec(GuitarSpec guitarspec) {
		this.guitarspec = guitarspec;
	}

	

}
