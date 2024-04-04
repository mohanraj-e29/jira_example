package com.wipro.app;

import java.util.Scanner;

public class ConditionalControlDemo {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your maths mark:");
		int maths=scanner.nextInt();
		System.out.println("Enter your physics mark:");
		int physics=scanner.nextInt();
		System.out.println("Enter your chemistry mark:");
		int chemistry=scanner.nextInt();
		int sum=0;
		sum+=maths+physics+chemistry;
		if(sum>=240 && sum<=300) {
			System.out.println("Grade=A+");
		}
		else if(sum>=180 && sum<=239) {
			System.out.println("Grade=A");
		}
		else if(sum>=180 && sum<=179) {
			System.out.println("Grade=B");
		}
		else if(sum>=120 && sum<=149) {
			System.out.println("Grade=C");
		}
		

	}

}
