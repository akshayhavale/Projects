package com.example.factorypatters;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		TwoWheelerVehicle vehicle = (TwoWheelerVehicle) VehicelFactory.getObject(VehicleType.TWO_WHEELER);
		
		vehicle.setVehicleCompany("Royal Enfield");
		vehicle.setChessiNumber("RHG675BHS");
		
		System.out.println(vehicle);
		
		TwoWheelerVehicle vehicle1 = (TwoWheelerVehicle) VehicelFactory.getObject(VehicleType.TWO_WHEELER);
		
		vehicle1.setVehicleCompany("Royal Enfield1");
		vehicle1.setChessiNumber("RHG675BHS1");
		
		System.out.println(vehicle1);
		
	}

}
