package org.launchcode.techjobs_oo.Tests;


import org.jetbrains.annotations.Contract;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;


public class JobTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSettingJobId() {
        assertEquals();
        assertTrue();

    }

    private void assertTrue() {

    }

    @Contract(pure = true)
    private void assertEquals() {

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
}
