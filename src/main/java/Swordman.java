import java.util.Random;

public class Swordman extends Character{
    static Random rand = new Random();
    int a;
    int b;
    String name;


    public Swordman(int a, int b, int c, int d, String name){
        super(rand.nextInt(b - a + 1) + a,  rand.nextInt(d - c + 1) + c);
        this.a = a;
        this.b = b;
        this.name = name;
    }

    void kick(Character c){

        c.hp -= this.power + this.power / this.a + this.b;
        this.power = rand.nextInt(this.b + this.a - 1) / this.a * this.b;
    }

    public static void main(String[] args) {

    }

    public String toString(){
        return this.name;
    }
}
