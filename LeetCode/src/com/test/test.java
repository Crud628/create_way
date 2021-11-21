package com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;


/**
 * 算法测试
 * @author lan
 * 2021年7月4日
 * TODO
 */
public class test{

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		String string = "hebought";
		long start = new Date().getTime();
		
//		System.out.println(new test() );

		System.out.println(string.substring(0,string.length() - 1));
		System.out.println("执行时间：" + (new Date().getTime() - start));
	}

	
	


}
