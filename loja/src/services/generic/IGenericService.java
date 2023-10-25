package loja.src.services.generic;

public interface IGenericService {
  public <T> T create(String id);

  public <T> T read(String id);

  public Boolean update(String id);

  public Boolean delete(String id);
}
