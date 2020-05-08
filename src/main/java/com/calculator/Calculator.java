package com.calculator;

class Calculator {
    public static void main(String[] args) {
        System.out.println("Sum of 3 and 4:"+ add(3,4));
        System.out.println("Difference of 3 and 4:"+ subtract(3,4));
        System.out.println("Product of 3 and 4:"+ multiplication(3,4));
        System.out.println("Division of 3 and 4:"+ divide(3,4));
    }
    public static int add(int a, int b) {
    	return a+b;
    }
    public static int subtract(int a, int b) {
    	return a-b;
    }
    public static int multiplication(int a, int b) {
    	return a*b;
    }
    public static double divide(int a, int b) {
  		double result;
  		if (b == 0) {
  			throw new IllegalArgumentException("Divisor cannot divide by zero");
  		} else {
  			result = Double.valueOf(a)/Double.valueOf(b);
  		}
  		return result;
  	}
}
