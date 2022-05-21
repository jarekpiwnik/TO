package entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "Countrylanguage")
public class Countrylanguage implements Serializable {


    @Column(name = "countryCode", columnDefinition = "char")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String countryCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "IsOfficial", columnDefinition = "enum")
    private Isofficialenun isOfficial;

    private String language;
    private float percentage;

    @Override
    public String toString() {
        return countryCode + " " + language + " " + isOfficial + " " + percentage;
    }

    // @OneToOne
    // @JoinColumn(name="countryCode")
    // private String language;


    // @ManyToMany(
    //     mappedBy = "CountryLanguage"
    // )
    // private Set<Country> countries;
}
