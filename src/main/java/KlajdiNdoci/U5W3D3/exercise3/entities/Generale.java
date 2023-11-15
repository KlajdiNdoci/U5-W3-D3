package KlajdiNdoci.U5W3D3.exercise3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Generale extends Ufficiale{
    private double stipendio = 5000;
    @Override
    public void doCheck(double stipendio) {
        if(this.getStipendio()>=stipendio){
            System.out.println("Un Generale percepisce almeno " + stipendio + "€");
        }
        this.goNext(stipendio);

    }
}
