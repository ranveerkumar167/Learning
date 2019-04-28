package com.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class _SocketProgram {

	public static void main(String[] args) {
		try {
			while(true) {
				BufferedReader reader =  
		                   new BufferedReader(new InputStreamReader(System.in)); 
		         
		        // Reading data using readLine 
		        String name = reader.readLine(); 
				
				Socket socket = new Socket("127.0.0.1", 5000);
				InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String message = bufferedReader.readLine();
				System.out.println(message);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
