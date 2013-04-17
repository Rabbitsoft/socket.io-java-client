package de.gottox.socket.io.client;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ WebsocketTestSocketIO.class, XHRTestSocketIO.class })
public class AllTests {
}
