package loja.src.dao;

import java.util.List;
import loja.src.domain.Cliente;

public interface IClienteDAO {
  public Integer create(Long cpf, String nome);

  public Cliente read(Long cpf);

  public Integer update(Cliente cliente);

  public Integer delete(Cliente cliente);

  public List<Cliente> readAll();
}
