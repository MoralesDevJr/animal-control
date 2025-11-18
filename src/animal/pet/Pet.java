package animal.pet;

public class Pet {
    public String nome, especie;
    public int idade;
    public boolean alimentado;

    public Pet(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.alimentado = false;
    }
    public void alimentar(){
        this.alimentado = true;
            System.out.println("Pet alimentado!");
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
}
