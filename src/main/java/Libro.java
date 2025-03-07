package biblioteca;

/**
 * Representa un libro con título, autor y año de publicación.
 * @author Claudia Rodríguez Mayán
 * @version 1.0
 */
public class Libro {
    /** Título del libro */
    private String titulo;
    /** Autor del libro */
    private String autor;
    /** Año de publicación del libro */
    private int anioPublicacion;

    /**
     * Constructor para crear un nuevo libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anioPublicacion El año de publicación.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el título del libro.
     * @return El título.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece un nuevo título para el libro.
     * @param titulo El nuevo título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return El autor.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece un nuevo autor para el libro.
     * @param autor El nuevo autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     * @return El año de publicación.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Establece un nuevo año de publicación para el libro.
     * @param anioPublicacion El nuevo año.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
