package animal.main;
import animal.cadastro.ComCadastro;
import animal.control.model.Animal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n -------------------");
        System.out.println("PET LOVE SHOP & CARE");
        System.out.println("\n -------------------");
        int opcao;
        do {
            System.out.println("------MENU------");
            System.out.println("1- LOGAR");
            System.out.println("2- CADASTRAR-SE");
            System.out.println("3- LISTAR DE ANIMAIS PRESENTES");
            System.out.println("5- SAIR");
            opcao = scn.nextInt();
            switch(opcao){
            case 1:
                System.out.println("ID do animal: ");
                int IDAnimal = Integer.parseInt(scn.nextLine());

                break;
            case 2:
                System.out.println("Digite o nome do dono: ");
                break;
            case 3:
                System.out.print(" 3 ");
                break;
            case 4:
                System.out.print(" 4 ");
                break;
                case 5:
                    System.out.print("Saindo...");
                    break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        } while (opcao != 4);
        scn.close();
    }
}