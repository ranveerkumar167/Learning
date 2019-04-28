package com.programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
	String[] adviceList = {
			"Take smaller bites", "Be honest"	
		};
		
		public void go() {
			try {
				ServerSocket serverSocket = new ServerSocket(5000);
				
				while(true) {
					Socket socket = serverSocket.accept();
					
					PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
					String advice = getAdvice();
					printWriter.write(advice);
					printWriter.close();
					//System.out.println(advice);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	private String getAdvice() {
			int random = (int) (Math.random() * adviceList.length);
			return adviceList[random];
		}

	public static void main(String[] args) {

		DailyAdviceServer adviceServer = new DailyAdviceServer();
		adviceServer.go();
		
	}

}
