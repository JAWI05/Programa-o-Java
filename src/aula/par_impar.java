import java.util.Scanner;
public class par_impar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cont;
        int par = 0;
        int impar = 0;
        int num;

        for(cont = 1; cont <= 5; cont++){
            System.out.println("Digite o numero");
            num = in.nextInt();


         if(num % 2 == 0){
             par++;
         }
         else{
             impar++;
         }
        }
        System.out.println(par);
        System.out.println(impar);
    }
}
