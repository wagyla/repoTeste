package lista2.questao02;

public class Principal {
    public static void main(String[] args) {
        Livro coho = new Livro();
       
        coho.titulo= "Até o verão terminar";
        coho.anoPublicacao = 2021;
        coho.editora= "Galera";
        coho.autor= "Colleen Hoover";

        coho.etiqueta();
    }
    
}
