import java.util.Scanner;
public class ex5w {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int idade;
        double altura;
        double todosalt = 0;
        char resp;
        int todes = 0;
        resp = 's';

        while(resp == 's'){
            System.out.println("Digite a sua idade ");
            idade = in.nextInt();
            System.out.println("Digite a sua altura");
            altura = in.nextDouble();
            todosalt = todosalt + altura;
            todes++;

            if(idade > 50){
                System.out.println("A media das alturas é "+(todosalt/todes));
            }
            System.out.println("deseja continuar (s)im ou (n)ao");
            resp = in.next().charAt(0);
        }
    }
}