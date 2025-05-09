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

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public WheaterStatus getStatus() {
        return status;
    }

    public void setStatus(WheaterStatus status) {
        this.status = status;
    }
 
    private Date day;
    @SerializedName("max_temperature")
    private int maxTemperature;
    @SerializedName("min_temperature")
    private int minTemperature;
    private WheaterStatus status;
    
}
