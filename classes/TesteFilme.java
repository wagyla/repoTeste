package classes;
public class TesteFilme {
    public static void main (String[] args){
        Filme filme = new Filme();

        filme.anoLancamento = 2018;
        filme.titulo = "Para todos os garotos que eu ja amei";
        filme.classificacaoIndicativa = 12;
        filme.genero = "Romance";
        filme.tempDuracao = "2 horas";

        System.out.println ("Título: "+filme.titulo+
        "\nAno de lançamento: "+filme.anoLancamento+
        "\nGênero: "+filme.genero+
        "\nAno de lançamento: "+filme.anoLancamento+
        "\nTempo de duração: " +filme.tempDuracao );
    }
    
}
