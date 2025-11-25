package animal.cadastro;

public class Cadastro {
    private String email;
    private String nome;
    private int CPF;

    public Cadastro() {
    }

    public Cadastro(String email, String nome, int CPF) {
        this.email = email;
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public static void cadastrarAnimal() {
        System.out.println("Digite o email: " + Cadastro.email);
        System.out.println("Digite o nome: " + Cadastro.nome);
        System.out.println("Digite o CPF: " + Cadastro.CPF);
        System.out.println("Digite a senha: " + Cadastro.senha);
    }


}
