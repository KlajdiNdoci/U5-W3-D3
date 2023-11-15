package KlajdiNdoci.U5W3D3.exercise3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Capitano extends Ufficiale{
    private double stipendio = 1000;
    @Override
    public void doCheck(double stipendio) {
        if(this.getStipendio() >= stipendio){
            System.out.println("Un capitano percepisce almeno " + stipendio + "€");
        }
        this.goNext(stipendio);

    }
}
