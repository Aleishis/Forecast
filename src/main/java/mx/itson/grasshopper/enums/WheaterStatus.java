/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.grasshopper.enums;

import com.google.gson.annotations.SerializedName;
import javax.print.attribute.standard.MediaSize;

/**
 *
 * @author alelo
 */
public enum WheaterStatus {
    
    @SerializedName("0")
    OTHER,
    @SerializedName("1")
    SUNNY,
    @SerializedName("2")
    SNOW,
    @SerializedName("3")
    CLOUDY,
    @SerializedName("4")
    RAINY
    
}
