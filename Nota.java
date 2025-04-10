import java.util.Scanner;


public class Nota{
     public static void main(String args[]){
        Scanner nota = new Scanner(System.in);
        String notaDoAluno = nota.nextLine();
         Double nota1, nota2, nota3;
        Double media;
       
        System.out.println("Digite a primeira nota: ");
        nota1 = nota.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = nota.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = nota.nextDouble();
       
        media = (nota1 + nota2 + nota3) / 3;
      
      if (media >= 6.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        nota.close();
    }
}