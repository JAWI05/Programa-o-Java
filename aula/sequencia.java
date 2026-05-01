import java.util.Scanner;
public class sequencia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int cont;
        int numM = -1000000;
        int menor = 1000000;


        for(cont = 1; cont <= 5; cont++){
            System.out.println("Digite 10 números");
            numero = entrada.nextInt();
            if(numero > numM){
                numM = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        System.out.println("O numero maior é "+numM);
        System.out.println("O numero menor é "+menor);
    }
}

