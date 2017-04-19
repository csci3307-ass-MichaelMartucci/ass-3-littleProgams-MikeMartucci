package com.mycompany.ass2.chapter2;

public class Program_Fig_6_10 {
	
	public static void main(String[] args) {
		System.out.printf("Square of integer 7: is %d%n",square(7));
		System.out.printf("Square of integer 7.5 is: %f%n",square(7.5));
		return;
	}
	public static int square(int x){
		System.out.printf("%nCalled squared with int arguments: %d%n", x);
		return x*x;
	}
	public static double square(double x){
		System.out.printf("%nCalled squared with double arguments: %f%n", x);
		return x*x;
	}
	

}
