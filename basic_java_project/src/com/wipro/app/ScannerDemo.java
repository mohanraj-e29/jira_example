package com.wipro.app;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter your Age:");
	//int age=scanner.nextInt();
	//scanner
	int age=scanner.nextInt();
	System.out.println("Enter your Name:");
	String myname=scanner.nextLine();
	
	System.out.println("hi,welcome"+myname+",is your age"+age+"?");

	}

}
