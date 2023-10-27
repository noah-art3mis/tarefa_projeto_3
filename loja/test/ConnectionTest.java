package loja.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import loja.src.ConnectionFactory;
import org.junit.Test;

public class ConnectionTest {

  @Test
  public void initTest() {
    try {
      Connection cn = ConnectionFactory.getInstance();
      assertNotNull(cn);
    } catch (Exception e) {
      fail();
    }
  }
}
