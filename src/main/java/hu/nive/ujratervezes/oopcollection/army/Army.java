package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> army;

    public Army() {
        this.army = new ArrayList<>();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        army.forEach(mU -> mU.sufferDamage(damage));
        army.removeIf(mU -> !mU.isUsable());
    }

    public int getArmyDamage() {
        return (int)army.stream().mapToInt(MilitaryUnit::doDamage).sum();
    }

    public int getArmySize() {
        return army.size();
    }
}