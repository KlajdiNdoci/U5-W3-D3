package KlajdiNdoci.U5W3D3.exercise2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Sezione {
    private List<Pagina> pagine;
    private List<Sezione> sottoSezioni;
}
