package com.lan.ListTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author lan
 * 2021年4月24日
 * TODO list 的遍历对比
 */
public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		//原始
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------");
		
		//JDK 1.5 增强for循环
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println("-----------------");
		
		//JDK 1.8新增 Consumer<? super T> action
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
		System.out.println("-----------------");
		
		
		
	}
}
