package com.seb.services;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonService implements IJsonService {
    
    public String getJson(Object obj) throws JsonParseException, Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }

    public <T extends Object> T parseJson(Class<T> clazz, String json) throws JsonParseException, Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, clazz);
    }
}
