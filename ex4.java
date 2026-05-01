import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        double quad;
        double cubo;
        double raiz;

        while(true){
            System.out.println("Digite o numero");
            num = in.nextInt();
            if(num <= 0){
                System.out.println("Valor inválido");
                break;
            }
            if(num >= 1){
                quad = Math.pow(num, 2);
                System.out.println("O quadrado do número é "+quad);
                cubo = Math.pow(num, 3);
                System.out.println("O cubo do número é "+cubo);
                raiz = Math.sqrt(num);
                System.out.println("A raiz do número é "+raiz);
            }
        }
    }
}
