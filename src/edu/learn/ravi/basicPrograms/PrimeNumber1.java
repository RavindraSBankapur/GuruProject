package edu.learn.ravi.basicPrograms;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		int res=isPrime(num);
		if(res==0)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}
	private static int isPrime(int num) {
		int i=2,temp=0;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				temp=i;
				break;
			}
			else
			{
				i++;
			}
		}
		return temp;
	}
}
