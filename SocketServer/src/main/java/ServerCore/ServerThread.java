package ServerCore;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread
{
    Socket socket;
    public ServerThread()
    {
        super();
    }
    public ServerThread(Socket socket)
    {
        super();
        System.out.println("One Client Connected");
        this.socket = socket;
    }
    public void run()
    {
        try
        {
            BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
            while (true)
            {
                String str = in.readLine();
                if (MessageProcess.ifStop(str))
                {
                    break;
                }
                out.println(MessageProcess.process(str));
                out.flush();
            }
            in.close();
            out.close();
            socket.close();
            System.out.println("One Client Unconnected");
        }
        catch(Exception e)
        {
            System.out.println("ServerThread Exception,maybe one connection exit incorrect.\n");
            e.printStackTrace();
        }
    }
}
