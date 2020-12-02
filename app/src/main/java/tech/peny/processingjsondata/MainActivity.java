package tech.peny.processingjsondata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   String c = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=2cac2a2f1a4907ada47ba637b9c3686f";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}