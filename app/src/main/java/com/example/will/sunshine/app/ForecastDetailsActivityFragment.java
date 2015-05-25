package com.example.will.sunshine.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastDetailsActivityFragment extends Fragment {

    public ForecastDetailsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Intent intent = getActivity().getIntent();
        View rootView = inflater.inflate(R.layout.fragment_forecast_details, container, false);

        if (intent != null && intent.hasExtra("DAY_DETAILS")) {
            String dayDetails = intent.getExtras().getString("DAY_DETAILS");
            ((TextView) rootView.findViewById(R.id.textview_forecast_details))
                    .setText(dayDetails);
        }

        return rootView;
    }
}
