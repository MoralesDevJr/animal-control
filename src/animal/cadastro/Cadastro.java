package animal.cadastro;

public class Cadastro {
  private String email;
  private int CPF;
  private int senha;

  public Cadastro(String email, int CPF, int senha){
    this.email = email;
    this.CPF = CPF;
    this.senha = senha;
  }

  public void seCadastro(){
    System.out.println("Digite seu email: ");
    System.out.println("Email: " + this.email);
  }

  public void cancelarCadastro(){
    System.out.println("Cadastro cancelado!");
}
