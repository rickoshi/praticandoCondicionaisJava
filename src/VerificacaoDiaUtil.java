import java.util.Scanner;

public class VerificacaoDiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String diaDaSemana = scanner.nextLine();

        if (diaDaSemana.equals("segunda") || diaDaSemana.equals("terça")
        || diaDaSemana.equals("quarta") || diaDaSemana.equals("quinta")
        || diaDaSemana.equals("sexta")) {
            System.out.println(diaDaSemana + " é um dia útil");
        } else {
            System.out.println("Não é um dia útil");
        }
        scanner.close();
    }
}
