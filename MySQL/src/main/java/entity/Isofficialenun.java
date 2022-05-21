package entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Isofficialenun {
    T("TRUE"),
    F("FALSE");

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
