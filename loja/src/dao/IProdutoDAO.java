package loja.src.dao;

import java.util.List;
import loja.src.domain.Produto;

public interface IProdutoDAO {
  public Integer create(String cpf, String nome);

  public Produto read(String cpf);

  public Integer update(Produto produto);

  public Integer delete(Produto produto);

  public List<Produto> readAll();
}
