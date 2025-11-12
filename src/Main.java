import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int diceType = 0;
        int numberOfDices = 0;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter dice");
        String dicesToRoll = myObj.nextLine();

        if(DiceDecoder.syntaxCorrectness(dicesToRoll)){
            numberOfDices = DiceDecoder.numberOfDices(dicesToRoll);
            diceType = DiceDecoder.diceType(dicesToRoll);
        } else {
            System.out.println("Wrong syntax");
        }

        // ovo gore treba srediti ^
        // uvesti ogranicenje za kockice u dice decoder
        
        System.out.println("Roll of all dices = " + SumOfAllDices.sumOfRolls(numberOfDices, diceType));

    }

//    public static void testingRandom(int numberOfRolls, String diceType){
//        for (int i = 0; i <= numberOfRolls; i++){
//            System.out.println(mapDiceArray(diceType));
//        }
//    }
}