package Lessons.Lesson18.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class TheSimplestServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9002);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(HelloServlet.class, "/hello/*");
        handler.addServlet(LoginServlet.class, "/login/*");
        handler.addServlet(HelpServlet.class, "/help/*");
        handler.addServlet(FileServlet.class, "/*");
        handler.addServlet(Servlet404.class, "/*");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
