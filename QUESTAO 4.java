import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicia o vetor
        int[] vetor = new int[10];
        
        // scanner
        Scanner scanner = new Scanner(System.in);
        
        // le os 10 numeros
        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Faz exibir em ordem crescente
        Arrays.sort(vetor);
        
        // Exibindo em ordem crescente
        System.out.println("lista em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        
    }
}
