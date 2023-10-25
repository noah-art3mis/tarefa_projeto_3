package loja.src.dao.generics;

public interface IGenericDAO {
  public <T> T create(String id);

  public <T> T read(String id);

  public Boolean update(String id);

  public Boolean delete(String id);
}
