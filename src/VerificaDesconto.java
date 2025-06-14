import java.util.Scanner;

public class VerificaDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100) {
            valorCompra -= (valorCompra * 0.10);
            System.out.println("Desconto de 10% aplicado.");
            System.out.printf("Novo valor: R$ %.2f", valorCompra);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor total: R$ %.2f", valorCompra);
        }
        scanner.close();
    }
}
