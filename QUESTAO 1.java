import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicia o vetor
        int[] vetor = new int[20];
        int contadorImpares = 0;
        
        // Scanner que le os numeros
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos 20 numeros e coloca no vetor
        System.out.println("Digite 20 números :");
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Mostra o conteudo do vetor
        System.out.println("Valores inseridos no vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        // Conta quantos números ímpares estao no vetor
        for (int i = 0; i < 20; i++) {
            if (vetor[i] % 2 != 0) {
                contadorImpares++;
            }
        }
        
        // Exibe a quantidade de ímpares
        System.out.println("Quantidade de valores ímpares: " + contadorImpares);
        
    }
}
