package loja.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;
import loja.src.dao.ClienteDAO;
import loja.src.dao.IClienteDAO;
import loja.src.domain.Cliente;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {

  IClienteDAO clienteDAO;

  @Before
  public void setup() {
    clienteDAO = new ClienteDAO();
  }

  @After
  public void teardown() {}

  @Test
  public void testCreate() {
    Long cpf = new Random().nextLong();
    Integer result = clienteDAO.create(cpf, "Nome");

    assertNotNull(result);
    assertTrue(result == 1);

    clienteDAO.delete(clienteDAO.read(cpf));
  }

  @Test
  public void testRead() {
    Long cpf = new Random().nextLong();
    clienteDAO.create(cpf, "Nome");

    Cliente cliente = clienteDAO.read(cpf);

    assertNotNull(cliente);

    clienteDAO.delete(clienteDAO.read(cpf));
  }

  @Test
  public void testUpdate() {
    Long cpf = new Random().nextLong();
    clienteDAO.create(cpf, "Nome");

    String novoNome = "Outro nome";

    Cliente cliente = clienteDAO.read(cpf);
    cliente.setNome(novoNome);

    Integer result = clienteDAO.update(cliente);

    assertNotNull(result);
    assertEquals(clienteDAO.read(cpf).getNome(), novoNome);
  }

  @Test
  public void testDelete() {
    Long cpf = new Random().nextLong();
    clienteDAO.create(cpf, "Nome");

    Cliente cliente = clienteDAO.read(cpf);
    Integer result = clienteDAO.delete(cliente);

    assertTrue(result == 1);
    assertNull(clienteDAO.read(cpf));
  }

  @Test
  public void testReadAll() {
    List<Cliente> result = clienteDAO.readAll();
    assertNotNull(result);
    assertNotNull(result.get(0));
    assertTrue(result.size() > 0);
  }
}
