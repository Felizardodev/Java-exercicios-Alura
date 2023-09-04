import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Your Name");

        int anoDeLancamento = 2017;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.5;
        //Média calculadas pelas 3 notas da Suelen, Gustavo e Ricardo
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                    Filme: Your Name
                    Animação sobre o romance entre 2 adolescente em tempos diferentes
                    Muito bom!
                    Ano de lançamento:
                  """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}