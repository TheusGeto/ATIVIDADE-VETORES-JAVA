import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicia a lista
        int[] vetor = new int[10];
        
        // Variáveis
        int A, B, C;
        
        // Contadores para A, B e C no vetor
        int contA = 0, contB = 0, contC = 0;
        
        // Scanner para ler
        Scanner scanner = new Scanner(System.in);
        
        // Le os elementos do vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Leitura dos valores A, B e C
        System.out.println("Digite os valores para A, B e C:");
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        
        // Verificando quantas vezes A, B e C aparecem no vetor
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == A) {
                contA++;
            }
            if (vetor[i] == B) {
                contB++;
            }
            if (vetor[i] == C) {
                contC++;
            }
        }
        
        // Exibindo dados
        System.out.println("O valor A (" + A + ") aparece " + contA + " vezes no vetor.");
        System.out.println("O valor B (" + B + ") aparece " + contB + " vezes no vetor.");
        System.out.println("O valor C (" + C + ") aparece " + contC + " vezes no vetor.");
    }
}
