import java.net.*;

// import java.io.*;
import java.time.format.DateTimeFormatter;  
// import java.time.LocalDateTime;    

// public class SocketServer

// {

// public static void main(String args[])

{

ServerSocket server;

Socket client;

// int port=10000;
//    int port=1000;
   int port=2000;


// DataInputStream dis;

PrintStream ps;

// System.out.println("Starting Server Application");

System.out.println("Trying to open the connection");

try

{

server=new ServerSocket(port);

System.out.println("Successfully opened ServerSocket");

System.out.println("waiting for client connections");

client=server.accept();

System.out.println("Client connection established");

System.out.println("IP address of client is "+client.getInetAddress());

dis=new DataInputStream(client.getInputStream());

ps=new PrintStream(client.getOutputStream());

String s=dis.readLine();

System.out.println("The client:"+s);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   ps.println(dtf.format(now)); 



ps.println("Hello");

}

catch(Exception e)

{

System.out.println(e);

}

}

}class sever {
    
}
