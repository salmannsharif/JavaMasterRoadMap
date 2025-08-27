package com.training.websocket;

public class WebSocketClass {
    /*
     -> WebSocket is a protocol that allows bidirectional communication between a server and a client.
     -> Websocket is a communication protocol that provides a full-duplex, Real-time communication channel over a single
        and long-lived connection between the client and the server.
     -> Unlike Http, Where client send request to server and server send response to client, Websocket
        allows both client and server to send data to each other at the same time without re-establishing a connection.


    How WebSocket works?

        The handshake process:
        1. The connection start as a regular HTTP request.
        2. Client sends a Http handshake request with header (Upgrade: websocket) to the server to switch a protocol.
        3. The server accepts the request and upgrades the connection to WebSocket.
        4. Client and server now communicate using WebSocket protocol.

        Data transfer phase:
        1. After the handshake, The connection become a persistent, Bi-directional connection.
        2. Client and server can send and receive data at the same time without re-establishing a connection.


    Key Features of WebSocket

        1. Persistent connection: Once established, the connection stays open.
        2. Low latency: No need for repeated HTTP handshakes.
        3. Full-duplex: Both sides can send data independently.
        4. Efficient: Minimal overhead compared to polling or long-polling techniques.



     */
}
