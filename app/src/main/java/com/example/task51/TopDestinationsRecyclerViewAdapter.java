package com.example.task51;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class TopDestinationsRecyclerViewAdapter extends RecyclerView.Adapter<TopDestinationsRecyclerViewAdapter.ViewHolder>
{

    private LinkedList<Destination> destinationsList;
    private Context context;

    public TopDestinationsRecyclerViewAdapter(LinkedList<Destination> destinationsList, Context context)
    {
        this.destinationsList = destinationsList;
        this.context = context;
    }

    @NonNull
    @Override
    public TopDestinationsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.top_destinations_row, parent, false);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull TopDestinationsRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(destinationsList.get(position).GetImageID());
    }

    @Override
    public int getItemCount() {
        return destinationsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
