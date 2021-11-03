import java.time.LocalDate;

public class Pills extends Meds {
    public Pills (String preparat, int antalKvar, int uttagKvar, int antalPerUttag, int konsPerDag, int evExtraPerDag, LocalDate date) {
        super (preparat, antalKvar, uttagKvar, antalPerUttag, konsPerDag, evExtraPerDag, date);
    }

    public Pills() {

    }
}