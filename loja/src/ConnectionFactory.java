package loja.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

  private static Connection c;

  private ConnectionFactory() {
    try {
      c = getInstance();
    } catch (SQLException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  //TODO naming things
  public static Connection getInstance() throws SQLException {
    if (c == null) {
      c = init();
    }
    if (c != null && c.isClosed()) {
      c = init();
    }
    return c;
  }

  private static Connection init() {
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

  public static void closeConnection(
    Connection cn,
    PreparedStatement stm,
    ResultSet rs
  ) {
    try {
      if (rs != null && !rs.isClosed()) {
        rs.close();
      }
      if (stm != null && !stm.isClosed()) {
        stm.close();
      }
      if (cn != null && !cn.isClosed()) {
        cn.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
