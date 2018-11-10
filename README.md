# bbtank3dserver

WebSocket server for bbtank3d client.


### Requirement

- java 8
- maven 2


### Compile

```sh
mvn package
```

### Run

```sh
java -jar target/bbtank3dserver-jar-with-dependencies.jar
```

```shell
[18-Nov-10 07:26:00:056] [INFO] [log:192] - Logging initialized @449ms to org.eclipse.jetty.util.log.Slf4jLog
[18-Nov-10 07:26:00:135] [INFO] [EmbeddedJettyServer:142] - == Spark has ignited ...
[18-Nov-10 07:26:00:136] [INFO] [EmbeddedJettyServer:146] - >> Listening on 0.0.0.0:9999
[18-Nov-10 07:26:00:138] [INFO] [Server:373] - jetty-9.4.z-SNAPSHOT, build timestamp: 2017-11-22T05:27:37+08:00, git hash: 82b8fb23f757335bb3329d540ce37a2a2615f0a8
[18-Nov-10 07:26:00:156] [INFO] [session:364] - DefaultSessionIdManager workerName=node0
[18-Nov-10 07:26:00:157] [INFO] [session:369] - No SessionScavenger set, using defaults
[18-Nov-10 07:26:00:159] [INFO] [session:149] - Scavenging every 600000ms
[18-Nov-10 07:26:00:177] [INFO] [ContextHandler:788] - Started o.e.j.s.ServletContextHandler@21d405c6{/,null,AVAILABLE}
[18-Nov-10 07:26:00:193] [INFO] [AbstractConnector:288] - Started ServerConnector@271c8ab8{HTTP/1.1,[http/1.1]}{0.0.0.0:9999}
[18-Nov-10 07:26:00:194] [INFO] [Server:410] - Started @590ms

```

The server will be running at port 9999.