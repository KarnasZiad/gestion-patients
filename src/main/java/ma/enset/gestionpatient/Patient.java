package ma.enset.gestionpatient;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data  // Lombok : génère automatiquement les getters et setters
@NoArgsConstructor  // Génère un constructeur sans arguments
@AllArgsConstructor  // Génère un constructeur avec tous les arguments
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    private int score;
}
