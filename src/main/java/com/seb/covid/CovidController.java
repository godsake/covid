package com.seb.covid;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.seb.services.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CovidController {
    @Autowired()
    private ICovidService covidService;

    @RequestMapping(value = "/testJson", produces = "application/json; charset=utf-8")
    public String testJson() throws Exception, JsonProcessingException {
        CovidResult cr = new CovidResult();
        cr.setNbrDeath(111);
        cr.setNbrInfected(2000);
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(cr);
    }

    @RequestMapping("/covid")
	public String index(String region) throws Exception {

        if (region == null){
            return "<a href='/covid?region=Capitale-Nationale'>Capitale-Nationale</a><br/>"
            + "<a href='/covid?region=Bas-Saint-Laurent'>Bas-Saint-Laurent</a><br/>"
            + "<a href='/covid?region=Saguenay-Lac-Saint-Jean'>Saguenay-Lac-Saint-Jean</a><br/>"
            + "<a href='/covid?region=Mauricie-et-Centre-du-Québec'>Mauricie-et-Centre-du-Québec</a><br/>"
            + "<a href='/covid?region=Estrie'>Estrie</a><br/>"
            + "<a href='/covid?region=Montréal'>Montréal</a><br/>"
            + "<a href='/covid?region=Outaouais'>Outaouais</a><br/>"
            + "<a href='/covid?region=Abitibi-Témiscamingue'>Abitibi-Témiscamingue</a><br/>"
            + "<a href='/covid?region=Côte-Nord'>Côte-Nord</a><br/>"
            + "<a href='/covid?region=Nord-du-Québec'>Nord-du-Québec</a><br/>"
            + "<a href='/covid?region=Gaspésie-Îles-de-la-Madeleine'>Gaspésie-Îles-de-la-Madeleine</a><br/>"
            + "<a href='/covid?region=Chaudière-Appalaches'>Chaudière-Appalaches</a><br/>"
            + "<a href='/covid?region=Laval'>Laval</a><br/>"
            + "<a href='/covid?region=Lanaudière'>Lanaudière</a><br/>"
            + "<a href='/covid?region=Laurentides'>Laurentides</a><br/>"
            + "<a href='/covid?region=Montérégie'>Montérégie</a><br/>"
            + "<a href='/covid?region='></a><br/>";
        }


        CovidResult result = covidService.getCovidResult(region);

        return region + ": Cas: " + result.getNbrInfected() + 
                    " / Mort(s): " + result.getNbrDeath();
	}
}
