package loja.src.domain;

public class Produto {

  private int id;
  private String nome;
  private double preço;

  // Constructors
  public Produto() {}

  public Produto(String nome, double preço) {
    this.nome = nome;
    this.preço = preço;
  }

  public Produto(int id, String nome, double preço) {
    this.id = id;
    this.nome = nome;
    this.preço = preço;
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreço() {
    return preço;
  }

  public void setPreço(double preço) {
    this.preço = preço;
  }
}
