package loja.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import loja.src.dao.ClienteDAOMock;
import loja.src.dao.IClienteDAO;
import loja.src.domain.Cliente;
import loja.src.services.ClienteService;
import loja.src.services.IClienteService;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

  IClienteService clienteService;
  Cliente cliente;

  public ClienteTest() {
    IClienteDAO dao = new ClienteDAOMock();
    clienteService = new ClienteService(dao);
  }

  @Before
  public void init() {
    cliente = new Cliente("123");
    // cliente.setNome("Alice");
    // cliente.setTelefone("1");
    // cliente.setEndereco("2");
    // cliente.setNumero("3");
    // cliente.setCidade("B");
    // cliente.setEstado("C");
  }

  @Test
  public void createTest() {
    cliente = clienteService.create("123");
    assertNotNull(cliente);
  }

  @Test
  public void readTest() {
    cliente = new Cliente("123");
    Cliente result = clienteService.read("123");
    assertNotNull(result);
    assertEquals("123", result.getCpf());
  }

  @Test
  public void updateTest() {
    Boolean status = clienteService.update("123");
    assertTrue(status);
  }

  @Test
  public void deleteTest() {
    Boolean status = clienteService.delete("123");
    assertTrue(status);
  }
}
