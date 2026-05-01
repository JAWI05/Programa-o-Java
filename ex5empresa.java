import java.util.Scanner;
public class ex5empresa {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int idade;
        int pessoas = 1;
        int menorid = 100000;
        int idadeMu;
        int idadeM = 0;
        int senhor = 0;
        char sexo;
        int fem = 0;
        int femexp = 0;
        int masc = 0;
        char experiencia;

        while(true){
            System.out.println("Digite a sua idade ");
            idade = in.nextInt();
            System.out.println("Digite o seu sexo (m)asculino ou (f)eminino ");
            sexo = in.next().charAt(0);
            System.out.println("Você tem experiência (s)im ou (n)ão");
            experiencia = in.next().charAt(0);
            if(idade <= 0){
                break;
            }
            if(sexo == 'f'){
                fem++;
                if(idade < 21 && experiencia == 's'){
                    femexp++;
                    idade = idade < menorid;
                    System.out.println("o numero menor é"+idade);
                }
            }
            if(sexo == 'm'){
                masc++;
                if(experiencia == 's'){
                    idadeM = idadeM + idade;
                }
                if(idade > 45){
                    senhor++;
                }
            }
            pessoas++;
        }
        System.out.println("numero de pessoas do sexo feminino "+fem);
        System.out.println("numero de pessoas do sexo masculino "+masc);
        System.out.println("idade media de pessoas do sexo masculino com experiencia"+pessoas);
    }
}
