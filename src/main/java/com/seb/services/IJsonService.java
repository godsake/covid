package com.seb.services;

import com.fasterxml.jackson.core.JsonParseException;

public interface IJsonService {
    public String getJson(Object obj) throws JsonParseException, Exception;
    public <T extends Object> T parseJson(Class<T> clazz, String json) throws JsonParseException, Exception;
}
