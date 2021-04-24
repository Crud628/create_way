package com.phei.netty.bio2;

import java.net.ServerSocket;
import java.net.Socket;

import com.phei.netty.bio.TimeServerHandler;

/**
 * 
 * @author lan
 * 2021年4月24日
 * TODO 伪异步I/O
 */
public class TimeServer {
	public static void main(String[] args) throws Exception{
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
			server = new ServerSocket(port);
			System.out.println("Time Server启动端口："+port);
			Socket socket = null;
			TimeServerHandlerExecutePool singleExecutetor = new
					TimeServerHandlerExecutePool(50,1000);// 创建I/O的任务线程池
			while(true) {
				socket = server.accept();
				singleExecutetor.execute(new TimeServerHandler(socket));
			}
		}finally {
			if(server != null) {
				System.out.println("Time Server已经关闭");
				server.close();
				server = null;
			}
		}
	}
}
