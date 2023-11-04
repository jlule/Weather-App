package com.example.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {
    @GET("weather?lat=51.5287352&lon=-0.3817841&appid=fa31d543057128699f8908f8cd129d9c&units=metric")
    Call<OpenWeathwerMap> getWeatherWithLocation(@Query("lat")double lat, @Query("lon") double lon);


    @GET("weather?lat=51.5287352&lon=-0.3817841&appid=fa31d543057128699f8908f8cd129d9c&units=metric")
    Call<OpenWeathwerMap> getWeatherWithCityName(@Query("q")String name);

}
