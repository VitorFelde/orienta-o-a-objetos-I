import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade {
/*Crie um programa java que:

-Considerando um vetor "vetA" com 4 posições do tipo int, solicite ao usuário um valor ser armazenado em cada posição.

-Considerando um vetor "vetB" com 4 posições do tipo String, solicite ao usuário um valor ser armazenado em cada posição.

-Imprima na tela o conteúdo armazenado em cada posição do vetor "vetB", repetindo-o a quantidade de vezes 

expressa na mesma posição do vetor "vetA".

Ex: Se vetA[0] tiver o valor 4 e vetB[0] tiver a palavra "java", escreve "java" 4 vezes na tela*/
    
public static void main(String[] args) throws Exception {

BufferedReader reader = new BufferedReader(
    new InputStreamReader(System.in));
    
    int tamanhoVetor = 4;
    int vetA[] = new int[tamanhoVetor];
    String vetB[] = new String[tamanhoVetor];

    System.out.println("Digite quatro valores para o vetA: ");
    for (int i = 0; i < tamanhoVetor; i++) {
        vetA[i] = Integer.parseInt(reader.readLine());
    }
    
    System.out.println("Digite quatro nomes para o vetB: ");
    for (int i = 0; i < tamanhoVetor; i++) {
        vetB[i] = reader.readLine();
    }
}

}
