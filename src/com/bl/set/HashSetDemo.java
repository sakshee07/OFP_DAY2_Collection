package com.bl.set;

import java.util.HashSet;

class HashSetDemo {
	public static void main(String[] args) {

		HashSet<Employee> set = new HashSet<Employee>();
		Employee employee = new Employee("Sakshee b", 12, "Engineer", 1200);
		Employee employee1 = new Employee("Nmartaa D", 13, "HR", 1500);
		Employee employee2 = new Employee("Akhsay E", 14, "Engineer", 1000);

		set.add(employee);
		set.add(employee1);
		set.add(employee2);
		
		
		for(Employee value:set) {
		
		System.out.println(value.name + " "+value.id + " "+value.departmemt + " "+value.salary );  
		}
	}
}
