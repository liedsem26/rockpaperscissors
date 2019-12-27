public class RockPaperScissorsManager {

    public static void play(Person playerOne, Person playerTwo){
        boolean gameOver = false;

        while(!gameOver){

            playerOne.play();
            playerTwo.play();

            System.out.println(playerOne.getName() + " : " + playerOne.getCurrentMove());
            System.out.println(playerTwo.getName() + " : " +  playerTwo.getCurrentMove());

            if(determineWinner(playerOne,playerTwo) != null){
                gameOver = false;
            }

        }

    }

    private static Person determineWinner(Person PlayerOne, Person PlayerTwo){
        return null;
    }


}
