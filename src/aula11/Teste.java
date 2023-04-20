package aula11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Teste {
  public static void main(String[] args) {
    final String url = "jdbc:postgresql://localhost:5432/postgres";
    final String user = "postgres";
    final String password = "123456";

    Connection conn = DbConnector.connect(url, user, password);

    try {
      Statement statement = conn.createStatement();
      String sql = "select * from users";

      ResultSet resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        System.out.println(resultSet.getInt("id"));
      }



      resultSet.close();
      statement.close();
      conn.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
