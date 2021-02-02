import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Capitulo {
    @Id
    private int id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "paginas")
    private int paginas;
    @ManyToOne
    private Persona revisor;
    @ManyToMany
    private List<Persona> autores = new ArrayList<>();
    @ManyToOne
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

    @Override
    public String toString() {
        return "Capitulo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                ", revisor=" + revisor +
                ", libro=" + libro +
                '}';
    }
}
