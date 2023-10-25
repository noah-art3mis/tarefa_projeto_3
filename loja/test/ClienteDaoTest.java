package loja.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import loja.src.dao.ClienteDAOMock;
import loja.src.dao.IClienteDAO;
import loja.src.domain.Cliente;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {

  IClienteDAO dao = new ClienteDAOMock();
  Cliente cliente;

  @Before
  public void init() {
    cliente = new Cliente("123");
  }

  @Test
  public void createTest() {
    cliente = dao.create("456");
    assertNotNull(cliente);
  }

  @Test
  public void readTest() {
    cliente = dao.read("123");
    assertEquals("123", cliente.getCpf());
  }

  @Test
  public void updateTest() {
    Boolean status = dao.update("123");
    assertTrue(status);
  }

  @Test
  public void deleteTest() {
    Boolean status = dao.delete("123");
    assertTrue(status);
  }
}
