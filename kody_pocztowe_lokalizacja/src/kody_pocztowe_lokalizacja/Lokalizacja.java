package kody_pocztowe_lokalizacja;

import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

public class Lokalizacja {
		
		public String ZlokalizujWspolrzedne ( String kod ){
			
			GeoApiContext context = new GeoApiContext.Builder().apiKey("AIzaSyDA7iWUrIA9sQdiyEwcCbdKsKzfXxMk__w").build();
			GeocodingResult[] results = null;
			
			try {
				results = GeocodingApi.geocode(context, kod).await();
			} 
			catch (ApiException e) {
					e.printStackTrace();
			} 
			catch (InterruptedException e) {
					e.printStackTrace();
			} 
			catch (IOException e) {
					e.printStackTrace();
			}
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String wynik = gson.toJson(results[0].geometry);
			
			return wynik;
		};
		
		
		public String ZlokalizujObszar( String kod ){
			
			GeoApiContext context = new GeoApiContext.Builder().apiKey("AIzaSyDA7iWUrIA9sQdiyEwcCbdKsKzfXxMk__w").build();
			GeocodingResult[] results = null;
			
			try {
				results = GeocodingApi.geocode(context, kod).await();
			} 
			catch (ApiException e) {
					e.printStackTrace();
			} 
			catch (InterruptedException e) {
					e.printStackTrace();
			} 
			catch (IOException e) {
					e.printStackTrace();
			}
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String wynik = gson.toJson(results[0].formattedAddress);
			
			return wynik;
		}
}
