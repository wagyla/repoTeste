package lista2.questao03;

public class Livro {
    String titulo;
    int anoPublicacao;
    Autor autor;
    Editora editora;

    void etiqueta(){

        System.out.printf("\nTitulo: %s",this.titulo);
        System.out.printf("\nAno de publicação: %s",this.anoPublicacao);
        System.out.printf("\nNome do autor: %s",this.autor.nome);
        System.out.printf("\nData de nascimento do autor: %s",this.autor.dataNascimento);
        System.out.printf("\nNome da editora: %s",this.editora.nome);
        System.out.printf("\nCNPJ da editora: %s",this.editora.cnpj);
        System.out.printf("\nEndereco da editora: %s",this.editora.endereco);

    }
}


