package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringHandlesEmptyField() {
        String expectedOutput = "\nID: 3\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n";
        Job job1 = new Job();
        assertEquals(job1.toString(), expectedOutput);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String expectedOutput = "\nID: 4\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n";
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job1.toString(), expectedOutput);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        //String startAndEndText = "\n";
        char startAndEndChar = '\n';
        Job job1 = new Job();
        //  assertTrue(job1.toString().startsWith(startAndEndText));
        // assertTrue(job1.toString().endsWith(startAndEndText));
        assertEquals(job1.toString().charAt(0), startAndEndChar);
        assertEquals(job1.toString().charAt(job1.toString().length()-1), startAndEndChar);
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() != null);
        assertEquals(false, job1.getCoreCompetency() == null);

        assertEquals(job1.getName(), "Product tester");
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(),job2.getId());
    }
}