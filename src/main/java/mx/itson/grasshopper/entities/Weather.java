/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.grasshopper.entities;

import java.util.List;
import mx.itson.grasshopper.enums.WheaterStatus;

/**
 *
 * @author alelo
 */
public class Weather {
    
    private String city;
    private int temperature;
    private int humidity;
    // @SerializedName("wind_speed")
    private int windSpeed;
    private List<Forecast> forecast;
    private WheaterStatus status;
    
    
}
