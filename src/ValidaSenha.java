import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        String senha = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");

        if (senha.equals(scanner.nextLine())) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
        scanner.close();
    }
}
