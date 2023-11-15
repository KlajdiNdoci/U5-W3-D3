package KlajdiNdoci.U5W3D3.exercise3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Colonnello extends Ufficiale{
    private double stipendio = 4000;
    @Override
    public void doCheck(double stipendio) {
        if(this.getStipendio()>=stipendio){
            System.out.println("Un colonnello percepisce almeno " + stipendio + "€");
        }
        this.goNext(stipendio);

    }
}
