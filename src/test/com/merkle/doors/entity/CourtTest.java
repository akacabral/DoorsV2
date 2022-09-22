package test.com.merkle.doors.entity;

import com.merkle.doors.entity.Court;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourtTest {

    @Test
    void setPossibilitiesWithSmallAmount() {
        Integer amount = 5;
        Court court = new Court(amount);

        Integer[] expected = {1,2,4,5};

        assertArrayEquals(expected, court.getPossibilities().toArray(new Integer[0]));
    }

    @Test
    void setPossibilitiesWithMediumAmount() {
        Integer amount = 15;
        Court court = new Court(amount);

        Integer[] expected = {1,2,4,5,6,7,8,9,10,11,12,14,15};

        assertArrayEquals(expected, court.getPossibilities().toArray(new Integer[0]));
    }

}