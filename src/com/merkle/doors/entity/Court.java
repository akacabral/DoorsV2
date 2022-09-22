package com.merkle.doors.entity;

import java.util.ArrayList;
import java.util.List;

public class Court {

    private List<Integer> possibilities;

    public Court(Integer amountOfDoors) {
        this.possibilities = new ArrayList<>();
        setPossibilities(amountOfDoors);
    }

    public List<Integer> getPossibilities() {
        return possibilities;
    }

    public void setPossibilities(Integer amountOfDoors) {
        for (int i = 1; i <= amountOfDoors; i++) {
            if (i%10 != 3){
                possibilities.add(i);
            }
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
