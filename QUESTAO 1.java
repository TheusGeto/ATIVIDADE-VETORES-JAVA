import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializa o vetor de 20 elementos
        int[] vetor = new int[20];
        int contadorImpares = 0;
        
        // Scanner para leitura dos valores
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos 20 elementos e preenchimento do vetor
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Mostra os elementos do vetor
        System.out.println("Valores inseridos no vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        // Conta quantos números ímpares existem no vetor
        for (int i = 0; i < 20; i++) {
            if (vetor[i] % 2 != 0) {
                contadorImpares++;
            }
        }
        
        // Exibe o número de valores ímpares
        System.out.println("Quantidade de valores ímpares: " + contadorImpares);
        
        scanner.close();
    }
}