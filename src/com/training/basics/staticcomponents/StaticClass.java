package com.training.basics.staticcomponents;

class A
{
    int nonStaticVariable;
    static int staticVariable;

    static void staticMethod()
    {
        System.out.println(staticVariable);
        //   System.out.println(nonStaticVariable);
    }

    void nonStaticMethod()
    {
        System.out.println(staticVariable);
        System.out.println(nonStaticVariable);
    }
}

class StaticClass
{
    public static void main(String[] args)
    {
        A.staticVariable = 10;
        //   A.nonStaticVariable = 10;
        A.staticMethod();
        //    A.nonStaticMethod();

        A a1 = new A();
        A a2 = new A();

        System.out.println(a1.nonStaticVariable);
        System.out.println(a1.staticVariable);
        a1.nonStaticMethod();
        a1.staticMethod();

        System.out.println(a2.staticVariable);
        a1.staticVariable = 20;
        System.out.println(a2.staticVariable);
    }
}