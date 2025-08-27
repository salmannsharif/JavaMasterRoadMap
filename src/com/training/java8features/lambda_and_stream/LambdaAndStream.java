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

        // Stream API in java used to process collections (list, set ) of data in functional way.
        // Stream API is introduced in java 8
        //It makes operation like filtering, mapping and reducing easier.

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

        // These are the functional interfaces internally each stream api operation uses.
        // 1. filter()
        // 2. map()
        // 3. reduce()
        // 4. forEach()
        // 5. sorted()
        // 6. distinct()
        // 7. count()
        // 8. min()
        // 9. max()
        // 10. findFirst()
        // 11. findAny()

        /*
        1. filter()
        stream.filter(n -> n % 2 == 0)
        Interface → Predicate<T>

        Why → Needs a condition returning true/false.

        2. map()
        stream.map(n -> n * n)
        Interface → Function<T, R>

        Why → Transforms one value to another.

        3. reduce()
        stream.reduce(0, (a, b) -> a + b)
        Interface → BinaryOperator<T>

        Why → Combines two values into one.

        4. forEach()
        stream.forEach(n -> System.out.println(n));
        Interface → Consumer<T>

        Why → Consumes each element but doesn’t return anything.

        5. sorted()
        stream.sorted((a, b) -> a.compareTo(b))
        Interface → Comparator<T>

        Why → Defines how two elements are compared.

        6. distinct()

        stream.distinct()
        Interface → None directly (it uses hashCode() + equals())

        Why → Removes duplicates using object equality.

        7. count()

        long count = stream.count();
        Interface → None directly

        Why → Just counts elements (terminal operation).

        8. collect()

        stream.collect(Collectors.toList());
        Interface → Collector<T, A, R>

        Why → Collects elements into a collection or another result container.

✅ Summary Table:

        Operation	Functional Interface Used
        filter()	Predicate<T>
        map()	Function<T, R>
        reduce()	BinaryOperator<T>
        forEach()	Consumer<T>
        sorted()	Comparator<T>
        distinct()	Uses equals() & hashCode()
        count()	None (just counts)
        collect()	Collector<T, A, R>
    */
    }
}
