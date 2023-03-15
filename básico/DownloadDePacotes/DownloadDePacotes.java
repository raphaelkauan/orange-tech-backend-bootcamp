package básico.DownloadDePacotes;
/*
 * Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
 * - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
 * - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   
 */

import java.util.Scanner;

public class DownloadDePacotes {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Insira um tamanho: ");
    int tamanho = leitor.nextInt();

    /*
     * TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro
     * irá juntar nos meses da entrada
     */

    for (int i = 0; i < tamanho; i++) {
      System.out.print("/");
    }

  }
}