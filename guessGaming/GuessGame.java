public class GuessGame{
    Player p_one;
    Player p_two;
    Player p_three;

    public void startGame(){
        p_one = new Player();
        p_two = new Player();
        p_three = new Player();

        int numGuessP_one;
        int numGuessP_two;
        int numGuessP_three;

        boolean p_oneIsRight = false;
        boolean p_twoIsRight = false;
        Boolean p_threeIsRight = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println("I am thinking a number between 0 and 9");

        while(true){
            System.out.println("the number to guess is "+targetNumber);

            p_one.guess();
            p_two.guess();
            p_three.guess();

            numGuessP_one = p_one.number;
            System.out.println("Player one guess "+numGuessP_one);

            numGuessP_two = p_two.number;
            System.out.println("Player two guess "+numGuessP_two);

            numGuessP_three = p_three.number;
            System.out.println("Player three guess "+numGuessP_three);

            if(numGuessP_one == targetNumber){
                p_oneIsRight = true;
            }

            if(numGuessP_two == targetNumber){
                p_twoIsRight = true;
            }

            if(numGuessP_three == targetNumber){
                p_threeIsRight = true;
            }
            
            if(p_oneIsRight == true || p_twoIsRight == true || p_threeIsRight == true){
                System.out.println("player one got it right "+p_oneIsRight);
                System.out.println("Player two got it right "+p_twoIsRight);
                System.out.println("payer three got it right "+p_threeIsRight);
                System.out.println("Game is over");
                break;
            }else{
                System.out.println("Players will have to try again");
            }
        }
    }
}