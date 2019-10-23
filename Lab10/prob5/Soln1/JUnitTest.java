package Lab10.prob5.Soln1;

import Lab10.prob5.Employee;
import Lab10.prob5.Main;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class JUnitTest {

    @Test
    public void testasString()
    {
        List<Employee> emps= Arrays.asList(
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000)
        );
        Main main=new Main();
        String test=main.asString(emps.stream());
       // assert (!test.contains("Joe Stevens"));
       // assert (!test.contains("John Sims"));
        assert (test.contains("Alice Richards"));

    }

}
