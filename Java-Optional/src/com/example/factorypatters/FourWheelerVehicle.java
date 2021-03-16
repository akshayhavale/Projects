package com.example.factorypatters;

public class FourWheelerVehicle extends Vehicle {

	private String vehicleCompany;

	private String chessiNumber;

	public FourWheelerVehicle() {
		// TODO Auto-generated constructor stub
	}

	public FourWheelerVehicle(String vehicleCompany, String chessiNumber) {
		super();
		this.vehicleCompany = vehicleCompany;
		this.chessiNumber = chessiNumber;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getChessiNumber() {
		return chessiNumber;
	}

	public void setChessiNumber(String chessiNumber) {
		this.chessiNumber = chessiNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chessiNumber == null) ? 0 : chessiNumber.hashCode());
		result = prime * result + ((vehicleCompany == null) ? 0 : vehicleCompany.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FourWheelerVehicle other = (FourWheelerVehicle) obj;
		if (chessiNumber == null) {
			if (other.chessiNumber != null)
				return false;
		} else if (!chessiNumber.equals(other.chessiNumber))
			return false;
		if (vehicleCompany == null) {
			if (other.vehicleCompany != null)
				return false;
		} else if (!vehicleCompany.equals(other.vehicleCompany))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FourWheelerVehicle [vehicleCompany=" + vehicleCompany + ", chessiNumber=" + chessiNumber + "]";
	}

}
