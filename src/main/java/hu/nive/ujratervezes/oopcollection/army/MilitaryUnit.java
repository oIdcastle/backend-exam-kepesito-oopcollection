package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damage;
    protected boolean hasArmour;

    public int getHitPoints() {
        return hitPoints;
    }

    int doDamage() {
        return this.damage;
    }

    void sufferDamage(int damage) {
        this.hitPoints -= this.hasArmour ? (damage / 2) : damage;
    }

}
