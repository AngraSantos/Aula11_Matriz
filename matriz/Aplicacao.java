package matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Aplicacao {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdAlunos = input.nextInt();

        System.out.print("Quantas notas? ");
        int qtdNotas = input.nextInt();

        //Criando uma matriz com 2 dimensões
        double[][] notasTurma = new double [qtdAlunos][qtdNotas];
        double total = 0;

        for(int a = 0; a < notasTurma.length; a++){
                for(int n = 0; n < notasTurma[a].length; n++){
                    
                    System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
                    notasTurma[a][n] = input.nextDouble();
                    total += notasTurma[a][n];
                }
        }
        
        for(double[] notasAluno : notasTurma){
            System.out.println(Arrays.toString(notasAluno));
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é: " + media);

        input.close();
    }
}
