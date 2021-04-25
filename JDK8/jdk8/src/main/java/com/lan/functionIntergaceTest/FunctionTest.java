package com.lan.functionIntergaceTest;



//������Ϊ�˷����ڱ�дʱ��ʾ�Լ�����ʱ���
@FunctionalInterface
interface MyInterface{
	//Ψһ���󷽷�
	void test();
	
	//Object��ԭ��������������Ϊ����
	String toString();
}
/**
 * @author lan
 * 2021��4��25��
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
		
		//��ͳʵ��
		f.myTest(new MyInterface() {
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("mytest");
			}
		});
		
		//lambda ʵ��
		f.myTest(()->{
			System.out.println("mytest");
		});
		
		//lambda ʵ��2
		MyInterface myInterface = () ->{
			System.out.println("hello");
		};
		

	}
}
