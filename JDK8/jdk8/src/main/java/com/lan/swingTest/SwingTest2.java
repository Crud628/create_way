package com.lan.swingTest;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author lan
 * 2021��4��24��
 * TODO java lambdaʵ�ִ������
 */
public class SwingTest2 {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		JFrame jframe = new JFrame("my JFrame");
		JButton jButton = new JButton("my Button");
		
		//lambda  ���°�ť������� ���к������Լ� {}
		jButton.addActionListener(event -> System.out.print("Button Pressed"));
		
		//��Ӱ�ť����������
		jframe.add(jButton);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
