package com.merkle.doors.entity;

import java.util.ArrayList;
import java.util.List;

public class PoliceStation {

    private List<Integer> possibilities;

    public PoliceStation(Integer amountOfDoors) {
        this.possibilities = new ArrayList<>();
        setPossibilities(amountOfDoors);
    }

    public List<Integer> getPossibilities() {
        return possibilities;
    }

    public void setPossibilities(Integer amountOfDoors) {
        for (int i = 2; i <= amountOfDoors; i+=2) {
            possibilities.add(i);
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < possibilities.size(); i++) {
            System.out.println(possibilities.get(i));
        }
        return null;
    }
}
