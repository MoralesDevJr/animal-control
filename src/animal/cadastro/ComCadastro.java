package animal.cadastro;
import animal.control.model.Animal;

public class ComCadastro {
    private String nomeDono;
    private int IDAnimal;
    private String convenio;

    public ComCadastro(){}
    public ComCadastro(String nome, String especie, int dataNascimentoAnimal){
        this.nome = nome;
        this.especie = especie;
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }

    public static String convenio(String nomeConvenio, String redeDeAtendimento, String acomodacaoConvenio) {
        return convenio;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getDataNascimentoAnimal() {
        return dataNascimentoAnimal;
    }
    public void setDataNascimentoAnimal(int  dataNascimentoAnimal) {
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }

    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getConvenio() {
        return convenio;
    }
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public int getIDAnimal() {
        return IDAnimal;
    }
    public void setIDAnimal(int IDAnimal) {
        this.IDAnimal = IDAnimal;
    }
}