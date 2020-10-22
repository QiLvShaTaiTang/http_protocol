package net.http.protocol;

import java.io.InputStream;
import java.net.Socket;

public class Test {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.baidu.com", 80);
            String httpRequest = "GET / HTTP/1.1\r\n\r\n\r\n";
            socket.getOutputStream().write(httpRequest.getBytes());
            socket.getOutputStream().flush();
            InputStream inputStream = socket.getInputStream();
//            Thread.sleep( 1000 );
            while (inputStream.available() == 0){

            }
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            System.out.println(new String(bytes) );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
