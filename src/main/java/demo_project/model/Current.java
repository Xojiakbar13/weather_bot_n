package demo_project.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.asif.gsonpojogenerator")
public class Current{

	@SerializedName("cloud")
	private int cloud;

	@SerializedName("feelslike_c")
	private double feelslikeC;

	@SerializedName("uv")
	private double uv;

	@SerializedName("last_updated")
	private String lastUpdated;

	@SerializedName("condition")
	private Condition condition;

	@SerializedName("wind_mph")
	private double windMph;

	@SerializedName("vis_km")
	private double visKm;

	@SerializedName("is_day")
	private int isDay;

	@SerializedName("humidity")
	private int humidity;

	@SerializedName("gust_mph")
	private double gustMph;

	@SerializedName("temp_c")
	private double tempC;

	@SerializedName("pressure_mb")
	private double pressureMb;

	public int getCloud(){
		return cloud;
	}

	public double getFeelslikeC(){
		return feelslikeC;
	}

	public double getUv(){
		return uv;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public Condition getCondition(){
		return condition;
	}

	public double getWindMph(){
		return windMph;
	}

	public double getVisKm(){
		return visKm;
	}

	public int getIsDay(){
		return isDay;
	}

	public int getHumidity(){
		return humidity;
	}

	public double getGustMph(){
		return gustMph;
	}

	public double getTempC(){
		return tempC;
	}

	public double getPressureMb(){
		return pressureMb;
	}

	@Override
 	public String toString(){
		return 
			"Current{" + 
			"cloud = '" + cloud + '\'' + 
			",feelslike_c = '" + feelslikeC + '\'' + 
			",uv = '" + uv + '\'' + 
			",last_updated = '" + lastUpdated + '\'' + 
			",condition = '" + condition + '\'' + 
			",wind_mph = '" + windMph + '\'' + 
			",vis_km = '" + visKm + '\'' + 
			",is_day = '" + isDay + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",gust_mph = '" + gustMph + '\'' + 
			",temp_c = '" + tempC + '\'' + 
			",pressure_mb = '" + pressureMb + '\'' + 
			"}";
		}
}