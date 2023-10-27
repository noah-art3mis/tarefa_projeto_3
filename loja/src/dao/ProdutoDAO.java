package loja.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import loja.src.ConnectionFactory;
import loja.src.domain.Produto;

public class ProdutoDAO implements IProdutoDAO {

  private String getSqlCreate() {
    return "INSERT INTO Produtos (nome, preço) VALUES (?, ?);";
  }

  private String getSqlRead() {
    return "SELECT * FROM Produtos WHERE nome = ?";
  }

  private String getSqlUpdate() {
    return "UPDATE Produtos SET nome = ?, preço = ? WHERE id_produto = ?";
  }

  private String getSqlDelete() {
    return "DELETE FROM Produtos WHERE nome = ?";
  }

  private String getSqlReadAll() {
    return "SELECT * FROM Produtos";
  }

  @Override
  public Integer create(String nome, Float preço) {
    Connection connection = null;
    PreparedStatement stm = null;

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlCreate();
      stm = connection.prepareStatement(sql);
      stm.setString(1, nome);
      stm.setDouble(2, preço);
      return stm.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.closeConnection(connection, stm, null);
    }
  }

  @Override
  public Produto read(String name) {
    Connection connection = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    Produto cliente = null;

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlRead();
      stm = connection.prepareStatement(sql);
      stm.setString(1, name);
      rs = stm.executeQuery();
      if (rs.next()) {
        Integer id = rs.getInt("ID_PRODUTO");
        String nome = rs.getString("NOME");
        Float preço = rs.getFloat("PREÇO");
        cliente = new Produto(id, nome, preço);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.closeConnection(connection, stm, null);
    }
    return cliente;
  }

  @Override
  public Integer update(Produto produto) {
    Connection connection = null;
    PreparedStatement stm = null;

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlUpdate();
      stm = connection.prepareStatement(sql);
      stm.setString(1, produto.getNome());
      stm.setDouble(2, produto.getPreço());
      stm.setInt(3, produto.getId());
      return stm.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.closeConnection(connection, stm, null);
    }
  }

  @Override
  public Integer delete(Produto produto) {
    Connection connection = null;
    PreparedStatement stm = null;

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlDelete();
      stm = connection.prepareStatement(sql);
      stm.setString(1, produto.getNome());
      return stm.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.closeConnection(connection, stm, null);
    }
  }

  @Override
  public List<Produto> readAll() {
    Connection connection = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    ArrayList<Produto> produtos = new ArrayList<>();

    try {
      connection = ConnectionFactory.getInstance();
      String sql = getSqlReadAll();
      stm = connection.prepareStatement(sql);
      rs = stm.executeQuery();
      while (rs.next()) {
        Integer id = rs.getInt("ID_PRODUTO");
        String nome = rs.getString("NOME");
        Float preço = rs.getFloat("PREÇO");
        Produto produto = new Produto(id, nome, preço);
        produtos.add(produto);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.closeConnection(connection, stm, null);
    }
    return produtos;
  }
}
