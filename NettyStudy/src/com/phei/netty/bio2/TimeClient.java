package com.phei.netty.bio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @author lan
 * 2021��4��24��
 * TODO  �ͻ���
 */
public class TimeClient {
	public static void main(String[] args) {
		int port = 8080;
		if(args != null && args.length > 0) {
			try {
				port = Integer.valueOf(args[0]);
			}catch(NumberFormatException e) {
				//����Ĭ��ֵ
			}
		}
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			socket = new Socket("127.0.0.1",port);
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			out.println("QUERY TIME OVER");
			System.out.println("Seond order 2 server succeed.");
			String resp = in.readLine();
			System.out.println("Now is:"+resp);
		}catch(Exception e) {
			//����Ҫ����
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if(out != null) {
				out.close();
				out = null;
			}
			if(socket != null) {
				try {
					socket.close();
				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				socket = null;
			}
		}
	}
}
