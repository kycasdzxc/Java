package chap16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpMultiChatClient {
   public static void main(String[] args) {
      if(args.length != 1) {
         System.out.println("USAGE: java TmpIpMultichatClient 대화명");
         System.exit(0);
      }
      try {
         String serverIp = "192.168.219.103";
         //소켓을 생성하여 연결 요청
         Socket socket = new Socket(serverIp, 80);
         System.out.println("서버에 연결되었습니다.");
         Thread sender = new Thread(new ClientSender(socket, args[0]));
         Thread receiver = new Thread(new ClientReceiver(socket));
         
         sender.start();
         receiver.start();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }//main


   static class ClientSender extends Thread {
      Socket socket;
      DataOutputStream out;
      String name;
      
       ClientSender(Socket socket, String name) {
         this.socket = socket;
         try {
            out = new DataOutputStream(socket.getOutputStream());
            this.name = name;
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      
      public void run() {
         Scanner scanner = new Scanner(System.in);
         try {
            if(out!=null) {
               out.writeUTF(name);
            }
            while (out != null) {
               out.writeUTF("["+name+"]"+scanner.nextLine());
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }

   static class ClientReceiver extends Thread {
      Socket socket;
      DataInputStream in;
      
      ClientReceiver(Socket socket) {
         this.socket = socket;
         try {
            in = new DataInputStream(socket.getInputStream());
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
         
      public void run() {
         while(in!=null) {
            try {
               System.out.println(in.readUTF());
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      } //run
   }//ClientReceiver
} //class