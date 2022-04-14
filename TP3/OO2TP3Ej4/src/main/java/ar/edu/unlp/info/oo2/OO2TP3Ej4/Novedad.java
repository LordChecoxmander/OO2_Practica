package ar.edu.unlp.info.oo2.OO2TP3Ej4;

import java.util.Comparator;
import java.util.List;

public class Novedad implements Recomendar{
    
    public List<Pelicula> recomendarPelis(Decodificador deco){

        return deco.noVista().stream().
        sorted(Comparator.comparing(Pelicula::getFechaEstreno))
        .limit(3).toList();
    }
}
