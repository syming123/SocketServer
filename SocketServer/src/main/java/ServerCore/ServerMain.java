package ServerCore;

import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain
{
    public static void start()
    {
        System.out.println("Input your command:");
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            String str = scan.nextLine();
            if(str.equals("run"))
            {
                run();
                break;
            }
            else if(str.equals("port"))
            {
                System.out.println(KeyData.getPORT());
            }
            else if(str.equals("set port"))
            {
                String portIpt = scan.nextLine();
                try {
                    int port = Integer.parseInt(portIpt);
                    KeyData.setPORT(port);
                }catch (Exception e) {
                    System.out.println("Please enter the correct port!");
                }

            }
            else
            {
                System.out.println("Please enter correct command:");
            }
        }

    }

    public static void run()
    {
        try {
            ServerSocket serverSocket = new ServerSocket(KeyData.getPORT());
            System.out.println("Server is running...");

            while (true)
            {
                Socket socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
