package KlajdiNdoci.U5W3D3.exercise3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Ufficiale {
    private Ufficiale next;

    private double stipendio;

    public abstract void doCheck(double stipendio);

    public void goNext(double stipendio){
        if(this.getNext() != null){
            this.next.doCheck(stipendio);
        }else {
            System.out.println("Siamo arrivati alla fine della catena");

        }
    }
}
