package com.max.RobotServer;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		Server server = new Server();
		int MAX_CLIENTS = 1;
		ThreadPoolExecutor threadPoolExecutor;
		threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(MAX_CLIENTS);
		server.run();
		threadPoolExecutor.submit(server);
		while(threadPoolExecutor.isShutdown()==false) {
			
			
			//threadPoolExecutor.shutdown();
		}
		
		
		

	}

}
