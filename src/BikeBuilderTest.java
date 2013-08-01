import static org.junit.Assert.*;

import org.junit.Test;


public class BikeBuilderTest {
	BikeBuilder builder = new BikeBuilder();
	
	@Test
	public void test_mountain() {
		Bike bike = builder.newBike().setType("mountain").build();
		assertEquals(1, bike.getSpeed());
	}
	
	@Test
	public void test_fixed() {
		Bike bike = builder.newBike().setType("fixed").build();
		assertEquals(2, bike.getSpeed());
	}

	@Test
	public void test_racing() {
		Bike bike = builder.newBike().setType("racing").build();
		assertEquals(3, bike.getSpeed());
	}

	@Test
	public void test_flat() {
		Bike bike = builder.newBike().setTire("flat").build();
		assertEquals(1, bike.getSpeed());
	}

	@Test
	public void test_skinny() {
		Bike bike = builder.newBike().setTire("skinny").build();
		assertEquals(2, bike.getSpeed());
	}

	@Test
	public void test_windbreak() {
		Bike bike = builder.newBike().setTire("windbreak").build();
		assertEquals(3, bike.getSpeed());
	}
	
	@Test
	public void test_rollover() {
		Bike bike = builder.newBike().setHandleBar("rollover").build();
		assertEquals(1, bike.getSpeed());
	}
	
	@Test
	public void test_bullhorn() {
		Bike bike = builder.newBike().setHandleBar("bullhorn").build();
		assertEquals(1, bike.getSpeed());
	}
	
	@Test
	public void test_straight() {
		Bike bike = builder.newBike().setHandleBar("straight").build();
		assertEquals(-1, bike.getSpeed());
	}

	@Test
	public void test_all() {
		Bike bike = builder.newBike().setType("racing").setHandleBar("straight").setTire("flat").build();
		assertEquals(3, bike.getSpeed());
	}
}
