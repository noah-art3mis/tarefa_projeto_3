package loja.src.services;

import java.util.List;
import loja.src.domain.Cliente;

public abstract interface IClienteService {
  public Integer create(String cpf, String nome);

  public Cliente read(String id);

  public Integer update(Cliente cliente);

  public Integer delete(Cliente cliente);

  public List<Cliente> readAll();
}
