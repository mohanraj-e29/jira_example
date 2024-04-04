package com.wipro.app;

public class AverageOfDigits {

	public static void main(String[] args) {
		int sum = 0;

        for(int i = 0; i < args.length; i++) {
            sum =sum+ Integer.parseInt(args[i]);
        }

        double average = (double) sum / args.length; 

        System.out.println("Sum =" + sum );
        System.out.println("Average= "+ average);
    
	}

}
