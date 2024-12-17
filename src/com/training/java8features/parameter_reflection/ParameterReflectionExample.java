package com.training.java8features.parameter_reflection;

/* Parameter Reflection allows you to retrieve metadata about method parameters at runtime,
   such as parameter names, types, and modifiers.

   -javac -parameters com\training\java8features\parameter_reflection\ParameterReflectionExample.java
   -java com.training.java8features.parameter_reflection.ParameterReflectionExample

 */

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ParameterReflectionExample {

    // A sample method for demonstration
    public void greetPerson(String name, int age) {
        System.out.println("Hello " + name + ", your age is " + age);
    }

    public static void main(String[] args) {
        try {
            // 1. Obtain the class object
            Class<?> clazz = ParameterReflectionExample.class;

            // 2. Get the Method object for the method 'greetPerson'
            Method method = clazz.getMethod("greetPerson", String.class, int.class);

            // 3. Get the parameters of the method
            Parameter[] parameters = method.getParameters();

            // 4. Print parameter information
            System.out.println("Method: " + method.getName());
            for (Parameter parameter : parameters) {
                System.out.println("Parameter: " + parameter.getName() + ", Type: " + parameter.getType());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}