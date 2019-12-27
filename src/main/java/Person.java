import java.util.Random;

public class Person {

    //Properties
    private String availableMoves[] = new String[3];
    private String currentMove;
    private String name;

    //Constructor
    public Person(String name){
        this.name = name;
        availableMoves[0] = "rock";
        availableMoves[1] = "paper";
        availableMoves[2] = "scissors";
    }

    //Method
    public void play(){
        Random r = new Random();
        int low = 0;
        int high = 3;
        int result = r.nextInt(high-low) + low;
        currentMove = availableMoves[result];
    }

    public String getName(){
        return name;
    }

    public String getCurrentMove(){
        return currentMove;
    }

}
