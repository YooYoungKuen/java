package openapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiExplorer2 {

    public static <T extends Object> T getApiJsonData(
            String serviceKey,
            String srcUrl,
            Class<T> dto) throws IOException, URISyntaxException {
        
        StringBuilder urlBuilder = new StringBuilder(srcUrl);
        urlBuilder.append("?"+URLEncoder.encode("serviceKey", "UTF-8")+"="+serviceKey);
        urlBuilder.append("&"+URLEncoder.encode("type", "UTF-8")+"="+URLEncoder.encode("json", "UTF-8"));
        
        System.out.println("URL:"+urlBuilder.toString());
        
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        
        ObjectMapper objectMapper = new ObjectMapper();
        T data = objectMapper.readValue(sb.toString(), dto);
        
        if (data != null) {
            System.out.println("******data:"+data.toString());
        }
                
        return data;
    }
}