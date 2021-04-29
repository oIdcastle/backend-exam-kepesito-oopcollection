package hu.nive.ujratervezes.oopcollection.army;


public class Swordsman extends MilitaryUnit {

    private boolean isFirstDamage = true;

    public Swordsman(boolean hasArmour) {
        this.hitPoints = 100;
        this.damage = 10;
        this.hasArmour = hasArmour;
    }

    @Override
    void sufferDamage(int damage) {
        if (this.isFirstDamage) {
            isFirstDamage = false;
        } else {
            this.hitPoints -= this.hasArmour ? (damage / 2) : damage;
        }
    }
}