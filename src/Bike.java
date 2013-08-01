
public class Bike {
	
	private int speed;
	private String type;
	private String tire;
	private String handleBar;
	
	public Bike() {
		speed = 0;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void changeSpeed(int change) {
		speed += change;
	}

	public void setType(String type) {
		this.type = type;
		if (type == "racing") {			
			speed += 3;
		}
		if (type == "fixed") {
			speed += 2;
		}
		if (type == "mountain") {
			speed += 1;
		}
	}

	public void setTire(String tire) {
		this.tire = tire;
		if (tire == "flat") {
			speed += 1;
		}
		if (tire == "skinny") {
			speed += 2;
		}
		if (tire == "windbreak") {
			speed += 3;
		}
	}

	public void setHandleBar(String handleBar) {
		this.handleBar = handleBar;
		if (handleBar == "rollover") {
			speed += 1;
		}
		if (handleBar == "bullhorn") {
			speed += 1;
		}
		if (handleBar == "straight") {
			speed -= 1;
		}
	}
}
