package com.haobi.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Weather> weatherList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWeather();//初始化天气数据
        WeatherAdapter adapter = new WeatherAdapter(MainActivity.this, R.layout.weather_item, weatherList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        //为ListView添加点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Weather weather = weatherList.get(position);
                Toast.makeText(MainActivity.this, weather.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initWeather(){
        Weather i_100 = new Weather("Sunny", R.drawable.i_100_sunny);
        weatherList.add(i_100);
        Weather i_101 = new Weather("Cloudy", R.drawable.i_101_cloudy);
        weatherList.add(i_101);
        Weather i_102 = new Weather("Few Clouds", R.drawable.i_102_few_clouds);
        weatherList.add(i_102);
        Weather i_103 = new Weather("Partly Cloudy", R.drawable.i_103_partly_cloudy);
        weatherList.add(i_103);
        Weather i_104 = new Weather("Overcast", R.drawable.i_104_overcast);
        weatherList.add(i_104);
        Weather i_200 = new Weather("Windy", R.drawable.i_200_windy);
        weatherList.add(i_200);
        Weather i_201 = new Weather("Calm", R.drawable.i_201_calm);
        weatherList.add(i_201);
        Weather i_202 = new Weather("Light Breeze", R.drawable.i_202_light_breeze);
        weatherList.add(i_202);
        Weather i_203 = new Weather("Moderate", R.drawable.i_203_moderate);
        weatherList.add(i_203);
        Weather i_204 = new Weather("Fresh Breeze", R.drawable.i_204_fresh_breeze);
        weatherList.add(i_204);
        Weather i_205 = new Weather("Strong Breeze", R.drawable.i_205_strong_breeze);
        weatherList.add(i_205);
        Weather i_206 = new Weather("High Wind", R.drawable.i_206_high_wind);
        weatherList.add(i_206);
        Weather i_207 = new Weather("Gale", R.drawable.i_207_gale);
        weatherList.add(i_207);
        Weather i_208 = new Weather("Strong Gale", R.drawable.i_208_strong_gale);
        weatherList.add(i_208);
        Weather i_209 = new Weather("Storm", R.drawable.i_209_storm);
        weatherList.add(i_209);
        Weather i_210 = new Weather("Violent Storm", R.drawable.i_210_violent_storm);
        weatherList.add(i_210);
        Weather i_211 = new Weather("Hurricane", R.drawable.i_211_hurricane);
        weatherList.add(i_211);
        Weather i_212 = new Weather("Tornado", R.drawable.i_212_tornado);
        weatherList.add(i_212);
        Weather i_213 = new Weather("Tropical Storm", R.drawable.i_213_tropical_storm);
        weatherList.add(i_213);
        Weather i_300 = new Weather("Shower Rain", R.drawable.i_300_shower_rain);
        weatherList.add(i_300);
        Weather i_301 = new Weather("Heavy Shower Rain", R.drawable.i_301_heavy_shower_rain);
        weatherList.add(i_301);
        Weather i_302 = new Weather("Thundershower", R.drawable.i_302_thundershower);
        weatherList.add(i_302);
        Weather i_303 = new Weather("Heavy Thunderstorm", R.drawable.i_303_heavy_thunderstorm);
        weatherList.add(i_303);
        Weather i_304 = new Weather("Thundershower with hail", R.drawable.i_304_thundershower_with_hail);
        weatherList.add(i_304);
        Weather i_305 = new Weather("Light Rain", R.drawable.i_305_light_rain);
        weatherList.add(i_305);
        Weather i_306 = new Weather("Moderate Rain", R.drawable.i_306_moderate_rain);
        weatherList.add(i_306);
        Weather i_307 = new Weather("Heavy Rain", R.drawable.i_307_heavy_rain);
        weatherList.add(i_307);
        Weather i_308 = new Weather("Extreme Rain", R.drawable.i_308_extreme_rain);
        weatherList.add(i_308);
        Weather i_309 = new Weather("Drizzle Rain", R.drawable.i_309_drizzle_rain);
        weatherList.add(i_309);
        Weather i_310 = new Weather("Storm", R.drawable.i_310_storm);
        weatherList.add(i_310);
        Weather i_311 = new Weather("Heavy Storm", R.drawable.i_311_heavy_storm);
        weatherList.add(i_311);
        Weather i_312 = new Weather("Severe Storm", R.drawable.i_312_severe_storm);
        weatherList.add(i_312);
        Weather i_313 = new Weather("Freezing Rain", R.drawable.i_313_freezing_rain);
        weatherList.add(i_313);
        Weather i_314 = new Weather("Light to moderate rain", R.drawable.i_314_light_to_moderate_rain);
        weatherList.add(i_314);
        Weather i_315 = new Weather("Moderate to heavy rain", R.drawable.i_315_moderate_to_heavy_rain);
        weatherList.add(i_315);
        Weather i_316 = new Weather("Heavy rain to storm", R.drawable.i_316_heavy_rain_to_storm);
        weatherList.add(i_316);
        Weather i_317 = new Weather("Storm to heavy storm", R.drawable.i_317_storm_to_heavy_storm);
        weatherList.add(i_317);
        Weather i_318 = new Weather("Heavy to severe storm", R.drawable.i_318_heavy_to_server_storm);
        weatherList.add(i_318);
        Weather i_399 = new Weather("Rain", R.drawable.i_399_rain);
        weatherList.add(i_399);
        Weather i_400 = new Weather("Light Snow", R.drawable.i_400_light_snow);
        weatherList.add(i_400);
        Weather i_401 = new Weather("Moderate Snow", R.drawable.i_401_moderate_snow);
        weatherList.add(i_401);
        Weather i_402 = new Weather("Heavy Snow", R.drawable.i_402_heavy_snow);
        weatherList.add(i_402);
        Weather i_403 = new Weather("Snowstorm", R.drawable.i_403_snowstorm);
        weatherList.add(i_403);
        Weather i_404 = new Weather("Sleet", R.drawable.i_404_sleet);
        weatherList.add(i_404);
        Weather i_405 = new Weather("Rain And Snow", R.drawable.i_405_rain_and_snow);
        weatherList.add(i_405);
        Weather i_406 = new Weather("Shower Snow", R.drawable.i_406_shower_snow);
        weatherList.add(i_406);
        Weather i_407 = new Weather("Snow Flurry", R.drawable.i_407_snow_flurry);
        weatherList.add(i_407);
        Weather i_408 = new Weather("Light to moderate snow", R.drawable.i_408_light_to_moderate_snow);
        weatherList.add(i_408);
        Weather i_409 = new Weather("Moderate to heavy snow", R.drawable.i_409_moderate_to_heavy_snow);
        weatherList.add(i_409);
        Weather i_410 = new Weather("Heavy snow to snowstorm", R.drawable.i_410_heavy_snow_to_snowstorm);
        weatherList.add(i_410);
        Weather i_499 = new Weather("Snow", R.drawable.i_499_snow);
        weatherList.add(i_499);
        Weather i_500 = new Weather("Mist", R.drawable.i_500_mist);
        weatherList.add(i_500);
        Weather i_501 = new Weather("Foggy", R.drawable.i_501_foggy);
        weatherList.add(i_501);
        Weather i_502 = new Weather("Haze", R.drawable.i_502_haze);
        weatherList.add(i_502);
        Weather i_503 = new Weather("Sand", R.drawable.i_503_sand);
        weatherList.add(i_503);
        Weather i_504 = new Weather("Dust", R.drawable.i_504_dust);
        weatherList.add(i_504);
        Weather i_507 = new Weather("Duststorm", R.drawable.i_507_duststorm);
        weatherList.add(i_507);
        Weather i_508 = new Weather("Sandstorm", R.drawable.i_508_sandstorm);
        weatherList.add(i_508);
        Weather i_509 = new Weather("Dense fog", R.drawable.i_509_dense_fog);
        weatherList.add(i_509);
        Weather i_510 = new Weather("Strong fog", R.drawable.i_510_strong_fog);
        weatherList.add(i_510);
        Weather i_511 = new Weather("Moderate haze", R.drawable.i_511_moderate_haze);
        weatherList.add(i_511);
        Weather i_512 = new Weather("Heavy haze", R.drawable.i_512_heavy_haze);
        weatherList.add(i_512);
        Weather i_513 = new Weather("Severe haze", R.drawable.i_513_severe_haze);
        weatherList.add(i_513);
        Weather i_514 = new Weather("Heavy fog", R.drawable.i_514_heavy_fog);
        weatherList.add(i_514);
        Weather i_515 = new Weather("Extra heavy fog", R.drawable.i_515_extra_heavy_fog);
        weatherList.add(i_515);
        Weather i_900 = new Weather("Hot", R.drawable.i_900_hot);
        weatherList.add(i_900);
        Weather i_901 = new Weather("Cold", R.drawable.i_901_cold);
        weatherList.add(i_901);
        Weather i_999 = new Weather("Unknown", R.drawable.i_999_unknown);
        weatherList.add(i_999);
    }
}
