package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    private boolean first;

    public Swordsman(boolean armour) {
        super(10, 100, armour);
        this.first = true;
    }

    @Override
    public void sufferDamage(int damage) {
        if (first) {
            first = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}