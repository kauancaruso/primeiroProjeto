import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliacao para o filme (0 - 10)");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliacoes: " + mediaAvaliacao / 3);
    }
}
