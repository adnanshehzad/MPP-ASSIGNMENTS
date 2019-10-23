package Lesson9Part2.prob11b;

import Lesson9Part2.prob11a.TriFunction;

import java.util.Comparator;
import java.util.List;

public class CLambdaLibrary {
    public static final TriFunction<List<Employee>,Integer,String,String> filterbyNameandSalary=(list, sal, filter)->
            list.stream()
                    .filter(in->in.getSalary()>sal && in.getLastName().matches(filter))
                    .map(name->name.getFirstName() + " " + name.getLastName())
                    .sorted(Comparator.comparing(e->e))
                    .reduce((str1,str2)->str1 +"," + str2).get();
}
