import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("\nEscolha uma opcao:");
    System.out.println("\n[1] Caso nao tenha conta e deseja salva-la");
    System.out.println("[2] Caso tenha conta e deseja carrega-la\n");
    int Opc = scanner.nextInt();
    scanner.nextLine();

    if (Opc == 1) {

    System.out.println("\nDigite seu nome: ");
    String Nome = scanner.nextLine();

    System.out.println("Digite sua idade: ");
    int Idade = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite seu saldo: ");
    double SaldoConta = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Digite o numero da sua conta: ");
    int NumeroConta = scanner.nextInt();
    scanner.nextLine();

    System.out.println("\n");

    Conta conta = new Conta(Nome, Idade, SaldoConta, NumeroConta);
    conta.SalvarNoArquivo();

    } else if (Opc == 2) {

        System.out.println("\nDigite seu nome: ");
        String Nome = scanner.nextLine();

        Conta conta = Conta.CarregarArquivo(Nome);

        

        System.out.println("\nDados da conta: \n");
        System.out.println("Nome do dono: " + Nome);
        System.out.println("Idade do dono: " + conta.getIdade());
        System.out.println("Saldo da conta: " + conta.getSaldoConta());
        System.out.println("Numero da conta: " + conta.getNumeroConta());

    
    }

        scanner.close();
    }
}