package loja.test;

import static org.junit.Assert.*;

import loja.src.dao.ClienteDAO;
import loja.src.dao.IClienteDAO;
import loja.src.domain.Cliente;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {

  IClienteDAO clienteDAO;
  String cpf = "123";

  @Before
  public void setup() {
    clienteDAO = new ClienteDAO();
  }

  @After
  public void teardown() {
    clienteDAO.delete(clienteDAO.read(cpf));
  }

  @Test
  public void testCreate() {
    Integer result = clienteDAO.create(cpf, "Nome");

    assertNotNull(result);
    assertTrue(result == 1);
    fail(); //TODO
  }

  @Test
  public void testRead() {
    clienteDAO.create(cpf, "Nome");
    Cliente cliente = clienteDAO.read(cpf);

    assertNotNull(cliente);
    fail(); //TODO
  }

  @Test
  public void testUpdate() {
    clienteDAO.create(cpf, "Nome");
    Cliente cliente = clienteDAO.read(cpf);
    cliente.setNome("Outro nome");

    Integer result = clienteDAO.update(cliente);

    assertTrue(result == 1);
    fail(); //TODO
  }

  @Test
  public void testDelete() {
    clienteDAO.create(cpf, "Nome");
    Cliente cliente = clienteDAO.read(cpf);
    Integer result = clienteDAO.delete(cliente);
    assertTrue(result == 1);
    fail(); //TODO
  }

  @Test
  public void testReadAll() {
    fail();
    //TODO
  }
}
