package cl.jav.desafiosimpleweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import cl.jav.desafiosimpleweather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        DailyWeather clima=new DailyWeather("Santiago","24/11/2020","25",getDrawable(R.drawable.ic_baseline_wb_sunny_24));
        binding.setClimaDiario(clima);
        binding.imgClima.setImageDrawable(clima.getImagenClima());
    }
}