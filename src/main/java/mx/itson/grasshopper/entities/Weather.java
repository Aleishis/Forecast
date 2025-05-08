/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.grasshopper.entities;

import java.util.List;
import mx.itson.grasshopper.enums.WheaterStatus;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Alexis
 */
public class Weather {

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public WheaterStatus getStatus() {
        return status;
    }

    public void setStatus(WheaterStatus status) {
        this.status = status;
    }
    
    private String city;
    private int temperature;
    private int humidity;
    @SerializedName("wind_speed")
    private int windSpeed;
    private List<Forecast> forecast;
    private WheaterStatus status;
    
    
    /**
     * Deserializa un json convertido a string
     * @param json : Archivo json convertido a String
     * @return : Un objeto tipo Weather con atributos asugnados del json
     */
    public static Weather deserialize(String json){
        Weather w = new Weather();
        
        try{
            Gson gson = new Gson();
            w = gson.fromJson(json, Weather.class);
            
            
        } catch (Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }
        return w;
    }
    
}
