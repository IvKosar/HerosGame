public abstract class Character {
    int power;
    int hp;

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    abstract void kick(Character c);

    boolean isAlive () {
        return this.hp > 0;
    }
}

