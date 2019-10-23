package Lab10.prob5.Soln2;

import Lab10.prob5.Employee;
import Lab10.prob5.Main;
import org.junit.Assert;
import org.junit.Test;

import static Lab10.prob5.Main.*;

public class JunitTest {
    //Testing these MEthods provide a good method as we are testing these methods individually and
    //came to know that every function we are writing are working properly according to our fuctionality.
    @Test
    public void TestSalaryGreaterthan100000() {
        Employee employee1 = new Employee("John", "Sims", 110000);
        Employee employee2 = new Employee("Joe", "Stevens", 200000);
        Employee employee3 = new Employee("Andrew", "Reardon", 80000);
        Employee employee4 = new Employee("Joe", "Cummings", 760000);
        Main test = new Main();
        assert (test.salaryGreaterThan100000(employee1));
        assert (test.salaryGreaterThan100000(employee2));
        assert (!test.salaryGreaterThan100000(employee3));
        assert (test.salaryGreaterThan100000(employee4));
    }

    @Test
    public void TestEmployeesWithLastNameAfterM() {
        Employee employee1 = new Employee("John", "Sims", 110000);
        Employee employee2 = new Employee("Joe", "Stevens", 200000);
        Employee employee3 = new Employee("Andrew", "Reardon", 80000);
        Employee employee4 = new Employee("Joe", "Cummings", 760000);
        Main test = new Main();
        assert (test.lastNameAfterM(employee1));
        assert (test.lastNameAfterM(employee2));
        assert (test.lastNameAfterM(employee3));
        assert (!test.lastNameAfterM(employee4));
    }

    @Test
    public void TestEmployeesFullName() {
        Employee employee1 = new Employee("John", "Sims", 110000);
        Employee employee2 = new Employee("Joe", "Stevens", 200000);
        Employee employee3 = new Employee("Andrew", "Reardon", 80000);
        Employee employee4 = new Employee("Joe", "Cummings", 760000);
        String out=Main.fullName(employee1);
        Assert.assertEquals("John Sims", fullName(employee1));
        Assert.assertEquals("Joe Stevens", fullName(employee2));
        //Assert.assertEquals("John Sims", fullName(employee3));
        //Assert.assertEquals("John Sims", fullName(employee4));
    }
}
