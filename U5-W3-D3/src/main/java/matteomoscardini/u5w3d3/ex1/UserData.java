package matteomoscardini.u5w3d3.ex1;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserData implements DataSource {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource dataSource) {
        nomeCompleto = dataSource.getNomeCompleto();
        eta = dataSource.getEta();
    }
}
