import java.util.Scanner;
public class ex8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double peso;
        double altura;
        double imc;
        int cont;
        int pessoas = 0;
        for(cont = 1; cont <= 20; cont++){
            System.out.println("Digite o peso");
            peso = in.nextDouble();
            System.out.println("Digite a altura");
            altura = in.nextDouble();
            imc = peso/(altura*altura);
            if(imc >= 18.5 && imc <= 24.9){
                pessoas++;
            }
        }
        System.out.println("O numero de pessoas sem obesidade é "+pessoas);
    }
}
