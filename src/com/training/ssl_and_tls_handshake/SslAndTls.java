package com.training.ssl_and_tls_handshake;

public class SslAndTls {


    /**
     *
🔐 Why SSL/TLS?
    To protect data while it's traveling from your browser (client) to the website (server).

     🛠️ Simple Flow of SSL/TLS Handshake (step-by-step):
    Client says hello:

        Your browser says: “Hi server, I want to talk securely. Here are the encryption methods I support.”

    Server replies with its certificate:

    Server sends back:
            ✔️ Its SSL certificate (issued by some trusted CA like GoDaddy, DigiCert, etc.)
            ✔️ Its public key

    Client checks the certificate:

        Your browser checks this cert in its TrustStore (a list of trusted CAs pre-installed like Google, GoDaddy, etc.).

        If valid ➝ continue. If not ➝ error (like "Your connection is not private").

    Session key creation:

        Now the client creates a random session key (used for actual data encryption).

    Encrypt session key using server's public key:

        Client encrypts this session key with the server’s public key and sends it to server.

    Server decrypts it:

        Server uses its private key to decrypt the session key.

    Secure channel ready:

        Both client & server now have the same session key.

        They now use it for fast, symmetric encryption (faster than public/private encryption).

    🧠 Quick Terms Meaning:
    Public key / Private key: Used in the beginning to securely exchange a session key.

    Session key: A temporary secret key used to encrypt data during the session.

            TrustStore: Like a list of “trusted ID cards” (CA certificates) your system trusts.

            Certificate Authority (CA): Like GoDaddy, Google – they issue verified certificates.

    🔁 Real-Life Example:
    Think of this like sending a secret letter:

    You (client) want to talk to your friend (server) privately.

    Your friend shows you an ID card signed by a trusted organization (CA).

    You check your trusted list (TrustStore) – if it matches, you trust them.

    You write a secret (session key), lock it with their public lock (public key), and send.

    They unlock it with their private key, and now you both use that secret to talk safely.

     */

}
