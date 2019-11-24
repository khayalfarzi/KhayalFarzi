package Lessons.Lesson18.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoginServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Files.copy(Paths.get("./content/login.html"), resp.getOutputStream());
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    String password = req.getParameter("password");
    System.out.printf("name:%s\n",name);
    System.out.printf("paswd:%s\n",password);
    Auth auth = new AuthHash();
    try (PrintWriter w = resp.getWriter()) {
      if (auth.check(name, password)) {
        w.printf("Auth for user:%s passwd:%s successful", name, password);
      } else {
        w.printf("Auth for user:%s passwd:%s Error", name, password);
      }
    }
  }
}
