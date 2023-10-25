package loja.src.services;

import java.util.List;
import loja.src.dao.IClienteDAO;
import loja.src.domain.Cliente;
import loja.src.services.generic.GenericService;

public class ClienteService extends GenericService implements IClienteService {

  IClienteDAO clienteDAO;

  @Override
  public Integer create(String cpf, String nome) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @SuppressWarnings("unchecked")
  @Override
  public Cliente read(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'read'");
  }

  @Override
  public Integer update(Cliente cliente) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public Integer delete(Cliente cliente) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public List<Cliente> readAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'readAll'");
  }
}
