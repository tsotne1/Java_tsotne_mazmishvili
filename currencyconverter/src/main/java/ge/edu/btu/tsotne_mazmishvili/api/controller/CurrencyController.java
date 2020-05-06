package ge.edu.btu.tsotne_mazmishvili.api.controller;

import ge.edu.btu.tsotne_mazmishvili.api.data.CurrencyData;
import ge.edu.btu.tsotne_mazmishvili.api.model.Converter;
import ge.edu.btu.tsotne_mazmishvili.api.model.Currency;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/currency")
public class CurrencyController {

    CurrencyData currencyData = new CurrencyData();
    List<Currency> currencies = CurrencyData.getCurrency();



    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List getCurrencyData() {
        return currencies;
    }

    @POST
    @Path("buy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public double buy(Converter converter) {
        for (int i = 0; i <= currencies.size(); i++) {
            Currency currency = currencies.get(i);
            double result = converter.getAmount() / currency.getBuy();
            System.out.println(result);
            return result;
        }
        return 0;
    };

    @POST
    @Path("sell")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public double sell(Converter converter) {
        for (int i = 0; i <= currencies.size(); i++) {
            Currency currency = currencies.get(i);
            double result = converter.getAmount() * currency.getBuy();
            System.out.println(result);
            return result;
        }
        return 0;
    };

}
