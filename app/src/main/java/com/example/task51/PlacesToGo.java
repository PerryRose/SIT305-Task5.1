package com.example.task51;

import java.util.LinkedList;

public class PlacesToGo {

    private LinkedList<Destination> placesToGo = new LinkedList<>();

    public PlacesToGo()
    {
        placesToGo.add(new Destination(1, "New Zealand", "Journey through New Zealand by land, rail and cruise. From alpine vistas of Queenstown to a cruise through the Milford Sound or a journey on the Tranzalpine Train.", R.drawable.new_zealand));
        placesToGo.add(new Destination(2, "Germany", "The bohemian streets of Berlin act as a fertile breeding ground for hip art, unique design and innovative ideas, while heritage-filled Munich boasts historic architecture. ", R.drawable.germany));
        placesToGo.add(new Destination(3, "Melbourne", "Lose yourself in a wonderland of colourful street art, al fresco cafes, intimate wine bars, and quirky boutiques – you never know what you’ll find just around the corner.", R.drawable.melbourne));
        placesToGo.add(new Destination(4, "Vietnam", "A land of staggering natural beauty and cultural complexities, of dynamic megacities and hill-tribe villages, Vietnam is both exotic and compelling.", R.drawable.vietnam));
        placesToGo.add(new Destination(5, "Fiji", "Spend your holiday in that magic place that sits between golden sands and sun-dappled waters and learn to embrace the alluring island lifestyle that moves to the rhythm of 'Fiji time'.", R.drawable.fiji));
        placesToGo.add(new Destination(6, "Canada", "Canada is more than its hulking-mountain, craggy-coast good looks: it also cooks extraordinary meals, rocks cool culture and unfurls wild, moose-spotting road trips.", R.drawable.canada));
    }

    public void AddDestination(Destination destination)
    {
        placesToGo.add(destination);
    }

    public LinkedList<Destination> GetDestinations()
    {
        return placesToGo;
    }

}
