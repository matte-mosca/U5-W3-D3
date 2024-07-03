package matteomoscardini.u5w3d3.ex2;

import java.util.List;

public class Libro implements Lunghezza{
    private String nome;
    private List<Sezione> sezioni;
    private List<Autore> autori;
    private double prezzo;

    @Override
    public int howManyPages (){
        int totalPages = 0;
        for (Sezione sezione : sezioni) {
            totalPages += sezione.howManyPages();
        }
        return totalPages;
    }

}
