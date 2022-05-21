package entity;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "char")
    private String name;

    @Column(columnDefinition = "char")
    private String countryCode;

    @Column(columnDefinition = "char")
    private String district;

    private Integer population;

    @Override
    public String toString() {
        return id + " " + name + " " + countryCode + " " + district + " " + population;
    }
    //   @ManyToOne
    //   @JoinColumn(
    // name = "country_id"
    //  )

}
