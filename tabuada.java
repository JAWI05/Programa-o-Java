import java.util.Scanner;
public class tabuada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cont;
        int tabuada;

        System.out.println("Digite o número da tabuada que você quer calcular");
        tabuada = entrada.nextInt();

        for(cont = 1; cont <= 10; cont++){
            System.out.print("A tabuada de "+tabuada);
            System.out.println(" é "+(tabuada*cont));
        }
    }
}
