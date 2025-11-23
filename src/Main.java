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

            System.out.println("Roll of all dices = " + SumOfAllDices.sumOfRolls(numberOfDices, diceType));

        } else {
            System.out.println("Wrong syntax");
        }

        // ovo gore treba srediti ^
        // prepraviti da ranije prekine program, da ne vrti sve

    }

    public static void damageAmplifier (String dicePlusAmp){
        if (dicePlusAmp.contains("+")){
            // sada npraviti filozofiju za Amplifier
        }
    }
}