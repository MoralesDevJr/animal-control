package animal.cadastro;
import animal.control.model.Animal;

public class ComCadastro {
    private String nomeDono;
    private String email;
    private int senha;

    public ComCadastro(){}

    public ComCadastro(String nomeDono, String email, int senha) {
        this.nomeDono = nomeDono;
        this.email = email;
        this.senha = senha;
    }

    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getConvenio() {
        return email;
    }
    public void setConvenio(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void exibirCadastro() {
        System.out.println("Nome do dono: " + nomeDono);
        System.out.println("Convênio: " + email);
    }
''}