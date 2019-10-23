package Lesson9Part2.prob11a;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		  System.out.println(filterbyNameandSalary.apply(emps,100000,"^[N-Z].*"));
	}

	public static  TriFunction<List<Employee>,Integer,String,String> filterbyNameandSalary=(list,sal,filter)->
			list.stream()
			.filter(in->in.getSalary()>sal && in.getLastName().matches(filter))
			.map(name->name.getFirstName() + " " + name.getLastName())
			.sorted(Comparator.comparing(e->e))
			.reduce((str1,str2)->str1 +"," + str2).get();

	
	
	

}