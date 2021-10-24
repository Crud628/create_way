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
		String string = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
		long start = new Date().getTime();
		
		System.out.println(new test().countValidWords(string) );

		System.out.println("执行时间：" + (new Date().getTime() - start));
	}

    public int countValidWords(String sentence) {
    	String[] split = sentence.split("\s");
    	int count = 0;
    	for (String string:split) {
    		if (string.endsWith(",") || string.endsWith(".") || string.endsWith("!")) string = string.substring(0,string.length()-1);
    		if ("/^[a-z]+-*[a-z]+$/g".matches(string) || "/^[a-z]+$/g".matches(string)) count++;
    	}
    	return count;
    }
	
	


}
