package uk.co.philanderson;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
    @org.junit.Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.DeadFishMethod("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.DeadFishMethod("iiisdosodddddiso"));
    }
}