package KlajdiNdoci.U5W3D3.adapters;

import KlajdiNdoci.U5W3D3.entities.DataSource;
import KlajdiNdoci.U5W3D3.entities.Info;
import KlajdiNdoci.U5W3D3.entities.UserData;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter extends UserData {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        String nomeCompleto;
        nomeCompleto = info.getNome() + " " + info.getCognome();
        return nomeCompleto;
    }

    @Override
    public int getEtá() {
        LocalDate curDate = LocalDate.now();
        LocalDate dob = info.getDataDiNascita();
        if (dob != null)
        {
            return Period.between(dob, curDate).getYears();
        }
        else
        {
            return 0;
        }
    }
}
