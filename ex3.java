import java.util.Scanner;
public class ex3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char resposta;
        resposta = 's';
        int idade;
        int contIdade = 0;
        int todos = 0;
        int pessoa = 0;
        int entre = 0;
        int maior = 0;
        double altura;
        double peso;

        while(resposta == 's'){
            System.out.println("Digite a sua idade");
            idade = in.nextInt();
            contIdade = contIdade + idade;
            System.out.println("Digite a sua altura");
            altura = in.nextDouble();
            System.out.println("Digite o seu peso");
            peso = in.nextDouble();
            todos++;
            if(peso > 90 && altura < 1.5){
                pessoa++;
            }
            if (altura > 1.9) {
                maior++;
                if (idade >= 10 && idade <= 30) {
                    entre++;
                }
            }

            System.out.println("Quer continuar (s)im ou (n)ão");
            resposta = in.next().charAt(0);
        }
        System.out.println("A média das idades de todos é "+(contIdade/todos));
        System.out.println("A quantidade de pessoas com peso superior a 90 e altura menor que 1,50 é "+pessoa);
        System.out.println("A porcentagem de pessoas entre 10 e 30 anos sobre as pessoas que tem mais de 1,90 m é "+(entre/maior)*100);
    }
}
