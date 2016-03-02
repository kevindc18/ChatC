package Server;

import java.io.*;
import java.net.*;
import java.util.*;

public class Main {
	// Const
	private static final boolean debug = true;
	private static final int ServerPort = 3680;
	
	// vars
	private static boolean Term;
	private static int nextClientID;
	
	// sockets
	private static Vector<ClientHandler> ClientHandlerThreads;
	private static ServerSocket ServerSocket;
	
	// debug print function
	private static void print (String msg) {
		if (debug) {
			System.out.println("[Server]: "+msg);
		}
	}
	
	public static void main(String[] args) {
		Term = false;
		nextClientID = 1;
		/*
		ServerNet SocketThread = new ServerNet(1,1,true);
		print("Socket thread created");
		SocketThread.start();
		print("Socket thread started");
		print("Entering loop.");
		while(!Term) {
			if (SocketThread.ReqTerminate) break;
		}*/
		
		// init client handler thread vector
		ClientHandlerThreads = new Vector<ClientHandler>();
		
		// init server socket
		try {
			ServerSocket = new ServerSocket(ServerPort);
			//ServerSocket.setSoTimeout(10000);
			print("Server listening in port "+ServerPort);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		print("Server initialized");
		
		// Server routine
		ClientHandler newClient = new ClientHandler(nextClientID,ServerSocket,true);
		newClient.setDaemon(true);
		newClient.start();
		print("Server routine start");
		while (!Term) {
			if (newClient.getConnectionStatus()) {
				// add new connected client
				ClientHandlerThreads.add(newClient);
				print("Added new client");
				
				// create new client handler
				nextClientID++;
				newClient = new ClientHandler(nextClientID,ServerSocket,true);
				newClient.setDaemon(true);
				newClient.start();
			}
		}
	}
}
