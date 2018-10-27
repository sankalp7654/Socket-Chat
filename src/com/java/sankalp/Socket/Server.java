package com.java.sankalp.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

	public class Server {
	    
		public static void main(String ... strings) throws IOException {
	
			ServerSocket serverSocket = new ServerSocket(6969);
			System.out.println("Server is up and running");
				Socket socket = serverSocket.accept();
				Scanner scanner = new Scanner(System.in);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String clientName = br.readLine();
				System.out.println(clientName + " connected");
				System.out.println("---------------------------------------------");

				System.out.println();
				
			while(true) {
	
				if(!br.ready()) {
					String getMessage = br.readLine();
					System.out.println(clientName + ": " + getMessage);
					String message = "Server: ";
					System.out.print(message);
					message += scanner.nextLine();
					System.out.println();
					
		
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	               			out.println(message);
	              
				}
				
			}
			
		}
	}
	
	
	
	
