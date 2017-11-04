import java.util.Random;

public class CharacterFactory {
    static Random rand = new Random();
    Character characters1[] = {new Hobbit(), new Elf(), new King(), new Knight()};
    Character characters2[] = {new Hobbit(), new Elf(), new King(), new Knight()};
    int f = 1;

    public CharacterFactory(){

    }

    Character createCharacter(){
        Character c;

        int obj = rand.nextInt(4);
        if (f == 1) {
            c = characters1[obj];
            f += 1;
        }else{
            c = characters2[obj];
        }
        return c;
    }

}
