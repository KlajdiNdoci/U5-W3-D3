package KlajdiNdoci.U5W3D3.exercise2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Libro implements ComponenteLibro{
    private String titolo;
    private List<Pagina> pagine;
    private List<Sezione> sezioni;
    private List<Autore> autori;
    private double prezzo;

    @Override
    public int getNumeroDiPagine() {
        int total = 0;
        for (Pagina pagina: pagine) {
            total += pagina.getNumeroDiPagine();
        }
        for (Sezione sezione: sezioni) {
            total += sezione.getNumeroDiPagine();
        }
        return total;
    }

    @Override
    public void print() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autore/i: " + autori);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Pagine totali: " + getNumeroDiPagine());

        System.out.println("Pagine:");
        for (Pagina pagina : pagine) {
            pagina.print();
        }

        System.out.println("Sezioni:");
        for (Sezione sezione : sezioni) {
            sezione.print();
        }
    }
}
