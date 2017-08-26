import java.io.*;
import java.net.*;
class client
{
	public static void main(String args[])
	{
		try{
		System.out.println("Client application running");
		Socket s=new Socket("localhost",2100);
		InputStream iobj=s.getInputStream();
		InputStreamReader irobj=new InputStreamReader(iobj);
		BufferedReader br=new BufferedReader(irobj);
		String str;
		str=br.readLine();
		System.out.println(str);
		br.close();
		irobj.close();
		iobj.close();
		s.close();
		}
		catch(Exception e){}
	}
}
