import java.util.ArrayList;

public class DotCom {
    ArrayList<String> locationCells;
    
    public void setLocation(ArrayList<String> location){
        locationCells = location;
    }

    public String checkYourself(String userGuess){
        int guess = Integer.parseInt(userGuess);
        String result = "miss";

        while(locationCells.contains(guess)){
            if(locationCells.isEmpty()){
                result = "kill";
            }
            else{
                result = "Hit";
            }
        }
        return result;
    }
}
