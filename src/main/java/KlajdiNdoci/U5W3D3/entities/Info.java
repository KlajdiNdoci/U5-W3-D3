package KlajdiNdoci.U5W3D3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

}
