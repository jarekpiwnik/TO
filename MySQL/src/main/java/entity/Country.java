package entity;


import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "char")
    private String code;

    private Integer capital;

    @Column(columnDefinition = "char")
    private String code2;

    @Enumerated(EnumType.STRING)
    @Column(name = "Continent", columnDefinition = "enum")
    private Continentenum continent;
    //public enum continent {Asia,Europe,North_America,Africa,Oceania,Antarctica,South_America;};

    @Column(columnDefinition = "decimal")
    private Float gnp;

    @Column(columnDefinition = "decimal")
    private Float gnpold;

    @Column(columnDefinition = "char")
    private String governmentform;

    @Column(columnDefinition = "char")
    private String headofstate;

    @Column(columnDefinition = "smallint")
    private Integer indepyear;

    @Column(columnDefinition = "decimal")
    private Float lifeexpectancy;

    @Column(columnDefinition = "char")
    private String localname;

    @Column(columnDefinition = "char")
    private String name;

    private Integer population;

    @Column(name = "Region", columnDefinition = "char")
    private String region;

    @Column(columnDefinition = "decimal")
    private float surfacearea;

    @Override
    public String toString() {
        return code + " " + capital + " " + code2 + " " + continent + " " + gnp + " " + gnpold + " " +
                governmentform + " " + headofstate + " " + indepyear + " " + lifeexpectancy + " " + localname +
                " " + name + " " + population + " " + region + " " + surfacearea;
    }

    // @OneToOne(
    //        cascade = {CascadeType.ALL}
    // )
    // @JoinColumn(
    //        name = "capitol_id",
    //        referencedColumnName = "id"
    //  )
    // private City capital;
    //  @ManyToMany(
    //         mappedBy = "country"
    //  )
    // private Set<Border> borders = new HashSet();
    //  @ManyToMany(
    //         cascade = {CascadeType.PERSIST}
    //  )
    //  @JoinTable(
    //         name = "country_neighbors",
    //         joinColumns = {@JoinColumn(
    //                 name = "country_id"
    //         )},
    //         inverseJoinColumns = {@JoinColumn(
    //                 name = "neighbor_id"
    //         )}
    //  )
    //  private Set<Country> neighbors = new HashSet();
    //  @OneToMany(
    //          mappedBy = "country"
    //  )
    // private Set<City> cities = new HashSet();
    //  @ManyToMany(
    //          cascade = {CascadeType.ALL}
    //  )
    //  @JoinTable(
    //         name = "country_languages",
    //         joinColumns = {@JoinColumn(
    //                 name = "country_id"
    //         )},
    //         inverseJoinColumns = {@JoinColumn(
    //                 name = "language_id"
    //        )}
    //  )
    // private Set<Language> languages = new HashSet();
    //  @OneToMany(
    //         mappedBy = "country"
    // )
    //  private Set<Religion> religions = new HashSet();

    //  @ManyToMany
    //  @JoinTable(name = "countries_Language",
    //          joinColumns = @JoinColumn(name = "country_id", referencedColumnName = "language_CountryCode"))
    //  private List<Countrylanguage> countrylanguages = new ArrayList<>();

    //  public List<Countrylanguage> getCountrylanguages() {
    //      return countrylanguages;
    //  }

}
