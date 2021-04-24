package com.lan.ListTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author lan
 * 2021��4��24��
 * TODO list �ı����Ա�
 */
public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		//ԭʼ
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------");
		
		//JDK 1.5 ��ǿforѭ��
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println("-----------------");
		
		//JDK 1.8���� Consumer<? super T> action
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
