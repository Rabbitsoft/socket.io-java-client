package de.gottox.socket.io.client;

import org.junit.BeforeClass;

public class WebsocketTestSocketIO extends AbstractTestSocketIO {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		transport = "websocket";
	}
}
