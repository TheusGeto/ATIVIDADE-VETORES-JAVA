import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicia o vetor
        int[] vetor = new int[20];
        
        // Para  ler 
        Scanner scanner = new Scanner(System.in);
        
        // adiciona os valores
        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // Somando os 10 primeiros valores do vetor
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i]; // Adiciona o valor do vetor[i] à soma
        }
        
        // Exibindo o resultado
        System.out.println("A soma dos 10 primeiros elementos é: " + soma);
    }
}
