package com.aug22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Customer {
	private int custId;
	private String custName; 
	private String city ;
	private double premium ;
	private LocalDate dateOfBirth;
	public Customer(int custId, String custName, String city, double premium, LocalDate dateOfBirth) {
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.premium = premium;
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", premium=" + premium
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}

public class CustomerProject {
	public static void main(String[] args) {
		List<Customer> list=new ArrayList<Customer>();
		list.add(new Customer(1, "Pravin", "Trichy", 200000.33, LocalDate.of(2002, 8, 19)));
		list.add(new Customer(2, "Barath", "Delhi", 20000.2, LocalDate.of(2006, 9, 20)));
		list.add(new Customer(3, "Arunchandar", "Chennai", 70000.0, LocalDate.of(1999, 10, 21)));
		list.add(new Customer(4, "Rishi", "Delhi", 50000.0, LocalDate.of(1968, 11, 22)));
		list.add(new Customer(5, "Vaaghee", "Hyderabad", 25000.33, LocalDate.of(1976, 12, 23)));
		list.add(new Customer(6, "Suruli", "Delhi", 30000.33, LocalDate.of(2000, 1, 23)));
		list.add(new Customer(7, "JP", "Chennai", 90000.0, LocalDate.of(1979, 10, 21)));
		list.add(new Customer(8, "Arun", "Delhi", 50000.0, LocalDate.of(1988, 11, 22)));
		list.add(new Customer(9, "Kalai", "Hyderabad", 25000.33, LocalDate.of(1996, 12, 23)));
		list.add(new Customer(10, "Suriya", "Delhi", 90000.33, LocalDate.of(2000, 1, 23)));
		//Add 10 records and print using foreach method
		list.forEach(customer -> {
			System.out.println(customer);
		});
		//display records whose premium > 80000
		System.out.println("Display records whose premium > 80000");
		list.stream().filter(customer -> customer.getPremium()>80000).forEach(customer ->{
			System.out.println(customer);
		});
		//display who belongs to city delhi
		System.out.println("Display who belongs to city delhi");
		list.stream().filter(customer -> customer.getCity().equalsIgnoreCase("delhi")).forEach(customer ->{
			System.out.println(customer);
		});
		//display sorted by custName
		System.out.println("Display sorted by custName");

		list.sort((c1,c2)-> c1.getCustName().compareTo(c2.getCustName()));
		list.forEach(customer->{
			System.out.println(customer);
		});
		
		//display sorted by dateofbirth 
		System.out.println("Display sorted by dateofbirth");

		list.sort((c1,c2)-> c1.getDateOfBirth().compareTo(c2.getDateOfBirth()));
		list.forEach(customer->{
			System.out.println(customer);
		});
	}
}
