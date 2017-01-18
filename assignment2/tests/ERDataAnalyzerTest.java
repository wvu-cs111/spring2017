package er_data_tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import er_data.ERDataAnalyzer;
import er_data.ERDataReader;

public class ERDataAnalyzerTest {

	private static int[][][] TEST_DATA = null;
	
	/*
	 * First, make sure your readData method is functioning by running the ERDataReaderTest.java file.
	 * Once you readData method is working, implement the remaining tests using the testPatientsPerWeek template.
	 * As you implement the tests, you can run this file and validate your ERDataAnalyzer methods.
	 *  
	 * If your methods are not working, insert breakpoints into the malfunctioning method, and run this file in 
	 * Debug mode (click to the Debug button to the left of the Run button).
	 */
	@Before
	public void setUp() throws Exception {
		String DATA_FILE = "data/data1.txt";
		TEST_DATA = ERDataReader.readData(DATA_FILE);
	}
	
	/*
	 * Example test method.  This method tests ERDataAnalyzer.patientsPerWeek() method.
	 */
	@Test
	public void testPatientsPerWeek() {
		// The correct answers can be copied from the assignment 2 instructions on github.
		int[] expecteds = {3118, 2746, 2921, 2676};
		int[] actuals = ERDataAnalyzer.patientsPerWeek(TEST_DATA);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testPatientsPerDayPerWeek() {
		fail("Not yet implemented");
	}

	@Test
	public void testAveragePatientsPerWeek() {
		fail("Not yet implemented");
	}

	@Test
	public void testAveragePatientsPerDayAcrossWeeks() {
		fail("Not yet implemented");
	}

	@Test
	public void testBusiestDayPerWeek() {
		fail("Not yet implemented");
	}

	@Test
	public void testLeastBusyDayPerWeek() {
		fail("Not yet implemented");
	}

}
