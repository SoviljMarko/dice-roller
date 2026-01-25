import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter dice");
        String dicesToRoll = myObj.nextLine();


        DiceDecoder.validateAndInitializeDiceRoll(dicesToRoll);


    }
    // 1. prepraviti da ranije prekine program, da ne vrti sve --- skoro gotovo
    // 2. Ocistiti sve suvsne kodove, a ima ih bas mnogo i srediti test class-u,
    // prepakovati gde sta treba




}