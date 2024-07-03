package matteomoscardini.u5w3d3.ex1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    private int howManyYears(Date dataDiNascita) {
        LocalDate birthday = dataDiNascita.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return period.getYears();

        }
        @Override
                public String getNomeCompleto(){
            return info.getNome()+ " " + info.getCognome();
    }
    @Override
    public int getEta() {
        int eta = howManyYears(info.getDataDiNascita());
        return eta;
    }
}
