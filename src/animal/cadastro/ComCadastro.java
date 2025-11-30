package animal.cadastro;

public class ComCadastro {
    private String nome;
    private String especie;
    private int dataNascimentoAnimal;
    private String nomeDono;
    private String convenio;
    private int IDAnimal;
    public ComCadastro(){}
    public ComCadastro(String nome, String especie, int dataNascimentoAnimal, String nomeDono, String convenio){
        this.nome = nome;
        this.especie = especie;
        this.dataNascimentoAnimal = dataNascimentoAnimal;
        this.nomeDono = nomeDono;
        this.convenio = convenio;
        int IDAnimal = 0;
    }
    public static String convenio(String nomeConvenio, String redeDeAtendimento, String acomodacaoConvenio) {
        return convenio;
    }
    public String getNome() {
        return nome;
    }
    public String getEspecie() {
        return especie;
    }
    public int getDataNascimentoAnimal() {
        return dataNascimentoAnimal;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public String getConvenio() {
        return convenio;
    }
    public int getIDAnimal() {
        return IDAnimal;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setDataNascimentoAnimal(int  dataNascimentoAnimal) {
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    public void setIDAnimal(int IDAnimal) {
        this.IDAnimal = IDAnimal;
    }
}