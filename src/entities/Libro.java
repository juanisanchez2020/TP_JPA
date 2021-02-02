import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Libro {

    @Id
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "anio")
    private int anio;
    @ManyToMany
    private List<Persona> editores = new ArrayList<>();
    @OneToMany(mappedBy = "libro")
    private List<Capitulo> capitulos = new ArrayList<>();

    public Libro() {
        super();
    }

    public Libro(int id, String nombre, int anio, List<Persona> editores) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.editores = editores;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anio=" + anio +
                '}';
    }
}
