package básico.LojinhaDeDoces;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner;

import javax.security.auth.callback.TextOutputCallback;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira uma entrada: ");
        int dinheiro = leitor.nextInt();

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces
        // vai obter de acordo com a entrada

        int totalDeDoces = dinheiro * 2;
        System.out.println("O cliente obteve " + totalDeDoces + " doces");

    }

}
