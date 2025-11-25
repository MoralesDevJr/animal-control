package animal.control.main;
import animal.cadastro.Cadastro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Controle de animais alimentados.");
        int opcao;
        do {
            System.out.println("--- ENTRADA ---: ");
            System.out.println("1- CADASTRAR NOVO ANIMAL");
            System.out.println("2- LISTAR DE ANIMAIS PRESENTES");
            System.out.println("3- ATUALIZAR DADOS DE UM ANIMAL");
            System.out.println("4- SAIR");
            opcao = scn.nextInt();
        switch(opcao){
            case 1:
                Cadastro.cadastrarAnimal("Raw", "rawzinho@", 12312300);
                break;

            case 2:
                System.out.println("Listando animais... (implementar)");
                break;

            case 3:
                System.out.println("Atualizando animal... (implementar)");
                break;

            case 4:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida!");
        }
        } while (opcao != 4);
        scn.close();
    }
}