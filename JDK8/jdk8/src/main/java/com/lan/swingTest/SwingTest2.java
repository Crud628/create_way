package com.lan.swingTest;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author lan
 * 2021年4月24日
 * TODO java lambda实现窗体程序
 */
public class SwingTest2 {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		JFrame jframe = new JFrame("my JFrame");
		JButton jButton = new JButton("my Button");
		
		//lambda  按下按钮触发输出 多行函数可以加 {}
		jButton.addActionListener(event -> System.out.print("Button Pressed"));
		
		//添加按钮到窗体里面
		jframe.add(jButton);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
