package test.com.merkle.doors.entity;

import com.merkle.doors.entity.Court;
import com.merkle.doors.entity.FireStation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FireStationTest {

    @Test
    void setPossibilitiesWithSmallAmount() {
        Integer amount = 5;
        FireStation fireStation = new FireStation(amount);

        Integer[] expected = {1,2,3,5};

        assertArrayEquals(expected, fireStation.getPossibilities().toArray(new Integer[0]));
    }

    @Test
    void setPossibilitiesWithMediumAmount() {
        Integer amount = 15;
        FireStation fireStation = new FireStation(amount);

        Integer[] expected = {1,2,3,5,7,11,13};

        assertArrayEquals(expected, fireStation.getPossibilities().toArray(new Integer[0]));
    }
}