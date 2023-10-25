package loja.src.dao;

import loja.src.domain.Cliente;

public interface IClienteDAO {
  public Cliente create(String id);

  public Cliente read(String id);

  public Boolean update(String id);

  public Boolean delete(String id);
}
