package com.training.java8features.lambda_and_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaAndStream {
    public static void main(String[] args) {

        /**Lambda Expression is a simplified version of methods, Unlike methods lambda doesn't have any
        names and associated with any particular class */

        /**Lambda syntax  consist of three parts - parameters, arrow mark and body.
        The body of a lambda can be an expression or a set of statements. If it is set of statements,
        they must be enclosed within curly braces { }. Return type and possible list of exceptions
        that can be thrown are not explicitly mentioned in a lambda. They are implicitly applied.*/

        /**
         * Lambda Expressions	                Description
         *
         * () -> System.out.println("Hi..")	    Takes nothing and returns nothing.
         * (int a) -> a * a	                    Takes int and returns int.
         * (String s1, String s2) ->
         * { System.out.println(s1);
         * System.out.println(s2); }	        Takes two strings and returns nothing.
         * (double d) -> d	                    Takes double and returns double.
         * () -> {}	                            Takes nothing and returns nothing. It has the empty body.
         * */



        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // printing the elements using lambda functions
        numbers.forEach(elements -> System.out.println(elements));

        Consumer<Integer> consumer1 = elements -> System.out.println(elements);
        numbers.forEach(consumer1);

        // ---------------------------------------------------------------
        // Printing even numbers
        List<Integer> even = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.print(even);

        System.out.println();
        // ----------------------------------------------------------------
        // Predicate interface example
        Predicate<Integer> predicate = number -> number % 2 == 0;
        List<Integer> evenNumbers = numbers.stream().filter(predicate).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println();

        // ------------------------------------------------------------------------------
        // Function interface example
        Function<Integer, Integer> square = number -> number * number;
        List<Integer> squares = numbers.stream().map(square).collect(Collectors.toList());
        System.out.println("Squares: " + squares);
        System.out.println();

        // ------------------------------------------------------------------------------
        Integer sum = numbers.stream().reduce((a,b)-> a+b).get();
        System.out.println("Sum : " + sum);
        System.out.println();

        // ------------------------------------------------------------------------------
        // Consumer interface example
        Consumer<Integer> consumer = number -> System.out.println(number);
        numbers.forEach(consumer);
        System.out.println();
        // ------------------------------------------------------------------------------
        // Supplier interface example
        Supplier<String> supplier = () -> "Hello World!";

//        ----------------------------------------------------------------------------------

        // Using Anonymous class
        Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String name) {
                if("Imran".equals(name)){
                    return true;
                }
                return false;
            }
        };
        if(predicate1.test("Salman")){
            System.out.println("Correct...");
        }else{
            System.out.println("Wrong...");
        }

//        -------------------------------------------------------------------------------------

        // Using lambda expression
        Predicate<String> predicate2 = name -> "Salman".equals(name);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(predicate2.test(name)){
            System.out.println("The name is correct...");
        }else {
            System.out.println("The name you entered is wrong..");
        }

        // ------------------------------------------------------------------------------


    }
}
