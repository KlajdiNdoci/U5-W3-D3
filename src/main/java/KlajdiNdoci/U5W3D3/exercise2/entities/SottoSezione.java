package KlajdiNdoci.U5W3D3.exercise2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class SottoSezione implements ComponenteLibro {
    private int numeroSottoSezione;
    private List<Pagina> pagine;

    @Override
    public int getNumeroDiPagine() {
        int total = 0;
        for (Pagina pagina: pagine) {
            total += pagina.getNumeroDiPagine();
        }
        return total;
    }

    @Override
    public void print() {
        System.out.println("Pagine:");
        for (Pagina pagina: pagine) {
            pagina.print();
        }
    }
}
