package data.layer.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cities")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NameEnglish", nullable = false, length = 100)
    private String nameEnglish;

    @Column(name = "NameArabic", nullable = false, length = 100)
    private String nameArabic;

    @Column(name = "Visible", nullable = false)
    private boolean visible;
}
