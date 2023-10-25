package loja.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import loja.src.ConnectionFactory;
import loja.src.dao.generics.GenericDAO;
import loja.src.domain.Cliente;

public class ClienteDAO extends GenericDAO implements IClienteDAO {

  private String getSqlCreate() {
    return "INSERT INTO Clientes (cpf, nome) VALUES (?, ?)";
  }

  @Override
  public Integer create(String cpf, String nome) {
    Connection connection = null;
    PreparedStatement stm = null;

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlCreate();
      stm = connection.prepareStatement(sql);
      stm.setString(1, cpf);
      stm.setString(1, nome);
      return stm.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException();
    } finally {
      closeConnection(connection, stm, null);
    }
  }

  private String getSqlRead() {
    return "SELECT * FROM Clientes WHERE CPF = ?";
  }

  @Override
  @SuppressWarnings("unchecked")
  public Cliente read(String cpf) {
    Connection connection = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    Cliente cliente = null;

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlRead();
      stm = connection.prepareStatement(sql);
      stm.setLong(1, Long.parseLong(cpf));
      rs = stm.executeQuery();
      if (rs.next()) {
        Long id = rs.getLong("ID");
        String _cpf = rs.getString("CPF");
        String nome = rs.getString("NOME");
        cliente = new Cliente(_cpf, nome, id);
      }
    } catch (SQLException e) {
      throw new RuntimeException();
    } finally {
      closeConnection(connection, stm, null);
    }
    return cliente;
  }

  private String getSqlUpdate() {
    return "UPDATE Clientes SET cpf = ?, nome = ? WHERE id_cliente = ?";
  }

  @Override
  public Integer update(Cliente cliente) {
    Connection connection = null;
    PreparedStatement stm = null;

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlUpdate();
      stm = connection.prepareStatement(sql);
      stm.setString(1, cliente.getCpf());
      stm.setString(1, cliente.getNome());
      stm.setLong(1, cliente.getId());
      return stm.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException();
    } finally {
      closeConnection(connection, stm, null);
    }
  }

  private String getSqlDelete() {
    return "DELETE FROM Clientes WHERE CPF = ?";
  }

  @Override
  public Integer delete(Cliente cliente) {
    Connection connection = null;
    PreparedStatement stm = null;

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlDelete();
      stm = connection.prepareStatement(sql);
      stm.setString(1, cliente.getCpf());
      return stm.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException();
    } finally {
      closeConnection(connection, stm, null);
    }
  }

  private String getSqlReadAll() {
    return "SELECT * FROM Clientes";
  }

  @Override
  public List<Cliente> readAll() {
    Connection connection = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    ArrayList<Cliente> clientes = new ArrayList<>();

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlReadAll();
      stm = connection.prepareStatement(sql);
      rs = stm.executeQuery();
      while (rs.next()) {
        Long id = rs.getLong("ID");
        String cpf = rs.getString("CPF");
        String nome = rs.getString("NOME");
        Cliente cliente = new Cliente(cpf, nome, id);
        clientes.add(cliente);
      }
    } catch (SQLException e) {
      throw new RuntimeException();
    } finally {
      closeConnection(connection, stm, null);
    }
    return clientes;
  }

  private void closeConnection(
    Connection cn,
    PreparedStatement stm,
    ResultSet rs
  ) {
    try {
      if (rs != null && !rs.isClosed()) {
        rs.close();
      }
      if (stm != null && !stm.isClosed()) {
        stm.close();
      }
      if (cn != null && !cn.isClosed()) {
        cn.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
