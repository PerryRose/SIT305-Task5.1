package com.example.task51;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    RecyclerView topDestinationsRecyclerView, placesToGoRecyclerView;
    TopDestinationsRecyclerViewAdapter topDestinationsRecyclerViewAdapter;
    PlacesToGoRecyclerViewAdapter placesToGoRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetUpTopDestinations();
        SetUpPlacesToGo();
    }

    @Override
    public void onBackPressed() {
        getSupportFragmentManager().popBackStack();
    }

    private void SetUpTopDestinations()
    {
        topDestinationsRecyclerView = findViewById(R.id.topDestinationsRecyclerView);
        topDestinationsRecyclerViewAdapter = new TopDestinationsRecyclerViewAdapter(new TopDestinations().GetDestinations(), this);
        topDestinationsRecyclerView.setAdapter(topDestinationsRecyclerViewAdapter);
        topDestinationsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void SetUpPlacesToGo()
    {
        placesToGoRecyclerView = findViewById(R.id.placesToGoRecyclerView);
        placesToGoRecyclerViewAdapter = new PlacesToGoRecyclerViewAdapter(new PlacesToGo().GetDestinations(), this);
        placesToGoRecyclerView.setAdapter(placesToGoRecyclerViewAdapter);
        placesToGoRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}