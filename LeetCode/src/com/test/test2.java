package com.test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long[] sum = new long[3];
		int i = 0;
		while (i<3) {
			sum[i] = scanner.nextInt();
			i++;
		}
		long result = 3*sum[0] + sum[1] - sum[2];
		System.out.println(Integer.parseInt("999999999999999"));
		for (int j = 0;;j++) {
			if (result <= 3*j) {
				System.out.println(j);
				return;
			}
		}
	}

}
