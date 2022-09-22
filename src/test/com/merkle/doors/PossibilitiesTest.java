package test.com.merkle.doors;

import com.merkle.doors.Possibilities;
import com.merkle.doors.entity.Court;
import com.merkle.doors.entity.FireStation;
import com.merkle.doors.entity.PoliceStation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PossibilitiesTest {

    @Test
    void setPossibilities() {
        Integer amount = 4;
        PoliceStation policeStation = new PoliceStation(amount);
        FireStation fireStation = new FireStation(amount);
        Court court = new Court(amount);

        Possibilities possibilities = new Possibilities(policeStation.getPossibilities(), fireStation.getPossibilities(), court.getPossibilities());

        Integer[][] expected = {{2,1,4},{2,3,1},{2,3,4},{4,1,2},{4,2,1},{4,3,1},{4,3,2}};

        assertArrayEquals(expected, possibilities.getPossibilities().toArray(new Integer[0][]));
    }
}