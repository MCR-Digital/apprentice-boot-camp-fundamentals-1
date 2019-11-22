package checkout;

import java.util.ArrayList;

public class SpecialOffersLookup {

    private ArrayList<Discount> specialOffersLookup;

    public SpecialOffersLookup() {

        this.specialOffersLookup = specialOffersLookup;
        populateSpecialOffersLookup();
    }

    public ArrayList<Discount> getSpecialOffersLookup() {
        return specialOffersLookup;
    }

    private ArrayList<Discount> populateSpecialOffersLookup() {

        specialOffersLookup = new ArrayList<>();

        specialOffersLookup.add(new Discount(
                "A",
                4,
                20,
                " - 20 (4 for 180)"));

        specialOffersLookup.add(new Discount(
                "B",
                2,
                15,
                " - 15 (2 for 45)"));

        specialOffersLookup.add(new Discount(
                "C",
                4,
                10,
                " - 10 (4 for 70)"));

        specialOffersLookup.add(new Discount(
                "D",
                5,
                15,
                " - 10 (5 for 60)"));

        return specialOffersLookup;
    }

}
