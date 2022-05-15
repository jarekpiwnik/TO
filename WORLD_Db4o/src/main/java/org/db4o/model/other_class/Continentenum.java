package org.db4o.model.other_class;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Continentenum {
    Asia("Asia"),
    Europe("Europe"),
    North_America ("North America"),
    Africa("Africa"),
    Oceania("Oceania"),
    Antarctica("Antarctica"),
    South_America("South America");

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
