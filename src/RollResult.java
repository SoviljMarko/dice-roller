import java.util.List;

public class RollResult {
    public List<Integer> rolls;
    public String rollsString;
    public int modifier;
    public int total;

    // postojeći konstruktor - za bacanje kockica
    RollResult(List<Integer> rolls, int modifier, int total) {
        this.rolls = rolls;
        this.modifier = modifier;
        this.total = total;
    }

    // novi konstruktor - za čitanje iz baze
    RollResult(String rollsString, int modifier, int total) {
        this.rollsString = rollsString;
        this.modifier = modifier;
        this.total = total;
    }
}
