package com.lan.functionIntergaceTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author lan
 * 2021年4月25日
 * TODO lambda深入
 */
public class Test4 {
	public static void main(String[] args) {
		//传统方式
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		});
		
		//lambda表达式引入
		new Thread(()->System.out.println("hello World!")).start();
		
		//case:全部转换大写
		List<String> list = Arrays.asList("hello","world","hello world");
		//传统略
		//lambda实现
		list.forEach(item -> System.out.println(item.toUpperCase()));
		//转换为大写
		List<String> list2 = new ArrayList<String>();
		list.forEach(item -> list2.add(item.toUpperCase()));
		list2.forEach(System.out::println);
		//进阶 stream流方式  串行流  paralleStream并行流
		//链式编程
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		
	}
}
