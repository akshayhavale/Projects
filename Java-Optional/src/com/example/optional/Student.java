package com.example.optional;

public class Student extends Parents {

	public Student(int members, Long id, String surname, String fatherName, String motherName, String name) {
		super(members, id, surname, fatherName, motherName);
		this.name = name;
	}

	private String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", getFatherName()=" + getFatherName() + ", getMotherName()=" + getMotherName()
				+ ", getId()=" + getId() + ", getSurname()=" + getSurname() + ", getMembers()=" + getMembers()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}
