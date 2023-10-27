package loja.src.dao;

import java.util.List;
import loja.src.domain.Produto;

public interface IProdutoDAO {
  public Integer create(String nome, Float preço);

  public Produto read(String name);

  public Integer update(Produto produto);

  public Integer delete(Produto produto);

  public List<Produto> readAll();
}
