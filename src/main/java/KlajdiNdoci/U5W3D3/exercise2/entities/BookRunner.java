package KlajdiNdoci.U5W3D3.exercise2.entities;

import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Autore autore1 = new Autore("Aldo", "Baglio", LocalDate.of(1970,1,1));
        Autore autore2 = new Autore("Giovanni", "Storti",LocalDate.of(1960,12,12));

        Pagina pagina1 = new Pagina("ciao 1", 1);
        Pagina pagina2 = new Pagina("ciao 2", 2);

        SottoSezione sottoSezione1 = new SottoSezione(1, List.of(pagina1));
        SottoSezione sottoSezione2 = new SottoSezione(2, List.of(pagina2));

        Sezione sezione1 = new Sezione(1, List.of(pagina1), List.of(sottoSezione1));
        Sezione sezione2 = new Sezione(2, List.of(pagina2), List.of(sottoSezione2));

        List<Sezione> sezioni = new ArrayList<>();
        sezioni.add(sezione1);
        sezioni.add(sezione2);

        List<Pagina> pagine = new ArrayList<>();
        pagine.add(new Pagina("ciao 3", 3));

        List<Autore> autori = new ArrayList<>();
        autori.add(autore1);
        autori.add(autore2);

        Libro libro = new Libro("TitoloDelLibro", pagine, sezioni, autori, 29.99);

        libro.print();
    }
}
