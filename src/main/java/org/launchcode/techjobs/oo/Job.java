package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job
 {
     public int getId() {
         return id;
     }
     private static int nextId = 1;


     public String getValue() {
         return value;
     }

     public void setValue(String value) {
         this.value = value;
         this.name = value;
     }

     private String value ="";
     public int id;
     private String name="";


    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return getValue();

    }

    public void setName(String name) {

        setValue(name);
    }

    public Employer getEmployer() {

        return employer;
    }

    public void setEmployer(Employer employer)
    {
        this.employer = employer;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {

        this.location = location;
    }

    public PositionType getPositionType() {

        return positionType;
    }

    public void setPositionType(PositionType positionType) {

        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {

        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public Job() {

        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        setValue(name);
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job )) return false;
        Job job =(Job) o;
        return getId() == job.getId();
    }
     @Override
     public int hashCode() {
         return Objects.hash(getId());
     }
    @Override
    public String toString() {

        String stringValue = new String();
        String placeHolder = "Data not available";
        String nameToStr = ( getName().isBlank() ? placeHolder : getName());
        String employeeToStr = ((getEmployer() == null || getEmployer().toString().isBlank() )? placeHolder : getEmployer().toString());
        String locationToStr = ((getLocation() == null || getLocation().toString().isBlank()) ? placeHolder : getLocation().toString());
        String positionTypeToStr = ((getPositionType() == null || getPositionType().toString().isBlank()) ? placeHolder : getPositionType().toString());
        String coreCompetencyTypeToStr = ((getCoreCompetency() == null || getCoreCompetency().toString().isBlank() ) ? placeHolder : getCoreCompetency().toString());

        stringValue = "\n" +
                "ID: " + String.valueOf(getId()) +
                "\nName: " + nameToStr +
                "\nEmployer: " + employeeToStr +
                "\nLocation: " + locationToStr +
                "\nPosition Type: " + positionTypeToStr +
                "\nCore Competency: " + coreCompetencyTypeToStr +
                "\n";
        System.out.println(stringValue);
        return stringValue;
    }



}
