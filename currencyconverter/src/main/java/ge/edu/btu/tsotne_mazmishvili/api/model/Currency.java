package ge.edu.btu.tsotne_mazmishvili.api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Currency {
    private String currency;
    private double buy;
    private double sell;

    public Currency() {
    }

    public Currency(String currency, double buy, double sell) {
        this.currency = currency;
        this.buy = buy;
        this.sell = sell;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "Currnecy{" +
                "Initials=" + currency +
                ", buy " + buy + '\'' +
                ", sell " + sell +
                '}';
    }
}
