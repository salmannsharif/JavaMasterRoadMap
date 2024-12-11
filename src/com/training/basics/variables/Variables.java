package com.training.basics.variables;

public class Variables {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Value of num: " + num);

        double decimal = 10.5;
        System.out.println("Value of decimal: " + decimal);

        boolean flag = true;
        System.out.println("Value of flag: " + flag);

        char character = 'A';
        System.out.println("Value of character: " + character);

        String str = "Hello World!";
        System.out.println("Value of str: " + str);

        // Some Rules Of Variables...

        // In Java, variables are declared using the data type followed by the variable name.
        // Here num, decimal, flag, character, str... all are variables that is used to store values, Its act like a container.
        // Variables are declared with a specific data type and can be reassigned to store different data types.
        // Variables are case-sensitive, i.e., num and Num are different variables.
        // Variables should start with a letter, underscore (_), or a dollar sign ($), but not a number.
        // Variable names should be descriptive and meaningful, avoid using reserved keywords like "class", "int", etc.
        // Variable names should not contain any special characters or whitespace.
        // Variables should not start with a number or an underscore followed by a number.
        // Variables should not contain any reserved keywords or built-in functions or methods.
        // Variables should not be too long or too short.

        // Example of valid variable names:
        // myNumber, myVariable, my_variable, my$variable, _myVariable, myVariable1, myVariable2, myVariable3

        // Example of invalid variable names:
        // 1myVariable, my-variable, my variable, class, int, etc.

        // Example of too long variable names:
        // myVeryVeryLongVariableNameThatIsTooLongAndWillCauseAnError

        // Example of too short variable names:
        // my, my1, my_1, etc.

        // Example of variable names containing special characters:
        // myVariable@, myVariable#, myVariable$, etc.

        // Example of variable names containing whitespace:
        // my variable, my variable, etc.

    }
}
