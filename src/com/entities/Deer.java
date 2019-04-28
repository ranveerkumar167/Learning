package com.entities;

public class Deer extends Herbivores implements Comparable<Deer>{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Deer other = (Deer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Deer(Integer age, String name) {
		setAge(age);
		this.name = name;
		System.out.println("Deer class instantiated");
	}
	
	public void eats() {
		System.out.println("Deer eats grass");
	}

	@Override
	public int compareTo(Deer o) {
		return o.getAge().compareTo(getAge());
	}

	@Override
	public String toString() {
		return "Deer [getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
