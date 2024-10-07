import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        // Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Ler elementos do vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Invertendo a exibiçao
        for (int i = 0; i < 5; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[9 - i];
            vetor[9 - i] = temp;
        }
        
        // Exibindo o a lista invertida
        System.out.println("numeros na ordem inversa:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scanner.close();
    }
}
