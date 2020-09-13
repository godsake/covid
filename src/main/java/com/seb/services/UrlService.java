package com.seb.services;

import java.net.*;
import java.io.*;

public class UrlService implements IUrlService {
    public String getUrlAsString(String url) throws Exception{
        URL oracle = new URL(url);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        StringBuffer sb = new StringBuffer();
        while ((inputLine = in.readLine()) != null)
            sb.append(inputLine);
        in.close();

        return sb.toString();
    }
}
