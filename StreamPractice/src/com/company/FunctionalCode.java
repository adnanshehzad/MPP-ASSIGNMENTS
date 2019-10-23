package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalCode {
    static Function<List<Employee>, Integer> calculateSalary = (list) -> {
        return list.stream()
                .map(employee -> employee.getSalary())
                .map(Integer::parseInt)
                .reduce(0, (tempvalue, sum) -> tempvalue + sum);
    };

    public static BiFunction<List<String>, List<String>, List<String>> Concatall = (l1, l2) ->
    {
        return Stream.concat(l1.stream(), l2.stream())
                .collect(Collectors.toList());
    };
    ///Functional Code for FindByUSerName and Email

//    public static BiFunction<List<String>, String, Boolean> findByUserName = list -> {
////        return list.stream()
////                .filter(username ->)
//    };

}