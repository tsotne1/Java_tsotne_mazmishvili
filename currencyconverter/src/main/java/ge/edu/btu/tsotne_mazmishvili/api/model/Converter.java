package ge.edu.btu.tsotne_mazmishvili.api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Converter {
    private String to;
    private double amount;

    public Converter() {
    }

    public Converter(String to, double amount) {
        this.to = to;
        this.amount = amount;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{" +
                "to " + to +
                ", amount " + amount + '\'' +
                '}';
    }
}
