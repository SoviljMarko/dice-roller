import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter dice");
        String dicesToRoll = myObj.nextLine();

//        DiceRoller.initiationOfProcess(dicesToRoll);

//       DiceDecoder.prepoznavanjeKockia(dicesToRoll); <--> ovo je vazeca

//        test.prepoznavanjeKockia(dicesToRoll); <---> test
        test.uhvatiSveKockice(dicesToRoll);


    }
    // 1. resiti "DiceRoller" da prihvata novi model DMG AMP
    // 2. prepraviti da ranije prekine program, da ne vrti sve
    // 3. trebalo bi i srediti razmake, da ne puca program zbog toga

}