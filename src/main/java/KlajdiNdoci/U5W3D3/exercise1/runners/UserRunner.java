package KlajdiNdoci.U5W3D3.exercise1.runners;

import KlajdiNdoci.U5W3D3.exercise1.adapters.InfoAdapter;
import KlajdiNdoci.U5W3D3.exercise1.entities.Info;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info("Aldo", "Baglio", LocalDate.of(1970, 1, 1));
        InfoAdapter user = new InfoAdapter(info);
        System.out.println(user.getNomeCompleto());
        System.out.println(user.getEtá());
    }
}
