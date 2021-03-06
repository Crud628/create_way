package com.phei.netty.bio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @author lan
 * 2021年4月24日
 * TODO 处理Socket链路
 */
public class TimeServerHandler implements Runnable{
	
	private Socket socket;
	
	
	public TimeServerHandler(Socket socket) {
		this.socket = socket;
	}

	/**
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new InputStreamReader(
					this.socket.getInputStream()));
			out = new PrintWriter(this.socket.getOutputStream(),true);
			String currentTime = null;
			String body = null;
			while(true) {
				body = in.readLine();
				if(body == null)
					break;
				System.out.println("Time Server receive order:"+body);
				currentTime = "QUERY TIME ORDER".equals(body) ? new java.util.Date(
							System.currentTimeMillis()).toString():"BADER";
							out.println(currentTime);
			}
		}catch(Exception e) {
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
			if(this.socket != null) {
				try {
					this.socket.close();
				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				this.socket = null;
			}
		}
	}
	
}
