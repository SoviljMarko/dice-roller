import java.util.ArrayList;

public class test {
    public static void prepoznavanjeKockia(String kockice) {
        if (kockice.contains("+")) {
            System.out.println("imaju plus");
            String dice = kockice.split("\\+")[0];
            System.out.println("this is dice one " + dice);
            String rest = kockice.split("\\+")[1];
            System.out.println("this is rest " + rest);

            DiceRoller.initiationOfProcess(dice, rest);



//            ostalo je da se radi sada za vise kockica, idemo do 7 kockica, toliko opcija ima poyy
        } else {
            System.out.println("nemaju plus");
            DiceRoller.initiationOfProcess(kockice);
        }

    }

    public static void uhvatiSveKockice(String input){
        ArrayList<String> list = new ArrayList<>();
        if (!input.contains("+")) {
            list.add(input);
            System.out.println(list);
            return;
        }

        String[] parts = input.split("\\+");

        for (String part : parts) {
            if (!part.isEmpty()) {
                list.add(part);
            }
        }

        System.out.println(list);
    }
}

