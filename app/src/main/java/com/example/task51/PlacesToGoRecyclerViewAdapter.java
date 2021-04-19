package com.example.task51;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class PlacesToGoRecyclerViewAdapter extends RecyclerView.Adapter<PlacesToGoRecyclerViewAdapter.ViewHolder> {

    private LinkedList<Destination> placesToGoList;
    private Context context;

    public PlacesToGoRecyclerViewAdapter(LinkedList<Destination> placesToGoList, Context context)
    {
        this.placesToGoList = placesToGoList;
        this.context = context;
    }

    @NonNull
    @Override
    public PlacesToGoRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.places_to_go_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesToGoRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(placesToGoList.get(position).GetImageID());
        holder.destinationNameTextView.setText(placesToGoList.get(position).GetName());
        holder.destinationDescriptionTextView.setText(placesToGoList.get(position).GetDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("destination_name", placesToGoList.get(position).GetName());
                bundle.putString("destination_description", placesToGoList.get(position).GetDescription());
                bundle.putInt("destination_image", placesToGoList.get(position).GetImageID());

                AppCompatActivity activity = (AppCompatActivity) context;

                activity.getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .add(R.id.fragmentContainerView, DestinationFragment.class, bundle)
                        .addToBackStack(null)
                        .commit();


            }
        });

    }

    @Override
    public int getItemCount() {
        return placesToGoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView destinationNameTextView, destinationDescriptionTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.placesToGoImageView);
            destinationNameTextView = itemView.findViewById(R.id.placesToGoNameTextView);
            destinationDescriptionTextView = itemView.findViewById(R.id.placesToGoDescriptionTextView);
        }

    }
}
