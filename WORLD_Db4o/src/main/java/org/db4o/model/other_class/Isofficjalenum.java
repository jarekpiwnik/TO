package org.db4o.model.other_class;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Isofficjalenum {
        T("T"),
        F("F");

        private final String name;

        @Override
        public String toString() {return name;}
        //public InputFaultMode next() {return values()[(this.ordinal() + 1) % values().length];}
}
