package demo_project.connection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import demo_project.model.Weather;
import demo_project.service.ApiConnectionService;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ApiConnection implements ApiConnectionService<Weather> {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        ApiConnection apiConnection = new ApiConnection();
        apiConnection.getConnection("2");
    }

    @Override
    public Weather getConnection(String val) {

        BufferedReader reader;
        try {
            URL url = new URL("https://api.weatherapi.com/v1/current.json?key=625e889ecc544af3a6d74305220712&q=" + val + "&aqi=no");
            URLConnection urlConnection = url.openConnection();
            reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
           return  gson.fromJson(reader, TypeToken.get(Weather.class));

        } catch (IOException e) {
           e.printStackTrace(System.out);
        }

      return null;
    }
}
