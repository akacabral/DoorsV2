package com.merkle.doors;

import java.util.ArrayList;
import java.util.List;

public class Possibilities {
    
    private List<Integer[]> possibilities;

    public Possibilities(List<Integer> policeStation, List<Integer> fireStation, List<Integer> court) {
        this.possibilities = new ArrayList<>();
        setPossibilities(policeStation, fireStation, court);
    }

    public List<Integer[]> getPossibilities() {
        return possibilities;
    }

    public void setPossibilities(List<Integer> policeStation, List<Integer> fireStation, List<Integer> court) {
        for (int i = 0; i < policeStation.size(); i++) {
            for (int j = 0; j < fireStation.size(); j++) {
                for (int k = 0; k < court.size(); k++) {
                    if (policeStation.get(i) != fireStation.get(j) &
                        policeStation.get(i) != court.get(k) &
                        fireStation.get(j) != court.get(k)){

                        Integer[] possibility = new Integer[3];
                        possibility[0] = policeStation.get(i);
                        possibility[1] = fireStation.get(j);
                        possibility[2] = court.get(k);

                        possibilities.add(possibility);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < possibilities.size(); i++) {
            System.out.println(possibilities.get(i)[0] + "; " + possibilities.get(i)[1] + "; " + possibilities.get(i)[2]);
        }
        System.out.println("Total : " + possibilities.size());
        return null;
    }
}
