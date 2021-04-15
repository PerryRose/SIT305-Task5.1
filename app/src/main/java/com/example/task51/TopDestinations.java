package com.example.task51;

import java.util.LinkedList;

public class TopDestinations {

    private LinkedList<Destination> destinations = new LinkedList<>();

    public TopDestinations()
    {
        destinations.add(new Destination(1, "Bali", "Description", R.drawable.bali));
        destinations.add(new Destination(2, "Japan", "Description", R.drawable.japan));
        destinations.add(new Destination(3, "London", "Description", R.drawable.london));
        destinations.add(new Destination(4, "New York", "Description", R.drawable.new_york));
        destinations.add(new Destination(5, "Paris", "Description", R.drawable.paris));
        destinations.add(new Destination(6, "South Korea", "Description", R.drawable.south_korea));
    }

    public void AddDestination(Destination destination)
    {
        destinations.add(destination);
    }

    public LinkedList<Destination> GetDestinations()
    {
        return destinations;
    }

}
