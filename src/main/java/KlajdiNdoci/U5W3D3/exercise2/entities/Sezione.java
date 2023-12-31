package KlajdiNdoci.U5W3D3.exercise2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Sezione implements ComponenteLibro{
    private int numeroSezione;
    private List<Pagina> pagine;
    private List<SottoSezione> sottoSezioni;

    @Override
    public int getNumeroDiPagine() {
        int total = 0;
        for (Pagina pagina: pagine) {
            total += pagina.getNumeroDiPagine();
        }
        for (SottoSezione sottoSezione: sottoSezioni) {
            total += sottoSezione.getNumeroDiPagine();
        }
        return total;
    }

    @Override
    public void print() {
        System.out.println("Sezione numero " + numeroSezione);
        System.out.println("Pagine:");
        for (Pagina pagina: pagine) {
            pagina.print();
        }
        System.out.println("Sotto-sezioni:");
        for (SottoSezione sottoSezione: sottoSezioni) {
            sottoSezione.print();
        }

    }
}
