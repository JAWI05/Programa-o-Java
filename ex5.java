import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1;
        double nota2;
        double todesM = 0;
        double media;
        int reprov = 0;
        int exame = 0;
        int aprov = 0;
        int total = 0;
        char cond = 's';

        while (cond == 's') {
            System.out.println("Digite a nota da p1");
            nota1 = in.nextDouble();
            System.out.println("Digite a nota da p2");
            nota2 = in.nextDouble();

            media = (nota1 + nota2) / 2;
            todesM = todesM + media;

            total++;

            if (media <= 3) {
                System.out.println("REPROVADO");
                reprov++;
            }
            if (media > 3 && media <= 7) {
                System.out.println("EXAME");
                exame++;
            }
            if (media > 7 && media <= 10) {
                System.out.println("APROVADO");
                aprov++;
            }

            System.out.println("Deseja continuar (s)im (n)ao");
            cond = in.next().charAt(0);
        }

        media = todesM/total;
        System.out.println("O numero de reprovações eh " + reprov);
        System.out.println("O numero de pessoas que ficaram de exames eh " + exame);
        System.out.println("O numero de aprovados eh " + aprov);
        System.out.println("A média eh "+media);
    }
}
