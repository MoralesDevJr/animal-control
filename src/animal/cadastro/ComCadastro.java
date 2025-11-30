package animal.cadastro;
import animal.control.model.Animal;

public class ComCadastro {
    private Animal animal;
    private String nomeDono;
    private int IDAnimal;
    private String convenio;

    public ComCadastro(){}

    public ComCadastro(Animal animal, String nomeDono, String convenio, int IDAnimal) {
        this.animal = animal;
        this.nomeDono = nomeDono;
        this.convenio = convenio;
        this.IDAnimal = IDAnimal;
    }

    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public static void convenio(String nomeConvenio, String redeDeAtendimento, String acomodacaoConvenio) {
        System.out.println("Convênio: " + nomeConvenio + "Rede: " + redeDeAtendimento + "Acomodação: " + acomodacaoConvenio);
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

    public void exibirCadastro() {
        System.out.println("ID: " + IDAnimal);
        System.out.println("Nome do animal: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Data de nascimento: " + animal.getDataDeNascimento());
        System.out.println("Nome do dono: " + nomeDono);
        System.out.println("Convênio: " + convenio);
    }

}