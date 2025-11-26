package animal.cadastro;
import java.util.Scanner;

public class Cadastro {
    static Scanner scn = new Scanner(System.in);
    public static void cadastrarAnimal(Scanner scn) {
        System.out.print("Nome: ");
        String nome = scn.nextLine();
        System.out.println("Nome: " + nome);
        System.out.print("Senha: ");
        String senha = scn.nextLine();
        System.out.println("Senha: " + senha);
    }
    public static void cancelarCadastro(Scanner scn) {
        System.out.print("Deseja cancelar o cadastro? (Sim/Nao): ");
        String opcaoSim = Cadastro.scn.nextLine();
        if (opcaoSim.equals("Sim")) {
            System.out.println("Cadastro Cancelado!");
        }else {
            System.out.print("Deseja retornar ao menu? (Sim/Nao): ");
            opcaoSim = Cadastro.scn.nextLine();
            if (opcaoSim.equals("Sim")) {
                return;
            }
        }
    }
}
