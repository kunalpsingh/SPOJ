package com.spoj.factorial;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int[] numArray = new int[testCases];
		int[] resultArray = new int[testCases];
		for(int i=0;i<testCases;i++) {
			numArray[i] = sc.nextInt();
		}
		for(int i=0;i<testCases;i++) {
			int count = 0;
			for(int j=5;numArray[i]/j>=1;j*=5) {
				count+=numArray[i]/j;
			}
			resultArray[i] = count;
		}
		for(int num : resultArray) {
			System.out.println(num);
		}
	}
}
