package KlajdiNdoci.U5W3D3.exercise3.entities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UfficialiRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Capitano capitano=new Capitano();
        Maggiore maggiore=new Maggiore();
        Tenente tenente=new Tenente();
        Colonnello colonnello=new Colonnello();
        Generale generale=new Generale();
        capitano.setNext(maggiore);
        maggiore.setNext(tenente);
        tenente.setNext(colonnello);
        colonnello.setNext(generale);

        capitano.doCheck(4100);
    }
}
