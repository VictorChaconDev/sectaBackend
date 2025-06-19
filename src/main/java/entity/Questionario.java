package entity;
import jakarta.persistence.*;

@Entity
public class Questionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edad;
    private int puntuacion;
    @Embedded
    private Preguntes preguntes;

    public Questionario() {
        this.edad = "";
        this.puntuacion = 0;
        this.preguntes = new Preguntes();
    }

    // Getters y Setters
    public String getEdad() { return edad; }
    public void setEdad(String edad) { this.edad = edad; }

    public int getPuntuacion() { return puntuacion; }
    public void setPuntuacion(int puntuacion) { this.puntuacion = puntuacion; }

    public Preguntes getPreguntes() { return preguntes; }
    public void setPreguntes(Preguntes preguntes) { this.preguntes = preguntes; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

