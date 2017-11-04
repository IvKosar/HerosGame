public class Hobbit extends Character{

    public Hobbit(){
        super(0, 3);
    }

    void kick(Character c){
        toCry();
    }

    void toCry(){
        System.out.println("I'm useless :( ");
    }


    public String toString(){
        return "Hobbit";
    }
}
