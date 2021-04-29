package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean isFirstAttack = true;

    public HeavyCavalry() {
        this.hitPoints = 150;
        this.damage = 20;
        this.hasArmour = true;
    }

    @Override
    int doDamage() {
        if (this.isFirstAttack) {
            this.isFirstAttack = false;
            return 3 * this.damage;
        }
        return this.damage;
    }
}