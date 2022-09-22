package test.com.merkle.doors.entity;

import com.merkle.doors.Possibilities;
import com.merkle.doors.entity.FireStation;
import com.merkle.doors.entity.PoliceStation;
import org.junit.jupiter.api.Test;

import java.text.FieldPosition;

import static org.junit.jupiter.api.Assertions.*;

class PoliceStationTest {

    @Test
    void setPossibilitiesWithSmallAmount() {
        Integer amount = 5;
        PoliceStation policeStation = new PoliceStation(amount);

        Integer[] expected = {2,4};

        assertArrayEquals(expected, policeStation.getPossibilities().toArray(new Integer[0]));
    }

    @Test
    void setPossibilitiesWithMediumAmount() {
        Integer amount = 15;
        PoliceStation policeStation = new PoliceStation(amount);

        Integer[] expected = {2,4,6,8,10,12,14};

        assertArrayEquals(expected, policeStation.getPossibilities().toArray(new Integer[0]));
    }
}