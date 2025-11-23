package animal.pet;

public class Pet {
    private String nome;
    private int idade;
    public String especie;
    public boolean alimentado;

    public Pet(){}

    public Pet(String nome, int idade, String especie, boolean alimentado){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = false;
    }

    public Pet(String nome, String especie, boolean alimentado){
        this.nome = nome;
        this.especie = especie;
        this.alimentado = false;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void alimentar(){
        this.alimentado = true;
            System.out.println("Pet alimentado!");
        }
    }
    public void fazerBarulho() {
        if (especie.equals("Cachorro")) {
            System.out.println("AU AU!");
        } else if (especie.equals("Gato")) {
            System.out.println("Miau!");
        } else {
            System.out.println("Espécie ainda não definida no sistema");
        }
    }
    public void exibirInfo() {
        System.out.println("O nome do animal é " + nome + ", sendo da espécie: " + especie + ", no momento com " + idade + " anos de vida e está " + (alimentado ? "alimentado" : "com fome"));
    }