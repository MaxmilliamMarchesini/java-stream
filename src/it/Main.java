package it;

import it.util.RigheGenerator;
import it.data.Titolo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        RigheGenerator rg = new RigheGenerator();

        List<Titolo> titoli = rg.generaTitoli();

        //ESERCIZI SU TITOLI
        //1.l'insieme dei primi 5 titoli aventi al più una riga

        Set<Titolo> primi5TitoliConMaxUnaRiga = titoli.stream()
                .filter(t -> t.getRighe().size() < 2)
                .limit(5)
                .collect(toSet());

        //2.la lista dei soli titoli centrati e in ordine alfabetico
        List<Titolo> titoliCentrati = titoli.stream().filter(Titolo::isCentered).collect(Collectors.toList());
        titoliCentrati.sort(comparing(Titolo::toString));

        //3.mappa da allineamento a lista di titoli
        Map<Titolo.Allineamento, List<Titolo>> titoloList = titoli.stream().collect(groupingBy(Titolo::getAllineamento));

        //4.mappa da allineamento a insieme di titoli
        Map<Titolo.Allineamento, Set<Titolo>> titoliSet = titoli.stream()
                .collect(groupingBy(Titolo::getAllineamento, mapping(t -> {
                    return new Titolo(t.getAllineamento());
                }, toSet())));

        //5.mappa da allineamento alla concatenazione delle stringhe dei titoli;
        Map<Titolo.Allineamento,String> map = titoli.stream()
                .collect(groupingBy(Titolo::getAllineamento, mapping(t->{
                                    return t.getRighe().stream()
                                .map(s->s.toString().concat(s.toString()))
                                .collect(joining());
                                }, joining(""))));

        //6.mappa da allineamento alla lista delle stringhe dei titoli
        Map<Titolo.Allineamento,List<String>> mapList = titoli.stream()
                .collect(groupingBy(Titolo::getAllineamento, mapping(t->{
                    return t.getRighe().stream()
                            .map(s->s.toString().concat(s.toString()))
                            .collect(joining());
                }, toList())));

        //7.insieme delle righe dei titoli ciascuna rappresentata sotto forma di stringa
        Set<String> setStingTitoli = titoli.stream()
                .map(t->t.getRighe()
                        .stream().map(s->s.toString())
                        .collect(joining()))
                .collect(toSet());

    }
}
