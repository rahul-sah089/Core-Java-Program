package com.program.collection.objectSort;

import java.util.Comparator;

public class Party implements Comparable<Party> {
	private int id;
	private String partyName;
	private String nationalRefId;
	private int age;
	private double amount;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getNationalRefId() {
		return nationalRefId;
	}

	public void setNationalRefId(String nationalRefId) {
		this.nationalRefId = nationalRefId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Party party) {
		return (this.id - party.getId());
	}

	public static Comparator<Party> PartyNameComparator = new Comparator<Party>() {
		@Override
		public int compare(Party party1, Party party2) {
			return (party1.getPartyName().compareTo(party2.getPartyName()));
		}
	};

	public static Comparator<Party> PartyNationalRefComparator = new Comparator<Party>() {
		@Override
		public int compare(Party party1, Party party2) {
			return (party1.getNationalRefId().compareTo(party2.getNationalRefId()));
		}
	};

	public static Comparator<Party> AgeComparator = new Comparator<Party>() {
		@Override
		public int compare(Party party1, Party party2) {
			int ageDifference = party1.getAge() - party2.getAge();
			return ageDifference;
		}
	};

	public static Comparator<Party> SalaryComparator = new Comparator<Party>() {
		@Override
		public int compare(Party party1, Party party2) {
			return party1.getAge() - party2.getAge();
		}
	};

	public Party(int id, String partyName, String nationalRefId, int age, double amount, double salary) {
		this.id = id;
		this.partyName = partyName;
		this.nationalRefId = nationalRefId;
		this.age = age;
		this.amount = amount;
		this.salary = salary;
	}

}
