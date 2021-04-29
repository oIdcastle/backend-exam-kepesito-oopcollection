package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private final List<MilitaryUnit> army = new ArrayList<>();

    void addUnit(MilitaryUnit militaryUnit) {
        this.army.add(militaryUnit);
    }

    void damageAll(int damage) {
        army.forEach(u -> u.sufferDamage(damage));
        army.removeIf(u -> u.getHitPoints() < 25);
    }

    int getArmyDamage() {
        return army.stream()
                .mapToInt(u -> u.doDamage())
                .sum();
    }

    int getArmySize() {
        return army.size();
    }

}