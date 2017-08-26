import java.io.*;
import java.net.*;
class server
{
	public static void main(String args[])
	{
		try{
		System.out.println("server application window");
		ServerSocket ss=new ServerSocket(2100);
		Socket s= ss.accept();
		OutputStream obj=s.getOutputStream();
		PrintStream ps=new PrintStream(obj);
		String str="Marvilous infotec";
		ps.println(str);
		ps.close();
	obj.close();
		s.close();
		ss.close();
		}
		catch(Exception e){}
	}
} 
