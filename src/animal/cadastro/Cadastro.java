package animal.cadastro;

public class Cadastro {
    private String email;
    private String nome;
    private int CPF;

    public void cadastrarAnimal() {
        System.out.println("Digite o email: " + this.email);
        System.out.println("Digite o nome: " + this.nome);
        System.out.println("Digite o CPF: " + this.CPF);
    }

}
