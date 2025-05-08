/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.grasshopper.entities;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import mx.itson.grasshopper.enums.WheaterStatus;
/**
 *
 * @author alelo
 */
public class Forecast {
 
    private Date day;
    @SerializedName("max_temperature")
    private int maxTemperature;
    @SerializedName("min_temperature")
    private int minTemperature;
    private WheaterStatus status;
    
}
