import org.junit.Test;

import static org.junit.Assert.*;

public class Testing {

    @Test
    public void main() throws Exception{
        new Main();
    }

    @Test
    public void creating() throws Exception{
        Hobbit hobbit = new Hobbit();
        assertEquals("Hobbit", hobbit.toString());
        assertEquals(true, hobbit.isAlive());
        int hp1 = hobbit.hp;
        Elf elf = new Elf();
        hobbit.toCry();
        hobbit.kick(elf);
        assertEquals("Elf", elf.toString());
        elf.kick(hobbit);
        int hp2 = hobbit.hp;
        assertEquals(false, hp1 == hp2);
        King king = new King();
        assertEquals("King", king.toString());
        Knight knight = new Knight();
        assertEquals("Knight", knight.toString());
    }

    @Test
    public void factory() throws Exception{
        CharacterFactory cf = new CharacterFactory();
        assertEquals(1, cf.f);
        Character c1 = cf.createCharacter();
        assertEquals(2, cf.f);
        Character c2 = cf.createCharacter();
        assertEquals(2, cf.f);

    }

    @Test
    public void manager() throws Exception{
        GameManager gm = new GameManager();
        gm.c1 = new Hobbit();
        gm.c2 = new Hobbit();
        gm.fight(gm.c1, gm.c2);
        assertEquals(true, gm.c1.hp == gm.c2.hp);

        gm.c1 = new Elf();
        gm.c2 = new Elf();
        gm.fight(gm.c1, gm.c2);
        assertEquals(true, gm.c1.hp == gm.c2.hp);

        gm.c1 = new King();
        gm.c2 = new Elf();
        gm.fight(gm.c1, gm.c2);

        gm.c1 = new Hobbit();
        gm.c2 = new Knight();
        gm.fight(gm.c1, gm.c2);
        assertEquals(true, gm.c1.hp <= 0);

        gm.c1 = new Knight();
        gm.c2 = new Elf();
        gm.fight(gm.c1, gm.c2);
    }
}
