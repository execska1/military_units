package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
    private boolean first;

    public HeavyCavalry() {
        super(20, 150, true);
        this.first = true;
    }

    @Override
    public int doDamage() {
        if (first) {
            first = false;
            return 3 * super.doDamage();
        } else {
            return super.doDamage();
        }
    }
}