package entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Preguntes {
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
    private String pregunta4;
    private String pregunta5;
    private String pregunta6;

    public Preguntes() {
        this.pregunta1 = "";
        this.pregunta2 = "";
        this.pregunta3 = "";
        this.pregunta4 = "";
        this.pregunta5 = "";
        this.pregunta6 = "";
    }

}
