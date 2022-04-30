package JavaAdvanced;

public class Fighter {

    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if (fighter1.name.equals(firstAttacker)) {
            while (true) {
                fighter2.health -= fighter1.damagePerAttack;
                //System.out.println(fighter1.name + " " + fighter1.health);
                if (fighter2.health <= 0) {
                    //System.out.println("Death 2");
                    return fighter1.name;
                }
                fighter1.health -= fighter2.damagePerAttack;
                //System.out.println(fighter2.name + " " + fighter2.health);
                if (fighter1.health <= 0) {
                    //System.out.println("Death 1");
                    return fighter2.name;
                }
            }
        }
        else return declareWinner(fighter2, fighter1, firstAttacker);
    }
}