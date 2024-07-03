package matteomoscardini.u5w3d3.ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Pagina implements Lunghezza{

    @Override
    public int howManyPages() {
        return 1;
    }

}
