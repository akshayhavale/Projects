package com.example.factorypatters;

public class VehicelFactory {

	private static final VehicelFactory INSTANCE = new VehicelFactory();
	private static int count = 0;

	private VehicelFactory() {

	}

	public Vehicle getVehicle(Enum<VehicleType> vehicleType) {
		if (vehicleType.name().equals(VehicleType.TWO_WHEELER.name())) {
			return new TwoWheelerVehicle();
		}
		if (vehicleType.name().equals(VehicleType.FOUR_WHEELER.name())) {
			return new FourWheelerVehicle();
		} else {
			return null;
		}
	}

	public static Vehicle getObject(Enum<VehicleType> vehicleType) {
		if (count == 0) {
			count++;
			return INSTANCE.getVehicle(vehicleType);
		} else {
			return null;
		}
	}

}
