
public class BikeBuilder {

	private Bike bike;

	public BikeBuilder buildBike() {
		return this;
	}

	public BikeBuilder setType(String type) {
		bike.setType(type);
 		return this;
	}

	public BikeBuilder newBike() {
		bike = new Bike();
		return this;
	}
	
	public Bike build() {
		return bike;
	}

	public BikeBuilder setTire(String tire) {
		bike.setTire(tire);
		return this;
	}

	public BikeBuilder setHandleBar(String handleBar) {
		bike.setHandleBar(handleBar);
		return this;
	}

}
