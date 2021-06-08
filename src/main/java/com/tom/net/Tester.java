package com.tom.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        //TELNET, RFC 854
        try {
            Socket socket = new Socket("ptt.cc", 23);
//            Socket socket = new Socket("tw.yahoo.com", 80);
//            Socket socket = new Socket("www.ibm.com", 80);
            InputStream is = socket.getInputStream();
            for (int i = 0; i < 500; i++) {
                int data = is.read();
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //API? APplication Interface

    }
}
