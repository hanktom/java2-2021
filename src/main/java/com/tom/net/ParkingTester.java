package com.tom.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ParkingTester {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://odws.hccg.gov.tw/001/Upload/25/OpenData/9059/452/7f02e869-396b-480c-b93f-f62cf67b0f7c.json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();;
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StringBuffer sb = new StringBuffer();
            String line = in.readLine();
            while(line != null) {
//                System.out.println(line);
                sb.append(line);
                line = in.readLine();
            }
            System.out.println(sb.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
