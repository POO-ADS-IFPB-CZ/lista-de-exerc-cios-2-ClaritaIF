import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN_BOLD = "\u001B[1;36m";
    public static final String ANSI_YELLOW_BOLD = "\u001B[1;33m";
    public static final String ANSI_GREEN_BOLD = "\u001B[1;32m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para sacar: R$ ");
                    float saque = scanner.nextFloat();
                    conta.sacar(saque);
                    break;

                case 2:
                    System.out.print("Digite o valor para depositar: R$ ");
                    float deposito = scanner.nextFloat();
                    conta.depositar(deposito);
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.consultarSaldo());
                    break;

                case 4:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║        " + ANSI_CYAN_BOLD + "MENU DA CONTA CORRENTE" + ANSI_RESET + "          ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║  " + ANSI_YELLOW_BOLD + "[1]" + ANSI_RESET + "  Sacar                            ║");
        System.out.println("║  " + ANSI_YELLOW_BOLD + "[2]" + ANSI_RESET + "  Depositar                        ║");
        System.out.println("║  " + ANSI_YELLOW_BOLD + "[3]" + ANSI_RESET + "  Consultar saldo                  ║");
        System.out.println("║  " + ANSI_YELLOW_BOLD + "[4]" + ANSI_RESET + "  Sair                             ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print(ANSI_GREEN_BOLD + "Digite o número da opção desejada: " + ANSI_RESET);
    }
}
//