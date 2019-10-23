package Lab10.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Main main=new Main();
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000)).stream();

					//Code By Adnan Shehzad "Passing the Stream Employee a"
					main.printEmps(emps);
	}
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

	public String asString(Stream<Employee> list)
	{
		return list
				.filter(e->salaryGreaterThan100000(e))
				.filter(e-> lastNameAfterM(e))
				.map(e-> fullName(e))
				.sorted()
				.collect(Collectors.joining(" , "));
	}
	public boolean salaryGreaterThan100000(Employee e)
	{
		if(e.getSalary()>100000)
			return true;
		else
		return false;
	}
	public boolean lastNameAfterM(Employee e)
	{
		if(e.getLastName().charAt(0)> 'M')
			return true;
		else
			return false;
	}
	public void printEmps(Stream<Employee> emp)
	{
		System.out.println(asString(emp));
	}
}
