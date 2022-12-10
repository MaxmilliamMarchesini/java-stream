package it.data;

import java.util.ArrayList;
import java.util.List;
import it.data.Riga;

public class Titolo {

    //campi della classe titolo
    public enum Allineamento {SX, CX, DX}
    private Allineamento allineamento;
    private List<Riga> righe;

    //costruttori della classe titolo
    public Titolo(Allineamento a) {
        this(a, new ArrayList<Riga>());
    }

    public Titolo(Allineamento a, List<Riga> righe) {
        this.allineamento = a;
        this.righe = righe;
    }

    //metodi della classe titolo
    public void add(Riga r) {righe.add(r);}

    public boolean isCentered() {return allineamento==Allineamento.CX;}

    @Override
    public String toString() {return righe.toString();}

    public Allineamento getAllineamento() {return this.allineamento;}

    public List<Riga> getRighe() {return new ArrayList<>(righe);}

}
