package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
  //atributos
  private String nome;
  private int codigoConvite;

  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return nome;
  }

  public int getCodigoConvite() {
    return codigoConvite;
  }

  // metodo pronto: faz uma comparação através do cod convite, garante que será único
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  // metodo pronto: retorna o hash
  @Override
  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }

  @Override
  public String toString() {
    return "Convidado{" +
        "nome='" + nome + '\'' +
        ", codigoConvite=" + codigoConvite +
        '}';
  }    
}
