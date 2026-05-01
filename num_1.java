import java.util.Scanner;
public class num_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cont = 0;
        int num;
        System.out.println("Digite o número");
        num = in.nextInt();
        while(cont < num){
            cont++;
            System.out.println(cont);
        }
    }
}
