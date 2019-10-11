/* Developer: Sankalp Saxena */
package com.java.sankalp.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class Client {

	public static void main(String ... args) throws Exception{
		
		String ip = "localhost";
		int port = 6969;
			
			Scanner scanner = new Scanner(System.in);
			
			Socket socket = new Socket(ip, port);
			
			System.out.println("Enter your name");
			String string = scanner.nextLine();
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(string);
            
          
            	   System.out.println("Chat with the Server" + "\n");
                   
                   System.out.print("You: ");
                   String message = scanner.nextLine();
                   out.println(message);
                   
                   BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                   while(true) { 
                   if(!input.ready()) {
                       System.out.println(input.readLine() + "\n");
                       
                       System.out.print("You: ");
                       String sendMessage = scanner.nextLine();
                       out.println(sendMessage);
	                   	
                     	       				                     
       			}
                   
            }
         
	}
}
