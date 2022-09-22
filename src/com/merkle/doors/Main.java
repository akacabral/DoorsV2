package com.merkle.doors;

import com.merkle.doors.entity.Court;
import com.merkle.doors.entity.FireStation;
import com.merkle.doors.entity.PoliceStation;

public class Main {
    public static void main(String[] args) {
        final Integer amountOfDoors = 4;

        PoliceStation policeStation = new PoliceStation(amountOfDoors);
        FireStation fireStation = new FireStation(amountOfDoors);
        Court court = new Court(amountOfDoors);

        Possibilities possibilities = new Possibilities(policeStation.getPossibilities(), fireStation.getPossibilities(), court.getPossibilities());

        possibilities.toString();
    }
}