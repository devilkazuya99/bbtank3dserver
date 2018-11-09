package io.bbtank3d.server;

import static spark.Spark.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		port(9999);
		webSocket("/server", TankWebSocket.class);
//		init(); // Needed if you don't define any HTTP routes after your WebSocket routes
		get("/health", (request, response) -> {
		    // Show something
			return "OK";
		});

	}

}
