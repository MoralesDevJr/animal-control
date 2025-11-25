package animal.cadastro;
import main.Main;

public class Cadastro {
    static Scanner scn = new Scanner(System.in);
    public static void cadastrarAnimal() {
        System.out.print("Nome: ");
        String nome = scn.nextLine();
        System.out.println("Nome: " + nome);
        System.out.print("Senha: ");
        String senha = scn.nextLine();
        System.out.println("Senha: " + senha);
    }

    public static void cancelarCadastro() {
        System.out.print("Deseja cancelar o cadastro? (Sim/Nao): ");
        String opcaoSim = scn.nextLine();
        if (opcaoSim.equals("Sim")) {
            System.out.println("Cadastro Cancelado!");
        }else {
            System.out.print("Deseja retornar ao menu? (Sim/Nao): ");
            opcaoSim = scn.nextLine();
            if (opcaoSim.equals("Sim")) {
                return;
            }
        }
    }

        String cadastro = Cadastro.cadastrarAnimal();
        String cancelarCadastro = Cadastro.cancelarCadastro();
    }
}
