package teksystems.com.models;

public class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }//WaterMonster

    @Override
    public String attack() {
        return "Attack with water!";
    }
}//extends Monster
