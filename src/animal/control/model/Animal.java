package animal.control.model;
import animal.cadastro.ComCadastro;
import java.time.LocalDate;
import java.util.Locale;

public class Animal {
    private String nome;
    private LocalDate dataDeNascimento;
    private String especie;

    public Animal() {
    }

    public Animal(String nome, LocalDate dataDeNascimento, String especie) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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

    public static String informacoes(String nome, LocalDate dataDeNascimento, String especie) {
        System.out.println("Nome: " + nome + ", Data de Nascimento: " + dataDeNascimento + ", Espécie: " + especie);
    }
}