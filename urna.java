import java.util.Scanner;
public class urna {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cand;
        int votoa = 0;
        int votob = 0;
        int votoc = 0;
        int votod = 0;
        int br = 0;
        int nulo = 0;
        int total = 0;


        for(int i = 1; i <= 10; i++){
            System.out.println("Escolha seu voto (1, 2, 3, 4, 5, 6)");
            cand = in.nextInt();
            switch(cand){
                case 1:
                    votoa++;
                    System.out.println("Candidato A");
                    break;
                case 2:
                    votob++;
                    System.out.println("Candidato B");
                    break;
                case 3:
                    votoc++;
                    System.out.println("Candidato C");
                    break;
                case 4:
                    votod++;
                    System.out.println("Candidato D");
                    break;
                case 5:
                    br++;
                    System.out.println("Nulo");
                    break;
                case 6:
                    nulo++;
                    System.out.println("Branco");
                    break;
                default:
                    System.out.println("Voto inválido");
                    break;
            }
            total++;
        }
        System.out.println("O número de votos do candidato A é "+votoa);
        System.out.println("O número de votos do candidato B é "+votob);
        System.out.println("O número de votos do candidato C é "+votoc);
        System.out.println("O número de votos do candidato D é "+votod);
        System.out.println("O número de votos brancos é "+br);
        System.out.println("O número de votos numlos é "+nulo);
        System.out.println("Todos os votos"+total);

    }
}
