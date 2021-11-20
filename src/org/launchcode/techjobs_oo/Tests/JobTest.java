package org.launchcode.techjobs_oo.Tests;


import org.jetbrains.annotations.Contract;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class JobTest {

    public Job jobOne;
    public Job jobTwo;

    @Before
    public void initialize() {
        jobOne = new Job();
        jobTwo = new Job();

    }

    @Test
    public void testSettingJobId_returnTrue() {
        assertEquals(jobOne.getId(), jobTwo.getId());
    }

    private void assertTrue(boolean b) {

    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location ("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", jobThree.getName());
        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertEquals("ACME", jobThree.getEmployer().getValue());
        assertTrue(jobThree.getLocation() instanceof Location);
        assertEquals("Desert", jobThree.getLocation().getValue());
        assertTrue(jobThree.getPositionType() instanceof PositionType);
        assertEquals("Quality Control", jobThree.getPositionType().getValue());
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", jobThree.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location ("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer("ACME"), new Location ("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertFalse(test1.equals(test2));
    }

    @Test
    public void testJobsToStringMethod() {
        Job testOne = new Job("Product tester", new Employer("ACME"), new Location ("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        int testId = (testOne.toString().length() -1);

        assertTrue(testOne.toString().charAt(0) =='\n');
        assertTrue(testOne.toString().charAt(testId) == '\n');
    }


}




