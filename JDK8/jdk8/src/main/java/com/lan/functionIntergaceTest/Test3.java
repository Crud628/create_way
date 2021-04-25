package com.lan.functionIntergaceTest;

/**
 * 
 * @author lan
 * 2021年4月25日
 * TODO  lambda是对象
 */
public class Test3 {
	public static void main(String[] args) {
		
		newIntergace i1 = () -> {};
		System.out.println(i1.getClass().getInterfaces()[0]);//newIntergace
		
		newIntergace2 i2 = () -> {};
		System.out.println(i2.getClass().getInterfaces()[0]);//newIntergace2
		//  () ->{}  具体什么类型必须根据上下文判断
		
		
	}
}
@FunctionalInterface
interface newIntergace{
	void myMethod();
}
@FunctionalInterface
interface newIntergace2{
	void myMethod2();
}

