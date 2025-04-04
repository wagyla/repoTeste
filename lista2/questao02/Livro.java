package lista2.questao02;

public class Livro {

    String titulo;
    int anoPublicacao;
    String autor;
    String editora;

    void etiqueta(){
        System.out.printf("\nTitulo: %s",this.titulo);
        System.out.printf("\nPublicação: %s",this.anoPublicacao);
        System.out.printf("\nAutor: %s",this.autor);
        System.out.printf("\nEditora: %s",this.editora);
    }

}
