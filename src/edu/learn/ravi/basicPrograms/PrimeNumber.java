package edu.learn.ravi.basicPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		boolean res=isPrime(num);
		if(res)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}

	private static boolean isPrime(int num) {
		int i=2;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				return true;
			}
			else
			{
				i++;
			}
		}
		return false;
		
	}
}
