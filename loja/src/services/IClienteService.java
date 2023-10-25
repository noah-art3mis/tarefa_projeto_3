package loja.src.services;

import loja.src.domain.Cliente;

public abstract interface IClienteService {
  public Cliente create(String id);

  public Cliente read(String id);

  public Boolean update(String id);

  public Boolean delete(String id);
}
