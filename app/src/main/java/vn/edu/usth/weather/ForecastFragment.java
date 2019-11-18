package vn.edu.usth.weather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {
    public ForecastFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(0xFF1ed7e8);

        //practical work 4 start here
        LinearLayout fragment_container = view.findViewById(R.id.fragment_forecast);
        fragment_container.setOrientation(LinearLayout.VERTICAL);

        // add the button in fragment
        ImageView weather = new ImageView(getContext());
        weather.setImageResource(R.drawable.sun_cloud);

        TextView day = new TextView(getContext());
        day.setText("Thursday");
        day.setTextSize(34);
        day.setBackgroundColor(0xFF1ed7e8);
        day.setPadding(0, 10, 0, 10);

        fragment_container.addView(weather);
        fragment_container.addView(day);

        return view;
    }
}