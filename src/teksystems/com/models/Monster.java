package teksystems.com.models;

public abstract class Monster {
    //Fields
    private String name;
    //Constructor
    public Monster(String name) {
        this.name = name;
    }
    //Methods
    public abstract String attack();
    //Getter and Setters
    public String getName() {
        return name;
    }//getName

    public void setName(String name) {
        this.name = name;
    }//setName

}//Monster
