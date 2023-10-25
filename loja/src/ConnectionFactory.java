package loja.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  private static Connection c;

  private ConnectionFactory() {
    c = getInstance();
  }

  public static Connection getInstance() {
    if (c == null) {
      c = init();
    }
    return c;
  }

  public static Connection init() {
    try {
      return DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres",
        "postgres",
        "admin"
      );
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
