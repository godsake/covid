package com.seb.services;

import java.net.*;
import java.io.*;

public class UrlService implements IUrlService {
    public String getUrlAsString(String url) throws Exception{
        URL anUrl = new URL(url);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(anUrl.openStream()));

        String inputLine;
        StringBuffer sb = new StringBuffer();
        while ((inputLine = in.readLine()) != null)
            sb.append(inputLine);
        in.close();

        return sb.toString();
    }
}
