import java.util.Scanner;
public class salarioex2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double salario1 = 1000.00;
        double salarioAtual;
        double percentual;
        int anotrab;

        while(true){
            System.out.println("Digite há quantos anos você trabalha na empresa");
            anotrab = in.nextInt();
            if(anotrab < 0){
                break;
            }
            salarioAtual = salario1;
            percentual = 1.5;
            if(anotrab == 0){
                System.out.println("O salário atual é "+salarioAtual);
            }
            else if(anotrab <= 2){
                percentual = percentual * anotrab;
                salarioAtual = salario1 * percentual;
                System.out.println("O percentual do salario atual é "+percentual);
                System.out.println("O salário atual é "+salarioAtual);
            }
            else{
                percentual = percentual * Math.pow(2, (anotrab-1));
                salarioAtual = salario1 * percentual;
                System.out.println("O percentual do salario atual é "+percentual);
                System.out.println("O salário atual é "+salarioAtual);
            }
        }
    }
}
