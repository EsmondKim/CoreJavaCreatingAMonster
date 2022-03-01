package teksystems.com.models;

public class FyreMonster extends Monster {
    public FyreMonster(String name) {
        super(name);
    }//FireMonster

    @Override
    public String attack() {
        return "Attack with fire!";
    }//attack()
}//FireMonster
