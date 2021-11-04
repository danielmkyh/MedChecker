import java.time.LocalDate;

// A class to use when more types of meds maybe handled
public class Pills extends Meds {
    public Pills (String name, int remaining, int bundles, int amountInBundle, int perDay, int extra, LocalDate date) {
        super (name, remaining, bundles, amountInBundle, perDay, extra, date);
    }

    public Pills() {

    }
}