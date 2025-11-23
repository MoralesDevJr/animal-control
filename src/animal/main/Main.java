package animal.main;
import animal.pet.Pet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Animal animal = new Animal();

    System.out.println("Controle de animais alimentados.");
    do {
        System.out.println("--- ENTRADA ---: ");
        System.out.println("1- CADASTRAR NOVO ANIMAL");
        System.out.println("2- LISTAR DE ANIMAIS PRESENTES");
        System.out.println("3- ATUALIZAR DADOS DE UM ANIMAL");
        System.out.println("4- SAIR");
        int opcao = scn.nextInt();
    } while (opcao != 4);
    switch(){
        case 1:
            System.out.println("Digite seu ID: ");
            opcao = scn.next();
            cadastrarAnimal();
        case 2:
                listagemAnimais();
        case 3:
            System.out.println("Digite ID do animal: ");
            int IDAnimal = scn.nextInt();


    }
    scn.close();
    }