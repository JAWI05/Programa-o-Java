// Julia Ayumi Watanabe Ra 42817
//Gustavo Valera Bezerra RA 42808
import java.util.Scanner;
public class Numsecreto {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        int tentativas = 0;

        while(num != 15){
            System.out.println("Digite um numero de 1 a 20");
            num = in.nextInt();
            tentativas = tentativas + 1;
            switch(num){
                case 1:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 2:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 3:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 4:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 5:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 6:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 7:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 8:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 9:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 10:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 11:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 12:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 13:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 14:
                    System.out.println("Errou, o número é menor que o numero secreto");
                    break;
                case 15:
                    System.out.println("Você acertou o numero secreto");
                    break;
                case 16:
                    System.out.println("Errou, o número é maior que o numero secreto");
                    break;
                case 17:
                    System.out.println("Errou, o número é maior que o numero secreto");
                    break;
                case 18:
                    System.out.println("Errou, o número é maior que o numero secreto");
                    break;
                case 19:
                    System.out.println("Errou, o número é maior que o numero secreto");
                    break;
                case 20:
                    System.out.println("Errou, o número é maior que o numero secreto");
                    break;
                default:
                    System.out.println("Numero desconhecido (não está entre 1 e 20");
                    break;
            }

        }

        if(tentativas <= 5){
            System.out.println("Que sorte, você acertou rápido");
            System.out.println("Você acertou com "+tentativas+" tentativas");
        }
        if(tentativas >= 6 && tentativas <= 15){
            System.out.println("Você está na média de acertos");
            System.out.println("Você acertou com "+tentativas+" tentativas");
        }
        if(tentativas > 15 && tentativas <= 20){
            System.out.println("Seu azarado, não conseguiu descobrir logo o numero secreto");
            System.out.println("Você acertou com "+tentativas+" tentativas");
        }

    }
}
