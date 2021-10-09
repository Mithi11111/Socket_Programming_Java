// import java.net.*;

import java.io.*;

// public class SocketClient

{

public static void main(String args[])

{

// Socket server;

int port=10000;
int port=2000;

DataInputStream dis;

// PrintStream ps;

String host="localhost";

// System.out.println("Starting Client Application");

System.out.println("Trying to open the connection");

try

{

server=new Socket(host,port);

// System.out.println("Successfully opened ServerSocket");

dis=new DataInputStream(server.getInputStream());

ps=new PrintStream(server.getOutputStream());

ps.println("Hello");

String s=dis.readLine();

System.out.println("The server:"+s);

// ps.println("Hello");

}

catch(Exception e)

{

System.out.println(e);

}

}

}
