package animal.main;
import animal.pet.Pet;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Raw", "Cachorro", 3);
        pet1.exibirInfo();
        pet1.alimentar();
        System.out.println("Nome do primeiro pet: " + pet1.nome);
        Pet pet2 = new Pet("Ráu", "Cachorro", 4);
        pet2.exibirInfo();
        System.out.println("Nome do segundo pet: " + pet2.nome);
        Pet pet3 = new Pet("Rex", "Cachorro", 10);
        pet3.exibirInfo();
        System.out.println("Nome do terceiro pet: " + pet3.nome);
        Pet pet4 = new Pet("Felix", "Gato", 1);
        pet4.exibirInfo();
        System.out.println("Nome do quarta pet: " + pet4.nome);
    }
}
