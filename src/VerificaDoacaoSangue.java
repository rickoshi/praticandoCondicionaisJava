import java.util.Scanner;

public class VerificaDoacaoSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        if (idade >= 18 && idade <= 65 && peso > 50) {
            System.out.println("O doador é compatível.");
        } else {
            if (idade < 18 || idade > 65) {
                System.out.println("O doador não é compatível.  \n" +
                        "Motivo: Deve ter entre 18 e 65 anos.");
            }
            if (peso < 50) {
                System.out.println("O doador não é compatível.  \n" +
                        "Motivo: Deve pesar mais de 50 kg. ");
            }
        }
        scanner.close();
    }
}
