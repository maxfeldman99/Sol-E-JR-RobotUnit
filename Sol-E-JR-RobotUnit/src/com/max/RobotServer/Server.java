package com.max.RobotServer;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

	private final int PORT = 12345;
	private boolean SERVER_IS_RUNNING = true;
	private ObjectInputStream inputStream = null;
	private ObjectOutputStream outputStream = null;
	private ServerSocket serverSocket;
	private Socket socket;
	
	public Server() {
	}
		
		@Override
		public void run() {
			while(SERVER_IS_RUNNING) {
			try {
				serverSocket= new ServerSocket(PORT);
				socket  = serverSocket.accept();
				inputStream = new ObjectInputStream(socket.getInputStream());
				outputStream = new ObjectOutputStream(socket.getOutputStream());
				String str = (String)inputStream.readObject();
				System.out.println("messege: "+str);
				} catch (IOException e) {
				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				
				try {
					serverSocket.close();
					socket.close();
					//SERVER_IS_RUNNING = false;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
			
		}
}
