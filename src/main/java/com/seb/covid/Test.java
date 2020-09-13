package com.seb.covid;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class Test {

    public static void main(String[] args) throws Exception {
        String jsonStr = URLHelper.getUrlAsString(
                "https://s1.quebecormedia.com/infojdem/2020/c19d/data/data.json");
        //System.out.println(jsonStr);

        JSONObject jsonObj = new JSONObject(jsonStr);
        JSONArray regions = (JSONArray)jsonObj.get("regions");
        
        for(int i = 0; i < regions.length(); i++){
            JSONObject jsonObj2 = new JSONObject(regions.get(i).toString());
            System.out.println(jsonObj2.getInt("cas")+"@@@");
        }

        
         
	}
}
