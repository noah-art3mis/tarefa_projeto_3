package loja.src.domain;

public class Cliente {

  private String cpf;
  private String nome;
  private String telefone;
  private String endereco;
  private String numero;
  private String cidade;
  private String estado;

  public Cliente(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
    result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
    result = prime * result + ((numero == null) ? 0 : numero.hashCode());
    result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
    result = prime * result + ((estado == null) ? 0 : estado.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Cliente other = (Cliente) obj;
    if (cpf == null) {
      if (other.cpf != null) return false;
    } else if (!cpf.equals(other.cpf)) return false;
    if (nome == null) {
      if (other.nome != null) return false;
    } else if (!nome.equals(other.nome)) return false;
    if (telefone == null) {
      if (other.telefone != null) return false;
    } else if (!telefone.equals(other.telefone)) return false;
    if (endereco == null) {
      if (other.endereco != null) return false;
    } else if (!endereco.equals(other.endereco)) return false;
    if (numero == null) {
      if (other.numero != null) return false;
    } else if (!numero.equals(other.numero)) return false;
    if (cidade == null) {
      if (other.cidade != null) return false;
    } else if (!cidade.equals(other.cidade)) return false;
    if (estado == null) {
      if (other.estado != null) return false;
    } else if (!estado.equals(other.estado)) return false;
    return true;
  }

  @Override
  public String toString() {
    return "Cliente [cpf=" + cpf + ", nome=" + nome + "]";
  }
}
