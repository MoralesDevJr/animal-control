package animal.pet;

public class Pet {
    private int IDAnimal;
    public String especie;
    public boolean alimentado;

    public Pet() {
    }

    public Pet(int IDAnimal, int senha, String especie, boolean alimentado) {
        this.IDAnimal = IDAnimal;
        this.especie = especie;
        this.alimentado = alimentado;
    }

    public Pet(int IDAnimal, String especie) {
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}