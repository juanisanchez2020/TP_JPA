import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Capitulo {
    @Id
    private int id;
    @Column
    private String titulo;
    @Column
    private int paginas;
    @ManyToOne          //Un capitulo puede tener un revisor, Un revisor puede revisar Muchos capitulos.
    private Persona revisor;
    @ManyToMany         //Un autor pudo haber escrito muchos capitulos - Un capitulo puede tener muchos autores
    private List<Persona> autores = new ArrayList<>();
    @ManyToOne          // Un libro puede tener muchos capitulos, un capitulo puede tener un SOLO LIBRO
    private Libro libro;

    public Capitulo() {
        super();
    }

    public Capitulo(int id, String titulo, int paginas, Persona revisor, List<Persona> autores, Libro libro) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.paginas = paginas;
        this.revisor = revisor;
        this.autores = autores;
        this.libro = libro;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Persona getRevisor() {
        return revisor;
    }

    public void setRevisor(Persona revisor) {
        this.revisor = revisor;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }


}
