public class Aprovacao {
    public static void main(String[] args) {
        double media = 4.3;
        String mensagemMedia = "O estudante teve média ";

        if (media >= 7.0) {
            System.out.println(mensagemMedia + media + " e foi aprovado.");
        } else if (media >= 5.0 /* && media <= 6.9 */) {
            System.out.println(mensagemMedia + media + " e está de recuperação.");
        } else {
            System.out.println(mensagemMedia + media + " e foi reprovado.");
        }
    }
}
