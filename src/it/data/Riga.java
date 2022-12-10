package it.data;

public class Riga {
    //campi della classe Riga
    private String riga;
    private int numero;

    //Costruttori della classe Riga
    public Riga(String riga, int numero) {
        this.riga = riga;
        this.numero = numero;
    }

    public Riga(String riga) {
        this(riga, -1);
    }

    @Override
    public String toString() {
        return(numero==-1 ? "" : numero+": ")+riga;
    }
}
