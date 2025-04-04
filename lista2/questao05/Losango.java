package lista2.questao05;

public class Losango {
    double diagonalMaior;
    double diagonalMenor;
    String cor;

    double area(){
        return (diagonalMaior* diagonalMenor)/2;
    }
    void imprimirDetalhesLosango(){
        System.out.printf("A área do Losango é: ", this.area());
    }
}
