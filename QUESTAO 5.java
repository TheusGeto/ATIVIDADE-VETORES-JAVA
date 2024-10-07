import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicial o vetor
        int[] vetor = new int[10];
        
        // le os numeros
        Scanner scanner = new Scanner(System.in);
        
        // Le os numeros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Transforma a ordem em decrecente
        Arrays.sort(vetor);
        
        // Exibindo numeros
        System.out.println(" numeros em ordem decrescente:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        
    }
}
