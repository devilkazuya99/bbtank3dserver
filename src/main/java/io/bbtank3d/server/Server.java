package io.bbtank3d.server;

import static spark.Spark.*;

public class Server {

	public static boolean DEBUG_MODE = false;
	
	public static void main(String[] args) {
		for (String arg : args) {
			if("debug".equals(arg)) {
				DEBUG_MODE = true;
				System.out.println("DEBUG_MODE = true");
			}
		}
		port(9999);
		webSocket("/server", TankWebSocket.class);
//		init(); // Needed if you don't define any HTTP routes after your WebSocket routes
		get("/health", (request, response) -> {
		    // Show something
			return "OK";
		});

	}

}
