package lista2.questao03;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
    
        livro1.titulo= "Até o verão terminar";
        livro1.anoPublicacao= 2021;
        livro1.autor= new Autor ();
        livro1.autor.nome= "Collen Hoover";
        livro1.autor.dataNascimento= "11 de dezembro de 1979";
        livro1.editora= new Editora();
        livro1.editora.nome= "Galera Record";
        livro1.editora.cnpj= "44.276.105/0001-43";
        livro1.editora.endereco= "Rua Argentina, 120, São Cristóvão, Rio de Janeiro, RJ, 20.921-380";

        livro1.etiqueta();

    }
    
}
