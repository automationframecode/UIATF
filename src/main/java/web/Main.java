package web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
    public static final int HTTP_SERVER_PORT = 8081;


    private static Server httpServer;
    private static Server shutdownServer;

    public static void main(String[] args) {
//        start();
        try {
            httpServer.join();
        } catch (Exception e) {
            System.out.println("Unable to start server !");
            e.printStackTrace();
        }
    }
}
