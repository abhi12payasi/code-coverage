package com.app;

public class App {

    public double cal(double x) {
        double result = 0;
        if (x <= 10) {
            result = tan(x);
        } else {
            result = log(x);
        }
        return result;
    }

    private double log(double number) {
        return Math.log(number);
    }

    private double tan(double number) {
        return Math.tan(number);
    }
}
