package ge.edu.btu.tsotne_mazmishvili.corona.services;

import ge.edu.btu.tsotne_mazmishvili.corona.data.CovidData;
import ge.edu.btu.tsotne_mazmishvili.corona.models.Covid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CovidService {
    CovidData covidData = new CovidData();
    List<Covid> covids = CovidData.getCurrency();

    @WebMethod
    public List getStatistic(){
            return covids;
        }

    @WebMethod
    public Covid CountyStatistic(String country){
        for (int i = 0; i <= covids.size() - 1; i++) {
            Covid currentCountryCovid = covids.get(i);
            if(currentCountryCovid.getCountry().equals(country)){
                return currentCountryCovid;
            }
        }
        return null;
    }

    @WebMethod
    public int TotalConfirmed() {
        int result = 0;
        for (int i = 0; i <= covids.size() - 1; i++) {
            Covid currentCountryCovid = covids.get(i);
            result += currentCountryCovid.getConfirmed();
            }
        return result;
        }

    @WebMethod
    public int TotalDeathget() {
        int result = 0;
        for (int i = 0; i <= covids.size() - 1; i++) {
            Covid currentCountryCovid = covids.get(i);
            result += currentCountryCovid.getDeaths();
        }
        return result;
    }

    @WebMethod
    public int TotalRecoveryget() {
        int result = 0;
        for (int i = 0; i <= covids.size() - 1; i++) {
            Covid currentCountryCovid = covids.get(i);
            result += currentCountryCovid.getRecovered();
        }
        return result;
    }


}

