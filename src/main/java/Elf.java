public class Elf extends Character{

    public Elf(){
        super(10, 10);
    }

    void kick(Character c){
        if (this.hp > c.hp){
            c.hp = 0;
        }else{
            c.power -= 1;
        }
    }

    public String toString(){
        return "Elf";
    }
}
