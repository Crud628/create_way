package com.test;

import java.util.ArrayDeque;

public class test2{
	String str = "123";
	StringBuilder sb = new StringBuilder("123");
	public static void change(String str,StringBuilder sb) {
		str = "456";
		sb.append(str);
	}
	
	public int getNum() {
		try {
			int a = 1/0;
			return 1;
		} catch (Exception e) {
			throw new RuntimeException("111");
		} finally {
			return 3;
		}
	}
	public static void main(String[] args) {
		ArrayDeque arrayDeque = new ArrayDeque();
		arrayDeque.push("1");
		arrayDeque.push("2");
		arrayDeque.push("3");
		System.out.println(arrayDeque.peek());
	}
}
class UserThread extends Thread{
	public synchronized void run () {
		for (int i = 0;i<2;i++) {
			System.out.println(Thread.currentThread().getName()+","+i);
		}
	}
}
enum Number{
	JAVA,PYTHON,GO
}
