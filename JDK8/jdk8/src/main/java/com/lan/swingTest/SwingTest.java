package com.lan.swingTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author lan
 * 2021��4��24��
 * TODO java�ڲ���ʵ�ִ������
 */
public class SwingTest {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		JFrame jframe = new JFrame("my JFrame");
		JButton jButton = new JButton("my Button");
		
		//�����ڲ���  ���°�ť�������
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Pressed");
			}
		});
		
		//��Ӱ�ť����������
		jframe.add(jButton);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
