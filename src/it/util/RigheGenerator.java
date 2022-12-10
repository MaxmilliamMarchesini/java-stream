package it.util;
import it.data.Riga;
import it.data.Titolo;
import java.util.List;
import java.util.ArrayList;

public class RigheGenerator {


    public List<Titolo> generaTitoli() {
        List<Titolo> titoli = List.of(
                new Titolo(Titolo.Allineamento.CX,
                        List.of(
                                new Riga("Ziao",0),
                                new Riga("Dondo",1),
                                new Riga("Come",2),
                                new Riga("procede",3),
                                new Riga("esonero",4),
                                new Riga("2",5)
                        )
                ),
                new Titolo(Titolo.Allineamento.CX,
                        List.of(
                                new Riga("Ciao",0),
                                new Riga("Mondo",1),
                                new Riga("Come",2),
                                new Riga("procede",3),
                                new Riga("esonero",4),
                                new Riga("2",5)
                        )
                ),
                new Titolo(Titolo.Allineamento.DX,
                        List.of(
                                new Riga("Ciao",0),
                                new Riga("Mondo",1),
                                new Riga("Come",2)
                        )
                ),
                new Titolo(Titolo.Allineamento.SX,
                        List.of(
                                new Riga("Ciao",0),
                                new Riga("Mondo",1),
                                new Riga("Come",2)
                        )
                )
        );
        return titoli;
    }
}
