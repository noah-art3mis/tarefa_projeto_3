// package loja.src.dao;

// import java.util.ArrayList;
// import java.util.List;
// import loja.src.domain.Cliente;

// public class ClienteDAOMock implements IClienteDAO {

//   @Override
//   public Integer create(String cpf, String nome) {
//     return 1;
//   }

//   @Override
//   public Cliente read(String id) {
//     return new Cliente("123", "Freya", 456L);
//   }

//   @Override
//   public Integer update(Cliente cliente) {
//     return 1;
//   }

//   @Override
//   public Integer delete(Cliente cliente) {
//     return 1;
//   }

//   @Override
//   public List<Cliente> readAll() {
//     List<Cliente> a = new ArrayList<Cliente>();
//     a.add(new Cliente("123", "Freya", 456L));
//     a.add(new Cliente("789", "Shiffman", 234L));
//     return a;
//   }
// }
