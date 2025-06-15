import java.util.Scanner;

public class VerificacaoAcessoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigoAcesso = "2023";

        System.out.print("Digite o código de acesso: ");
        String codigoAcessoUsuario = scanner.nextLine();

        System.out.print("Digite o nível de permissão: ");
        String nivelPermissao = scanner.nextLine();

        boolean codigoAcessoValido = codigoAcesso.equals(codigoAcessoUsuario);
        boolean nivelPermissaoValido = nivelPermissao.equals("1")
                || nivelPermissao.equals("2") || nivelPermissao.equals("3");

        if (codigoAcessoValido && nivelPermissaoValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.print("Acesso negado. ");
            if (!codigoAcessoValido && !nivelPermissaoValido) {
                System.out.println("Código de acesso e nível de permissão inválidos.");
            } else {
                if (!codigoAcessoValido) {
                    System.out.println("Código de acesso inválido.");
                }
                if (!nivelPermissaoValido) {
                    System.out.println("Nível de permissão inválido.");
                }
            }
        }
    }
}
