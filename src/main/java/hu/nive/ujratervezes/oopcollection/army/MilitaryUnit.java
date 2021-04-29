package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int damage;
    private int life;
    private boolean armour;

    public MilitaryUnit(int damage, int life, boolean armour) {
        this.damage = damage;
        this.life = life;
        this.armour = armour;
    }

    public int doDamage() {
        return this.damage;
    };

    public void sufferDamage(int damage) {
        this.life -= this.armour ? damage / 2 : damage;
    }

    public boolean isUsable() {
        return this.life > 24;
    }

    public int getHitPoints() {
        return this.life;
    }

}
