package com.merkle.doors.entity;

import java.util.ArrayList;
import java.util.List;

public class FireStation {

    private List<Integer> possibilities;

    public FireStation(Integer amountOfDoors) {
        this.possibilities = new ArrayList<>();
        setPossibilities(amountOfDoors);
    }

    public List<Integer> getPossibilities() {
        return possibilities;
    }

    public void setPossibilities(Integer amountOfDoors) {
        here:
        for (int i = 1; i <= amountOfDoors; i++) {
            for (int j = 2; j <= amountOfDoors; j++) {
                if (i % j == 0 & i != j) {
                    continue here;
                }
            }
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
