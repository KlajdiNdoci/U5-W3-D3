package KlajdiNdoci.U5W3D3.exercise2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Autore {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
}
