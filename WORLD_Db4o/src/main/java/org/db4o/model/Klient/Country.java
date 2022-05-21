package org.db4o.model.Klient;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.db4o.model.other_class.Continentenum;

@Data
@AllArgsConstructor

public class Country {

   // @Column(columnDefinition = "char")
    private String code;

    private Integer capital;

   // @Column(columnDefinition = "char")
    private String code2;

    //@Enumerated(EnumType.STRING)
    //@Column(name = "Continent", columnDefinition = "enum")
    private Continentenum continent;
    //public enum continent {Asia,Europe,North_America,Africa,Oceania,Antarctica,South_America;};

   // @Column(columnDefinition = "decimal")
    private Float gnp;

   // @Column(columnDefinition = "decimal")
    private Float gnpold;

   // @Column(columnDefinition = "char")
    private String governmentform;

   // @Column(columnDefinition = "char")
    private String headofstate;

   // @Column(columnDefinition = "smallint")
    private Integer indepyear;

   // @Column(columnDefinition = "decimal")
    private Float lifeexpectancy;

   // @Column(columnDefinition = "char")
    private String localname;

   // @Column(columnDefinition = "char")
    private String name;

    private Integer population;

   // @Column(name = "Region",columnDefinition = "char")
    private String region;

   // @Column(columnDefinition = "decimal")
    private float surfacearea;

    @Override
    public String toString() { return code + " " + capital +" "+ code2 + " " + continent + " " + gnp + " " + gnpold + " " +
            governmentform +" "+ headofstate + " " + indepyear+ " " + lifeexpectancy +" "+ localname + " " + name + " " +
            population + " " + region+ " " + surfacearea ;}
}
