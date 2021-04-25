package com.lan.functionIntergaceTest;



//声明是为了方便在编写时提示以及编译时快捷
@FunctionalInterface
interface MyInterface{
	//唯一抽象方法
	void test();
	
	//Object的原生方法，不被视为抽象
	String toString();
}
/**
 * @author lan
 * 2021年4月25日
 * TODO  
 */
public class FunctionTest {
	public void myTest(MyInterface myInterface) {
		// TODO Auto-generated method stub
		System.out.println(1);
		myInterface.test();
		System.out.println(2);
	}
	public static void main(String[] args) {
		FunctionTest f = new FunctionTest();
		
		//传统实现
		f.myTest(new MyInterface() {
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("mytest");
			}
		});
		
		//lambda 实现
		f.myTest(()->{
			System.out.println("mytest");
		});
		
		//lambda 实现2
		MyInterface myInterface = () ->{
			System.out.println("hello");
		};
		

	}
}
