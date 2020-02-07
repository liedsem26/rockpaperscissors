import java.sql.SQLOutput;

public class RockPaperScissorsManager {

    public static void play(Person playerOne, Person playerTwo){
        boolean gameOver = false;

        while(!gameOver){
            Person winner = determineWinner(playerOne,playerTwo);
            if(winner == null){
                System.out.println("tie");
            }else{
                System.out.println(winner.getName() + " is the winner!");
                gameOver = true;
            }

        }

    }

    private static Person determineWinner(Person PlayerOne, Person PlayerTwo){
        Person winner = null;
        PlayerOne.play();
        String playerOneMove = PlayerOne.getCurrentMove();
        PlayerTwo.play();
        String playerTwoMove = PlayerTwo.getCurrentMove();

        System.out.println(PlayerOne.getName() + " : " + PlayerOne.getCurrentMove());
        System.out.println(PlayerTwo.getName() + " : " +  PlayerTwo.getCurrentMove());

        //rock > scissors
        if(playerOneMove.equalsIgnoreCase("rock")
        && playerTwoMove.equalsIgnoreCase("scissors")){
            winner = PlayerOne;
        }

        if(playerTwoMove.equalsIgnoreCase("rock")
                && playerOneMove.equalsIgnoreCase("scissors")){
            winner = PlayerTwo;
        }

        //scissors > paper
        if(playerOneMove.equalsIgnoreCase("scissors")
                && playerTwoMove.equalsIgnoreCase("paper")){
            winner = PlayerOne;
        }

        if(playerTwoMove.equalsIgnoreCase("scissors")
                && playerOneMove.equalsIgnoreCase("paper")){
            winner = PlayerTwo;
        }

        //paper > rock
        if(playerOneMove.equalsIgnoreCase("paper")
                && playerTwoMove.equalsIgnoreCase("rock")){
            winner = PlayerOne;
        }

        if(playerTwoMove.equalsIgnoreCase("paper")
                && playerOneMove.equalsIgnoreCase("rock")){
            winner = PlayerTwo;
        }
        if(playerOneMove.equalsIgnoreCase(playerTwoMove)){
            winner = null;
        }

        return winner;
    }


}
