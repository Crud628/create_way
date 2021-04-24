package com.phei.netty.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author lan
 * 2021��4��24��
 * TODO  ͬ������I/O��TimeServer
 */
public class TimeServer {
	public static void main(String[] args) throws IOException{
		int port = 8080;
		if(args != null && args.length > 0) {
			try {
				port = Integer.valueOf(args[0]);
			}catch(NumberFormatException e) {
				//����Ĭ��ֵ
			}
		}
		ServerSocket server = null;
		try {
			server  = new ServerSocket(port);
			System.out.println("Time Server�����˿ڣ�"+port);
			Socket socket = null;
			while(true) {
				socket = server.accept();
				new Thread(new TimeServerHandler(socket)).start();
			}
		} finally {
			if(server != null) {
				System.out.println("Time Server�Ѿ��ر�");
				server.close();
				server = null;
			}
		}
	}
}
