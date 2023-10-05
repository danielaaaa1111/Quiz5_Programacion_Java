import java.util.Set;

public class Libro {
    /*
    Son los atributos que va atener la clase libros
    el método tiene complejidad temporal O(1)
     */
    private String titulo;
    private String autor;
    private int numeroPagina;


    /*/**
     *  el public void Libro: Es el constructor y nos va ayudar a inicializar
     * @param titulo
     * @param autor
     * @param numeroPagina
     el método tiene complejidad temporal O(1)
     */


    public Libro (String titulo, String autor, int numeroPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;


    }
    /*
    Utilizamos setTitulo para que nos de el valor del titulo o sea el nombre del titulo
    el método tiene complejidad temporal O(1)
     */
    public void setTitulo (String titulo){
        this.titulo=titulo;
    }
    /*
   Utilizamos setTitulo para que nos de el valor del autor o sea el nombre del autor
   el método tiene complejidad temporal O(1)
    */
    public void setAutor(String autor) {
        this.autor = autor;

    }
    /*
    Utilizamos setNumeroPagina para que nos de el valor de setNumeroPagina o sea la pàgina del libro
    el método tiene complejidad temporal O(1)
     */
    public void setNumeroPagina(int numeroPagina){
        this.numeroPagina=numeroPagina;
    }
    /*
    Utilizamos getTitulo para mostrarle al usuario el titulo
    el método tiene complejidad temporal O(1)
     */
    public String getTitulo (){
        return  getTitulo();
    }
    /*
    Utilizamos getAutor para mostrarle al usuario el autor del libro
    el método tiene complejidad temporal O(1)
     */
    public String getAutor (){
        return getAutor();
    }
    /*
    Utilizamos getNumeroPagina para mostrarle al usuario la paginas del libro
    el método tiene complejidad temporal O(1)
     */
    public int getNumeroPagina() {
        return numeroPagina;
    }
}
