package aula11;

import java.sql.Connection;
import java.sql.DriverManager;

// FILE -> PROJECT STRUCTURE -> MODULES -> + -> JAR OR DIRECTORIES
public class DbConnector {
  public static Connection connect(String url, String user, String password) {
    Connection conn = null;
    try {
      Class.forName("org.postgresql.Driver");
      conn = DriverManager.getConnection(url, user, password);
      System.out.println("Connected to the PostgreSQL server successfully.");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }
}
