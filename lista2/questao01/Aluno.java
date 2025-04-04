package lista2.questao01;

public class Aluno {
    String nome;
    int matricula;
    double notaProva1;
    double notaProva2;
    double notaProva3;
    double trabalho;

    void calcularMedia(){
        double media = (this.notaProva1*2 +this.notaProva2* 2+this.notaProva3* 2+
        this.trabalho*1.5)/7.5;
        System.out.println("\nA media do aluno é "+media);
    }
    void imprimirDetalhes(){
        System.out.printf("Nome: %s", this.nome);
        System.out.printf("\nMatricula: %s", this.matricula);
        System.out.printf("\nNota da prova 1: \n%s", this.notaProva1);
        System.out.printf("\nNota da prova 2: \n%s", this.notaProva2);
        System.out.printf("\nNota da prova 3: \n%s", this.notaProva3);
        System.out.printf("\nNota do trabalho: \n%s", this.trabalho);
    }
}
