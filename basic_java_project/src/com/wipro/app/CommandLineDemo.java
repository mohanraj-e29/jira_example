package com.wipro.app;

public class CommandLineDemo {

	public static void main(String[] args) {
		// array has implicit variable
		System.out.println(args.length);
		System.out.println("for loop");
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
        System.out.println("for each loop");
        for (String s:args) {
        	System.out.println(s);
        }
	}

}
