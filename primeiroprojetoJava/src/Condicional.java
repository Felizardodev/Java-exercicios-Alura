public class Condicional {
    public static void main(String[] args){
        int anoDeLancamento = 2017;
        boolean incluiNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2017){
            System.out.println("Lançamento que os clientes estão curtinho!");
        } else {
            System.out.println("Filme que vale a pena assistir!");
        }

        if (incluiNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Mude seu plano");
        }
    }
}
