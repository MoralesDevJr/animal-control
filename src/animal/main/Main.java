package animal.main;
import animal.cadastro.ComCadastro;
import animal.cadastro.SemCadastro;
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
            System.out.println("2- CADASTRAR NOVO ANIMAL");
            System.out.println("3- LISTAR DE ANIMAIS PRESENTES");
            System.out.println("5- SAIR");
            opcao = scn.nextInt();
            switch(opcao){
            case 1:
                System.out.println("Digite os dados do Animal: ");
                System.out.println("Nome do Animal: ");
                String nome = scn.next();
                System.out.println("ID do Animal: ");
                int IDAnimal = scn.nextInt();
                System.out.println("Convênio: ");
                System.out.println("ID: " + IDAnimal + " | " + nome +  " | ");
                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        } while (opcao != 4);
        scn.close();
    }
}