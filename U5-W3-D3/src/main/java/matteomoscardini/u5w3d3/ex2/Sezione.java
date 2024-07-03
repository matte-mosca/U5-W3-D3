package matteomoscardini.u5w3d3.ex2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Sezione implements Lunghezza{

    private List<Lunghezza> sottoSezioni;

    public Sezione(List<Pagina> listaPagine) {
        this.sottoSezioni = new ArrayList<>(listaPagine);
    }

    @Override
    public int howManyPages() {
        int risultato = 0;
        for (Lunghezza lunghezza : sottoSezioni){
            risultato += lunghezza.howManyPages();
        }
        return risultato;
    }
}
