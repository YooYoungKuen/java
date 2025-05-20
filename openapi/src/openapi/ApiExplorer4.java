package openapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiExplorer4 {

	public static <T> T getApiJsonData(String serviceKey, String srcUrl, Class<T> dto) throws IOException, URISyntaxException {
	    StringBuilder urlBuilder = new StringBuilder(srcUrl);
	    urlBuilder.append("?serviceKey=").append(serviceKey);
	    urlBuilder.append("&pageNo=1");
	    urlBuilder.append("&numOfRows=10");
	    urlBuilder.append("&ctpv_nm=").append(URLEncoder.encode("충남", "UTF-8"));
	    urlBuilder.append("&sgg_nm=").append(URLEncoder.encode("천안시", "UTF-8"));
	    urlBuilder.append("&resultType=json");

	    System.out.println("URL:" + urlBuilder);

	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        System.out.println("Response code: " + conn.getResponseCode());

	        BufferedReader rd;
	        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
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

	        // JSON 파싱
	        ObjectMapper objectMapper = new ObjectMapper();
	        T data = objectMapper.readValue(sb.toString(), dto);

	        if (data != null) {
	            System.out.println("****** data: " + data.toString());
	        }

	        return data;
	}

  }