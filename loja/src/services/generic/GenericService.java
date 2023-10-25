package loja.src.services.generic;

import loja.src.dao.generics.GenericDAO;
import loja.src.dao.generics.IGenericDAO;

public abstract class GenericService implements IGenericService {

  IGenericDAO dao = new GenericDAO();

  @Override
  public <T> T create(String id) {
    return dao.create(id);
  }

  @Override
  public Boolean delete(String id) {
    return dao.delete(id);
  }

  @Override
  public <T> T read(String id) {
    return dao.read(id);
  }

  @Override
  public Boolean update(String id) {
    return dao.update(id);
  }
}
