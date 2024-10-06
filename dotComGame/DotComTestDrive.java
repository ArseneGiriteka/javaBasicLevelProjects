import java.util.ArrayList;

public class DotComTestDrive{
    public static void main(String[] args){
        
        int numberOfGuess = 0;
        DotCom dot = new DotCom();
        GameHelper helper = new GameHelper();
        boolean isAlive = true;

        int randomNumber = (int) (Math.random()*5);
        ArrayList<String> location = {randomNumber,randomNumber+1,randomNumber+2};
        dot.setLocation(location);

        while(isAlive){
            String guess = helper.getInputUser("enter a number:");
            String result = dot.checkYourself(guess);
            numberOfGuess++;
            if(result == kill){
                isAlive = false;
                System.out.println("you won with "+numberOfGuess+" guess");
            }
            System.out.println(result);
        }

    }
}