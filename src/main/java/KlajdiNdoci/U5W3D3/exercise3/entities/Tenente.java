package KlajdiNdoci.U5W3D3.exercise3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tenente extends Ufficiale{
    private double stipendio = 3000;
    @Override
    public void doCheck(double stipendio) {
        if(this.getStipendio()>=stipendio){
            System.out.println("Un tenente percepisce almeno " + stipendio + "€");
        }
        this.goNext(stipendio);

    }
}
