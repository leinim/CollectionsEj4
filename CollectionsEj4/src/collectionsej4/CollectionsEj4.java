/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package collectionsej4;

import Entidad.Pelicula;
import Servicio.ServicioPelicula;
import java.util.ArrayList;

/**
 *
 * @author Mile
 */
public class CollectionsEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pelicula> peliculas = new ArrayList();
        ServicioPelicula sp = new ServicioPelicula();
        
        sp.crearPelicula(peliculas);
        
        System.out.println("Lista de películas:");
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
        
        System.out.println("Lista de películas con duracion mayor a una(1) hora:");
        for (Pelicula p : peliculas){
            if (p.getDuracion() > 1){
                System.out.println("[" + p.toString() + "]");
            }            
        }

        peliculas.sort(Pelicula.compararDuracionDesc);        
        System.out.println("Lista de películas ordenadas por duración descendente:");        
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
        
        peliculas.sort(Pelicula.compararDuracionAsc);
        System.out.println("Lista de películas ordenadas por duración ascendente:");
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
        
        peliculas.sort(Pelicula.compararTitulo);
        System.out.println("Lista de películas ordenada alfabeticamente por titulo:");
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
        
        peliculas.sort(Pelicula.compararDirector);        
        System.out.println("Lista de películas ordenada alfabeticamente por director:");
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
        
    }
    
}
