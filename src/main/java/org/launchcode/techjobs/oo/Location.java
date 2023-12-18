package org.launchcode.techjobs.oo;

public class Location extends JobField {


    public Location(String value){
        super(value);
    }
    // TODO-Done: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location location)) return false;
        return getId() == location.getId();
    }

}