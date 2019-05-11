package Package01;

import java.net.*;
import java.io.*;
/**
 * 
 * @author philipanderson
 * 
 * Create SERVER SOCKET TO PERMANENTLY RUN IN THE BACKGROUND
 *
 * First test socket client
 * 
 * Using
 * 
 * 1) Socket with IP : Port
 * 
 * 2) InputStreamReader to get data from the network (getInputStream)
 * 
 * 3) BufferedReader to buffer a line of input (readLine to get each line)
 *
 */
public class Socket_01 {
	
	static public int portNumber = 4248;
	
	public static void main(String[] args) {
		System.out.println("1");
		Server serverSocketInstance = new Server();
		System.out.println("2");
		serverSocketInstance.run();
		System.out.println("3");
		Socket_01 clientSocket = new Socket_01();
		System.out.println("4");
		clientSocket.readStream();
		System.out.println("12");
	}
	void readStream(){
		try{
			Socket socketClient = new Socket("127.0.0.1", portNumber);	
			System.out.println("5");
			InputStreamReader stream = new InputStreamReader(socketClient.getInputStream());
			System.out.println("6");
			BufferedReader buffer = new BufferedReader(stream);
			System.out.println("7");
			String message = "message";
			System.out.println("8");
			System.out.println("Message from server is " + message);
			System.out.println("9");
			buffer.close();
			System.out.println("10");
			socketClient.close();
			System.out.println("11");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				Server.serverSocket.close();
			}
			catch(BindException e){
				e.printStackTrace();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	void writeStream(){
		try{
			Socket chatSocket = new Socket("127.0.0.1", portNumber);
			PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
			writer.println("test line");
			writer.print("extra data");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				Server.serverSocket.close();
			}
			catch(BindException e){
				e.printStackTrace();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

class Server{	
	/**
	 *  ServerSocket runs in the background and waits for client requests
	 */

	static ServerSocket serverSocket;
	
	void run(){
		try{
			serverSocket = new ServerSocket(Socket_01.portNumber);
		}
		catch(BindException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{

		}
	}
}

















