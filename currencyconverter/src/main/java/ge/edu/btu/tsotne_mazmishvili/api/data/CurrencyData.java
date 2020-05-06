package ge.edu.btu.tsotne_mazmishvili.api.data;


import ge.edu.btu.tsotne_mazmishvili.api.model.Currency;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CurrencyData {
    private static List<Currency> currency;

    public  CurrencyData() {
        currency = new ArrayList<>();
        currency.add(new Currency("USD", 3.16, 3.20));
        currency.add(new Currency("EUR", 3.42, 3.47));
        currency.add(new Currency("GBP", 3.84, 3.94));
        currency.add(new Currency("RUB", 4.12, 3.25));
        currency.add(new Currency("TRY", 0.40, 3.47));
        currency.add(new Currency("AZN", 1.60, 3.84));
    }

    public static List<Currency> getCurrency() {
        return currency;
    }
}
