package teksystems.com.models;

public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }//StoneMonster

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}//extends Monster
