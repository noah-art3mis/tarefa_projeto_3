package loja.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Random;
import loja.src.dao.IProdutoDAO;
import loja.src.dao.ProdutoDAO;
import loja.src.domain.Produto;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProdutoDaoTest {

  IProdutoDAO produtoDAO;

  @Before
  public void setup() {
    produtoDAO = new ProdutoDAO();
  }

  @After
  public void teardown() {}

  @Test
  public void testCreate() {
    String nome = "ProdutoTeste";
    Integer result = produtoDAO.create(nome, 123f);

    assertNotNull(result);
    assertTrue(result == 1);

    produtoDAO.delete(produtoDAO.read(nome));
  }

  @Test
  public void testRead() {
    String nome = "ProdutoTeste";
    produtoDAO.create(nome, 123f);

    Produto produto = produtoDAO.read(nome);

    assertNotNull(produto);

    produtoDAO.delete(produtoDAO.read(nome));
  }

  @Test
  public void testUpdate() {
    String nome = "ProdutoTeste";
    produtoDAO.create(nome, 123f);

    Float novoPreço = 456f;

    Produto produto = produtoDAO.read(nome);
    produto.setPreço(novoPreço);

    Integer result = produtoDAO.update(produto);

    assertNotNull(result);
    assertEquals(produtoDAO.read(nome).getPreço(), novoPreço);
  }

  @Test
  public void testDelete() {
    String nome = "ProdutoTeste";
    produtoDAO.create(nome, 123f);

    Produto produto = produtoDAO.read(nome);
    Integer result = produtoDAO.delete(produto);

    assertTrue(result == 1);
    assertNull(produtoDAO.read(nome));
  }

  @Test
  public void testReadAll() {
    List<Produto> result = produtoDAO.readAll();
    assertNotNull(result);
    assertNotNull(result.get(0));
    assertTrue(result.size() > 0);
  }
}
