package com.spoj.lifetheuniverseandeverything;

import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int num=0;
		List<Integer> numArray = new ArrayList<>();
		while(true) {
			num = sc.nextInt();
			if(num==42)
				break;
			else {
				numArray.add(num);
			}
		}
		numArray.stream().forEach(n -> System.out.println(n));
	}
}
