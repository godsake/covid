package com.seb.covid;

import org.json.JSONArray;
import org.json.JSONObject;

public class CovidService implements ICovidService {
    public CovidResult getCovidResult(CovidRegionEnum region) throws Exception{
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
