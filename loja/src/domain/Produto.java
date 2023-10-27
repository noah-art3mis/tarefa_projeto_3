package loja.src.domain;

public class Produto {

  private Integer id;
  private String nome;
  private Float preço;

  // Constructors
  public Produto() {}

  public Produto(String nome, Float preço) {
    this.nome = nome;
    this.preço = preço;
  }

  public Produto(int id, String nome, Float preço) {
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

  public Float getPreço() {
    return preço;
  }

  public void setPreço(Float preço) {
    this.preço = preço;
  }
}
