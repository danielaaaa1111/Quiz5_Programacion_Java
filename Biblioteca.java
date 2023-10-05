import java.util.LinkedList;


/*
Creamos el objeto Biblioteca
 */
public class Biblioteca {

    /*
    creamos  LinkedList<Libro> librosDisponibles para crear una lista de libros
    el método tiene complejidad temporal O(1)
     */
    public LinkedList<Libro> librosDisponibles = new LinkedList<>();


    /*
    Creamos un método que no retorna y se llama registrarLibro para agregar un libro.
    el método tiene complejidad temporal O(1)
     */
    public void registrarLibro (Libro libro) {
        librosDisponibles.add(libro);
    }

    /*
    Creamos otro método que retorna y se llama buscarLibro por medio del titulo.
    el método tiene complejidad temporal O(1)
     */
    public Libro buscarLibro(String titulo) {
        /*
        Creamos un ciclo for para que haga un recorrido por los libros que tenemos
         el método tiene complejidad temporal O(n)
         */
        for (int i = 0; i < librosDisponibles.size(); i = i + 1) {
            Libro libro1 = librosDisponibles.get(i);
            /*
            Creamos un  parametro con if que dice que si el titulo es igual a libro1 entonces que nos retorne el libro 1
             */
            if (titulo.equals(libro1.getTitulo())) {
                return libro1;
            }

        }
        /*
        Si la condición anterior no se cumple entonces que retorne null
        el método tiene complejidad temporal O(1)
         */
        return null;
    }
    /*
    Este metodos nos renotorna la lista de los libros disponibles
     el método tiene complejidad temporal O(n)
     */
    public LinkedList<Libro> getLibrosDisponibles () {
        return librosDisponibles;
    }
}













