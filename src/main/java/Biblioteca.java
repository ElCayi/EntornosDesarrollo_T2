package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una biblioteca que gestiona libros.
 * Permite agregar, eliminar y buscar libros por título o autor.
 * @author Tu Nombre
 * @version 2.0
 */
public class Biblioteca {
    /** Lista de libros en la biblioteca */
    private final List<Libro> libros;

    /**
     * Constructor por defecto que inicializa una biblioteca vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que permite inicializar la biblioteca con una lista de libros.
     * @param libros Lista de libros iniciales.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la biblioteca.
     * @param libro El libro a agregar.
     * @return true si el libro se agregó con éxito.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Elimina un libro de la biblioteca.
     * @param libro El libro a eliminar.
     * @return true si el libro se eliminó correctamente.
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros en la biblioteca.
     * @return Lista de libros.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro por su título.
     * @param titulo El título del libro.
     * @return El libro encontrado, o null si no existe.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated Este método ha sido reemplazado por {@link #encuentraLibrosPorAutor(String)}.
     * Usa el nuevo método en su lugar.
     * @param autor El autor del libro.
     * @return El primer libro encontrado del autor, o null si no hay coincidencias.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros de un autor.
     * @param autor El autor de los libros.
     * @return Lista de libros del autor, o null si no hay coincidencias.
     * @since 2.0
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
