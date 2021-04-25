package com.lan.swingTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author lan
 * 2021年4月24日
 * TODO java内部类实现窗体程序
 */
public class SwingTest {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		JFrame jframe = new JFrame("my JFrame");
		JButton jButton = new JButton("my Button");
		
		//匿名内部类  按下按钮触发输出
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Pressed");
			}
		});
		
		//添加按钮到窗体里面
		jframe.add(jButton);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
