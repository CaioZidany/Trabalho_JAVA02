import java.util.Scanner;

public class FichaVendaVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ficha do Cliente ===");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();

        System.out.println("\n=== Ficha de Venda de Veículo ===");
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o ano de fabricação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite a cor do veículo: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o preço do veículo (em R$): ");
        double preco = scanner.nextDouble();

        System.out.println("\n=== Ficha Completa ===");
        System.out.println("=== Dados do Cliente ===");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("CPF: " + cpfCliente);
        System.out.println("Telefone: " + telefoneCliente);

        System.out.println("\n=== Dados do Veículo ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Cor: " + cor);
        System.out.printf("Preço: R$ %.2f%n", preco);

        scanner.close();
    }
}