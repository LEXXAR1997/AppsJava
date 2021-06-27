package com.lexxar.spiderman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class spiderman {

	private static final String HTTPS_URL = "https://jsonmock.hackerrank.com/api/movies/search/";
	private static final String TITLE = "spiderman";
	private static final Integer INITIAL_PAGE = 1;
	
	public static void main(String[] args) {
		int cont = 0;
		
		do {
			URL url = null;
			HttpsURLConnection connection = null;
			
			try {
				url = new URL(HTTPS_URL+"?Title="+TITLE+"&page="+(INITIAL_PAGE+cont));
				connection = (HttpsURLConnection) url.openConnection();
			} catch (MalformedURLException e) {
				e.printStackTrace();
				return;
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			try (InputStream inputStream = connection.getInputStream();
				InputStreamReader isr = new InputStreamReader(inputStream);
				BufferedReader br = new BufferedReader(isr);) {
				
				StringBuilder sb = new StringBuilder();
				
				br.lines().forEach(x -> sb.append(x));
				
				JSONParser parser = new JSONParser(); 
				
				JSONObject json = (JSONObject) parser.parse(sb.toString());
				
				JSONArray array = (JSONArray) json.get("data");
				
				if(array.isEmpty()) {
					break;
				}
				array.forEach(x -> ShowMovies((JSONObject)x));
				
				array.clear();
				json.clear();
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			cont++;
			
		}while(true);
	}
	
	private static void ShowMovies(JSONObject dataJSON) {
		System.out.println("Title: "+dataJSON.get("Title")+" | "+"Year: "+dataJSON.get("Year")+ " | "+"imdbID: "+dataJSON.get("imdbID"));
	}

}
