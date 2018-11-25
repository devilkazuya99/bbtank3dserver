package io.bbtank3d.server;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;


@WebSocket
public class TankWebSocket {

	// Store sessions if you want to, for example, broadcast a message to all users
	private static final Queue<Session> sessions = new ConcurrentLinkedQueue<>();

	@OnWebSocketConnect
	public void connected(Session session) {
		sessions.add(session);
	}

	@OnWebSocketClose
	public void closed(Session session, int statusCode, String reason) {
		System.out.println("session = " + session + " statusCode = " + statusCode + " reason = " + reason);
		sessions.remove(session);
	}

	@OnWebSocketMessage
	public void message(Session session, String message) throws IOException {
		if(Server.DEBUG_MODE)
			System.out.println("Got: " + message); // Print message

		// Do a broadcast in parallel.
		sessions.parallelStream().forEach(sess -> {
			try {
				sess.getRemote().sendString(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
