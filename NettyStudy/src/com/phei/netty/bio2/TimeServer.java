package com.phei.netty.bio2;

import java.net.ServerSocket;
import java.net.Socket;

import com.phei.netty.bio.TimeServerHandler;

/**
 * 
 * @author lan
 * 2021��4��24��
 * TODO α�첽I/O
 */
public class TimeServer {
	public static void main(String[] args) throws Exception{
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
			server = new ServerSocket(port);
			System.out.println("Time Server�����˿ڣ�"+port);
			Socket socket = null;
			TimeServerHandlerExecutePool singleExecutetor = new
					TimeServerHandlerExecutePool(50,1000);// ����I/O�������̳߳�
			while(true) {
				socket = server.accept();
				singleExecutetor.execute(new TimeServerHandler(socket));
			}
		}finally {
			if(server != null) {
				System.out.println("Time Server�Ѿ��ر�");
				server.close();
				server = null;
			}
		}
	}
}
