package animal.control.model;
import animal.cadastro.ComCadastro;
import java.time.LocalDate;
import java.util.Locale;

public class Animal {
    private String nomeDoAnimal;
    private LocalDate dataDeNascimento;
    private String especie;

    public Animal() {
    }

    public Animal(String nomeDoAnimal, LocalDate dataDeNascimento, String especie) {
        this.nomeDoAnimal = nomeDoAnimal;
        this.dataDeNascimento = dataDeNascimento;
        this.especie = especie;
    }

    public String getNome() {
        return nomeDoAnimal;
    }
    public void setNome(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void informacoes(String nomeDoAnimal, LocalDate dataDeNascimento, String especie) {
        System.out.println("Nome: " + nomeDoAnimal + ", Data de Nascimento: " + dataDeNascimento + ", Espécie: " + especie);
    }
}