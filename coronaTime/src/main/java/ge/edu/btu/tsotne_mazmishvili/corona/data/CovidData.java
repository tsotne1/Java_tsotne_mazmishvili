package ge.edu.btu.tsotne_mazmishvili.corona.data;

import ge.edu.btu.tsotne_mazmishvili.corona.models.Covid;

import java.util.ArrayList;
import java.util.List;

public class CovidData {
    private static List<Covid> covids;

    public  CovidData() {
        covids = new ArrayList<>();
        covids.add(new Covid("Georgia", 200, 3, 123));
        covids.add(new Covid("USA", 12300, 400, 9023));
        covids.add(new Covid("Ghana", 3, 0, 1));
        covids.add(new Covid("France", 2200, 122, 163));
    }
    public static List<Covid> getCurrency() {
        return covids;
    }

}
