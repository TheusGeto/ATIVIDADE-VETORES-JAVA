import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicia os vetores
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorResultado = new int[5];
        
        // Leitor
        Scanner scanner = new Scanner(System.in);
        
        // Le os elementos do primeiro vetor
        System.out.println("Digite 5 números  para primeira lista :");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = scanner.nextInt();
        }
        
        // Le os elementos do segundo vetor
        System.out.println("Digite 5 números para segunda lista:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }
        
        // Multiplica os elementos de mesmo índice e armazena no vetorResultado
        for (int i = 0; i < 5; i++) {
            vetorResultado[i] = vetor1[i] * vetor2[i];
        }
        
        // Mostrando a lista dos resultados
        System.out.println("Lista da multiplicação:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorResultado[i] + " ");
        }
    }
}

}
