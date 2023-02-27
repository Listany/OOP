package Seminar004Homework;

import java.util.Random;

// здесь делаем общий тип оружия, а уточнение будет в классе футмен и арчер
public abstract class BaseHero<W extends Weapon, S extends Shield> {
    private int helth;

    private String name;

    protected W weapon;

    protected S shield;

    protected BaseHero(int helth, String name, W weapon, S shield) {
        this.helth = helth;
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "helth=" + helth +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }

    public int getHelth() {
        return helth;
    }

    public String getName() {
        return name;
    }

    public W getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public boolean hitSomebody(BaseHero somebody){ //метод удара по кому-то
        int damage = damageFork() - somebody.getShield().protection();
        return !somebody.reduceHelth(damage); // возвращает "живой", если еще не убил. Получается результат ТРУ - когда somebody НЕ ЖИВОЙ
    }

    public boolean reduceHelth(int damage){ // метод оставшегося здоровья - тру, если больше нуля
        helth -= damage;
        return helth > 0;
    }
}
