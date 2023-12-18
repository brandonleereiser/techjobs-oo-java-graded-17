package org.launchcode.techjobs.oo;

public class PositionType extends JobField {
    public PositionType(String value) {

        super(value);
    }

    @Override
   public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType positionType)) return false;
        return getId() == positionType.getId();
    }

}