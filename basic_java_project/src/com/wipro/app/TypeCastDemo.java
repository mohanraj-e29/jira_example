package com.wipro.app;

public class TypeCastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x='A';  //implicit conversion to int
		System.out.println(x);
		char op;
		//cannot convert int into char
		//op=x;
		op=(char)x;//type casting,explicity converting int to char
		//boolean flag=1;
		//valid value for boolean is true or false only
		//output of a condition is true or false
		boolean status=(x==65);
		System.out.println(status);
		
		String string=null;
		System.out.println(string);
		string="mohanraj";
		System.out.println(string);
		
		

	}

}
