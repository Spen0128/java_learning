package chap5.warship_Game_;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public SimpleDotCom (int[] loc){
        locationCells = loc;
    }
    public String checkYourself (String strGuess){
        int intGuess = Integer.parseInt(strGuess);
        int locationCell;
        for (int i=0 ; i<locationCells.length ; i++){
            locationCell = locationCells[i];
            if (intGuess == locationCell){
                numOfHits++;
                if (numOfHits == locationCells.length)
                    return "kill";
                else {
                    locationCells[i] = -1;
                    return "hit";
                }
            }
        }
        return "miss"; 
    }
}
