package com.phei.netty.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author lan
 * 2021年4月24日
 * TODO  同步阻塞I/O的TimeServer
 */
public class TimeServer {
	public static void main(String[] args) throws IOException{
		int port = 8080;
		if(args != null && args.length > 0) {
			try {
				port = Integer.valueOf(args[0]);
			}catch(NumberFormatException e) {
				//采用默认值
			}
		}
		ServerSocket server = null;
		try {
			server  = new ServerSocket(port);
			System.out.println("Time Server启动端口："+port);
			Socket socket = null;
			while(true) {
				socket = server.accept();
				new Thread(new TimeServerHandler(socket)).start();
			}
		} finally {
			if(server != null) {
				System.out.println("Time Server已经关闭");
				server.close();
				server = null;
			}
		}
	}
}
