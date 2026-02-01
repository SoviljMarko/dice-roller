import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("Enter dice");
        String dicesToRoll = myObj.nextLine();

        RollerLogic.mainProcessLoop(dicesToRoll); // <---- testiram loop
//        DiceDecoder.validateAndInitializeDiceRoll(dicesToRoll); <--- ovo je vazece

    }

//    1. Napraviti loop koji ce da tera ceo flow programa
//    2. napraviti bazu sa rollovima

}