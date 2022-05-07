package com.spoj.primegenerator;

import java.util.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		sc.nextLine();
		List<String> lst = new ArrayList<String>();
		for(int i=0;i<testCases;i++) {
			
			lst.add(sc.nextLine());
		}
		for(int i=0;i<testCases;i++) {
			int low=Integer.parseInt(lst.get(i).split(" ")[0]),high=Integer.parseInt(lst.get(i).split(" ")[1]);
			while(low<high) {
				boolean flag = false;
				for(int j=2;j<=low/2;++j) {
					if(low%j==0) {
						flag=true;
						break;
					}
				}
				if(!flag && low!=0 && low!=1) {
					System.out.println(low);
				}
				++low;
			}
			System.out.println();
		}
	}
}
