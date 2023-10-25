package loja.src.services;

import loja.src.dao.IClienteDAO;
import loja.src.domain.Cliente;
import loja.src.services.generic.GenericService;

public class ClienteService extends GenericService implements IClienteService {

  IClienteDAO clienteDAO;

  public ClienteService(IClienteDAO clienteDAO) {
    super();
    this.clienteDAO = clienteDAO;
  }

  @Override
  public Cliente create(String id) {
    return clienteDAO.create(id);
  }

  @Override
  public Cliente read(String id) {
    return clienteDAO.read(id);
  }

  @Override
  public Boolean update(String id) {
    return clienteDAO.update("123");
  }

  @Override
  public Boolean delete(String id) {
    return clienteDAO.delete("123");
  }
}
