package loja.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import loja.src.dao.ClienteDAOMock;
import loja.src.dao.IClienteDAO;
import loja.src.domain.Cliente;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

  IClienteDAO clienteDAO;

  @Before
  public void setup() {
    clienteDAO = new ClienteDAOMock();
  }

  @Test
  public void testCreate() {
    Cliente result = clienteDAO.create("123");
    assertNotNull(result);
    assertEquals("123", result.getCpf());
  }

  @Test
  public void testRead() {
    Cliente result = clienteDAO.read("123");
    assertNotNull(result);
    assertEquals("123", result.getCpf());
  }

  @Test
  public void testUpdate() {
    Boolean result = clienteDAO.update("123");
    assertTrue(result);
  }

  @Test
  public void testDelete() {
    Boolean result = clienteDAO.delete("123");
    assertTrue(result);
  }
}
