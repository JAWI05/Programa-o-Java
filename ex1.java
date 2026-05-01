import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int idade;
        double altura;
        double contAlt = 0;
        double mediaAlt;
        int pessoas = 0;

        while(true){
            System.out.println("Digite a sua idade");
            idade = in.nextInt();
            if(idade <= 0){
                break;
            }
            System.out.println("Digite a sua altura");
            altura = in.nextDouble();

            if(idade > 50){
                contAlt = contAlt + altura;
                pessoas++;
            }
        }
        mediaAlt = contAlt/pessoas;
        System.out.println("A média das alturas de pessoas com mais de 50 é "+mediaAlt);
    }
}
