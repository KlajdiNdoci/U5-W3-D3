package KlajdiNdoci.U5W3D3.exercise1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int etá;

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        etá = ds.getEtá();
    }
}
