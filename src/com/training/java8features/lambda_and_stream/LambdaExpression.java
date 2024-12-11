package com.training.java8features.lambda_and_stream;


// Interface implementation Without Lambda Expression.
/*
interface Drawable{
    void draw();
}
public class LambdaExpression {
    public static void main(String[] args) {
        int width=10;
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawable : " + width);
            }
        };
        drawable.draw();
    }
}
*/

// Interface implementation With Lambda Expression.

@FunctionalInterface
interface Drawable{
    void draw(int a, int b);
}
public class LambdaExpression {

    public static void main(String[] args) {
        Drawable drawable = (a,b) -> System.out.println(a+b);
        drawable.draw(10,100);
    }
}