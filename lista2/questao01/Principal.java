package lista2.questao01;

public class Principal {
    public static void main(String[] args) {
        Aluno wagyla = new Aluno();
        Aluno leo = new Aluno();

        wagyla.nome= "Wagyla da Silva Matos"; 
        wagyla.matricula= 1010;
        wagyla.notaProva1= 8;
        wagyla.notaProva2= 6;
        wagyla.notaProva3= 7;
        wagyla.trabalho= 4;

        leo.nome= "Leonardo Pinheiro";
        leo.matricula= 1002;
        leo.notaProva1= 10;
        leo.notaProva2= 8;
        leo.notaProva3= 6;
        leo.trabalho= 5;

        wagyla.calcularMedia();
        wagyla.imprimirDetalhes();

        leo.calcularMedia();
        leo.imprimirDetalhes();
    }
      
}
