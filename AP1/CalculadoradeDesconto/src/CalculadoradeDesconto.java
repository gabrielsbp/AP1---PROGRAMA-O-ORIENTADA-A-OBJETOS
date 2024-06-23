import java.util.Scanner;

public class CalculadoradeDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a % de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (percentualDesconto / 100);
        double valorFinal = valorProduto - valorDesconto;

        System.out.println("Desconto: " + valorDesconto);
        System.out.println("Preço do produto com desconto: " + valorFinal);

        scanner.close();
    }
}