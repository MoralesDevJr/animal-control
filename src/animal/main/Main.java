package animal.main;
import animal.cadastro.ComCadastro;
import animal.cadastro.SemCadastro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Controle de animais alimentados.");
        int opcao;
        do {
            System.out.println("--- ENTRADA ---: ");
            System.out.println("1- LOGAR");
            System.out.println("2- CADASTRAR NOVO ANIMAL");
            System.out.println("3- LISTAR DE ANIMAIS PRESENTES");
            System.out.println("5- SAIR");
            opcao = scn.nextInt();
            switch(opcao){
            case 1:
                System.out.println("Digite o nome do animal: ");

                break;
            case 2:
                    System.out.println("Animal 1");
                    System.out.println("Animal 2");
                    System.out.println("Animal 3");
                    System.out.println("Animal 4");
                break;
            case 3:
                scn.nextLine();
                ComCadastro.cancelarCadastro(scn);
                break;

            case 4:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        } while (opcao != 4);
        scn.close();
    }
}