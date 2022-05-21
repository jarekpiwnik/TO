package entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Continentenum {
    Africa("Africa"),
    Antarctica("Antarctica"),
    Asia("Asia"),
    Europe("Europe"),
    North_America("North America"),
    Oceania("Oceania"),
    South_America("South America");

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}