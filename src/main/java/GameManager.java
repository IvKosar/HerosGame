public class GameManager {
    static CharacterFactory cf = new CharacterFactory();
    static Character c1 = cf.createCharacter();
    static Character c2 = cf.createCharacter();
    static Character characters[] = {c1, c2};
    String first_print;
    String second_print;
    static int index = 0;

    public void fight(Character c1, Character c2) {
        if (c1.toString() == "King" || c1.toString() == "Knight"){
            first_print = "some";
        }else{
            first_print = Integer.toString(c1.power);
        }

        if (c2.toString() == "King" || c2.toString() == "Knight"){
            second_print = "some";
        }else{
            second_print = Integer.toString(c2.power);
        }

        System.out.println("First character is " + c1.toString() + " with " + first_print + " power and " + Integer.toString(c1.hp) + " HP");
        System.out.println("Second character is " + c2.toString() + " with " + second_print + " power and " + Integer.toString(c2.hp) + " HP");


        while ((c1.isAlive()) && (c2.isAlive())){
            if (c1.toString() == c2.toString() && c1.toString() == "Hobbit"){
                System.out.println("Hobbits are peaceful");
                break;
            }else if (c1.toString() == c2.toString() && c1.toString() == "Elf"){
                System.out.println("Elfs will never kill each other");
                break;
            }
            Character temp_c1 = characters[index];
            Character temp_c2 = characters[1 - index];

            if (temp_c1.toString() != "Hobbit") {
                if (temp_c1.toString() == "Elf") {
                    if (temp_c1.hp > temp_c2.hp) {
                        System.out.println("Elf destroyed his enemy!");
                        break;
                    } else {
                        System.out.println("Elf decreased power of his enemy by 1");
                    }
                } else {
                    System.out.println(temp_c1.toString() + " with " + temp_c1.hp + " HP damaged " + temp_c1.power + " HP to " + temp_c2.toString() + " with " + temp_c2.hp + " HP");
                }
            }
            temp_c1.kick(temp_c2);
            if(temp_c2.isAlive() != true){
                System.out.println(temp_c1.toString() + " wins the battle!");
            }
            index = 1 - index;
        }
        System.out.println("The end!");
    }
}
