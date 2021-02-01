import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Libro {

    @Id
    private int id;
    @Column
    private String nombre;
    @Column
    private int anio;
    @ManyToMany
    private List<Persona> editores = new ArrayList<>();
    @OneToMany(mappedBy = "libro")          //El mapeo lo tiene el capitulo.
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
}
