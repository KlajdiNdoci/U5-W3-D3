package KlajdiNdoci.U5W3D3.exercise2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pagina implements ComponenteLibro {
    private String contenuto;
    private int numeroPagina;

    @Override
    public int getNumeroDiPagine() {
        return 1;
    }

    @Override
    public void print() {

    }
}
