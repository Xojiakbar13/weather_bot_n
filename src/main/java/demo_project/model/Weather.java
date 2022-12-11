package demo_project.model;

import com.google.gson.annotations.SerializedName;

public class Weather{

	@SerializedName("current")
	private Current current;

	@SerializedName("location")
	private Location location;

	@Override
	public String toString() {
		return "Weather{" +
				"current=" + current +
				", location=" + location +
				'}';
	}

	public Current getCurrent() {
		return current;
	}

	public Location getLocation() {
		return location;
	}
}