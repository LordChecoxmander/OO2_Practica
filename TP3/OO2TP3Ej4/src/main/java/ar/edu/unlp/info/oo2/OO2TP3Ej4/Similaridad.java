package ar.edu.unlp.info.oo2.OO2TP3Ej4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements Recomendar{
    
    public List<Pelicula> recomendarPelis(Decodificador deco){
        return deco.getVistas().stream()
                .flatMap(p -> p.getPelSimilares().stream())
                .distinct()
                .sorted(Comparator.comparing(Pelicula::getFechaEstreno))
                .limit(3).toList();
    }

}
