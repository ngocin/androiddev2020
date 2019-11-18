package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Create", "Call Create");
    // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
    // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Start", "Call Start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Resume ", "Call Resume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Pause", "Call Pase");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop", "Call Stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy", "Call Destroy");
    }
}

