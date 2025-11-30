package animal.control.model;

public class Animal {
    private int IDAnimal;
    private String nome;
    public String especie;

    public Animal() {
    }

    public Animal(int IDAnimal, String nome, String especie) {
        this.IDAnimal = IDAnimal;
        this.nome = nome;
        this.especie = especie;
    }

    public Animal(int IDAnimal, String especie) {
        this.IDAnimal = IDAnimal;
        this.especie = especie;
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

    public void mostrarAnimal() {
        this.nome = nome;
        System.out.println("Nome: " + nome + 0);
    }
}