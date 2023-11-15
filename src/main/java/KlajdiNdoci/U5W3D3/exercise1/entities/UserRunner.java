package KlajdiNdoci.U5W3D3.exercise1.entities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info("Aldo", "Baglio", LocalDate.of(1970, 1, 1));
        InfoAdapter userInfo = new InfoAdapter(info);
        UserData userData = new UserData();
        userData.getData(userInfo);
        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEtá());
    }
}
