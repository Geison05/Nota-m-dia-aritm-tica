import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    //variável
    float nota1 = 0;
    float nota2 = 0;
    float nota3 = 0;
    float media = 0; 
    //Entrada de dados 
    System.out.println("Digite a primeira nota :");
    nota1 = leitor.nextFloat();
    System.out.println("Digite a segunda nota :");
    nota2 = leitor.nextFloat();
    System.out.println("Digite a terceira nota :");
    nota3 = leitor.nextFloat(); 
    //Processamento
    media = (nota1 + nota2 + nota3)/3;
    //saida
    System.out.println("\nMédia aritmética das notas é :" + media);
     
    }
}