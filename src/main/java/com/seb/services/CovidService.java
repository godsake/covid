package com.seb.services;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CovidService implements ICovidService {

    // Capitale-Nationale, Bas-Saint-Laurent
    // Saguenay-Lac-Saint-Jean, Mauricie-et-Centre-du-Québec, Estrie, Montréal, 
    // Outaouais, Abitibi-Témiscamingue, Côte-Nord, Nord-du-Québec, 
    // Gaspésie-Îles-de-la-Madeleine, Chaudière-Appalaches, Laval,
    // Lanaudière, Laurentides, Montérégie
    public CovidResult getCovidResult(String region) throws Exception{
        String jsonStr = URLHelper.getUrlAsString(
                "https://s1.quebecormedia.com/infojdem/2020/c19d/data/data.json");

        JSONObject jsonObj = new JSONObject(jsonStr);
        JSONArray regions = (JSONArray)jsonObj.get("regions");
        
        for(int i = 0; i < regions.length(); i++){
            JSONObject jsonObj2 = new JSONObject(regions.get(i).toString());
            if (jsonObj2.getString("nom").equals(region.toString())){
                CovidResult result = new CovidResult();
                result.setNbrDeath(jsonObj2.getInt("décès"));
                result.setNbrInfected(jsonObj2.getInt("cas"));
                return result;
            }
        }
        
        return new CovidResult();
    }
}
