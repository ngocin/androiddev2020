package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import android.os.Bundle;
import android.util.Log;

import android.media.MediaPlayer;

public class WeatherActivity extends AppCompatActivity {
    private final String tag = "status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Create", "Call Create");

        PagerAdapter adapter = new WeatherAndForecastFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
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
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nhacthoitietcuchay);
        mediaPlayer.start();
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

