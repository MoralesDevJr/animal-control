package animal.pet;

public class Pet {
    private int IDAnimal;
    private String nome;
    public String especie;
    public boolean alimentado;

    public Pet() {
    }

    public Pet(int IDAnimal, int senha, String especie, boolean alimentado) {
        this.IDAnimal = IDAnimal;
        this.senha = senha;
        this.especie = especie;
        this.alimentado = alimentado;
    }

    public Pet(int IDAnimal, String especie, int senha) {
        this.IDAnimal = IDAnimal;
        this.especie = especie;
        this.alimentado = false;
    }

    public int getIDAnimal() {
        return IDAnimal;
    }

    public void setIDAnimal(int IDAnimal) {
        this.IDAnimal = IDAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}