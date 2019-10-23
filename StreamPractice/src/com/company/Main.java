package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<Employee>(Arrays.asList(
                new Employee("500"),
                new Employee("300"),
                new Employee("200"),
                new Employee("100")
        ));
        List<String> listOfFirstNames=new ArrayList<String>(Arrays.asList(
                "This is Adnan",
                "This is Sibtain",
                "This is Yousef"
        ));
        List<String> listOfLastNames=new ArrayList<String>(Arrays.asList(
                "Shehzad",
                "Tarar",
                "Khan"
        ));
        int sum=0;
        sum=FunctionalCode.calculateSalary.apply(emp);
        List<String> list= FunctionalCode.Concatall.apply(listOfFirstNames,listOfLastNames);
        list.forEach((input)->System.out.println(input));
        //System.out.println("The value of sum is " + sum);

    }
}
