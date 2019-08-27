/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kasus;

import org.junit.Test;

import kasus.ClassesAndObject.Bicycle;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    private static Bicycle classUnderTest = new Bicycle(10, 20, 30);
    
    @Test public void testBicycleGetCadence() {
        
        assertEquals(10, classUnderTest.getCadence());
    }

    @Test
    public void testBicycleHasSpeed() {

        //assertNotNull(classUnderTest.getSpeed());
        assertEquals(20, classUnderTest.getSpeed());
    }

    @Test
    public void testBicycleGetGear() {

        assertEquals(30, classUnderTest.getGear());
    }

    @Test
    public void testBicycleGetId() {

        assertEquals(1, classUnderTest.getID());
    }    
    
    @Test
    public void testBicycleGetNumberOfBicycle() {

        Bicycle b1 = new Bicycle(21, 122, 334);
        Bicycle b2 = new Bicycle(2231, 122, 334);
        Bicycle b3 = new Bicycle(21, 122, 334);
        assertEquals(4, classUnderTest.getNumberOfBicycles(), "it should show 4 because 1 object at the top and 3 object right here");
    }

    

    @Test
    public void testBicycleSpeedUp() {

        classUnderTest.speedUp(100);
        assertEquals(110, classUnderTest.getSpeed(), "the gear should return an integer value of 100");
    }

    @Test
    public void testBicycleApplyBrake() {

        classUnderTest.applyBrake(10);
        assertEquals(10, classUnderTest.getSpeed());
    }

}
