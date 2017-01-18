package er_data;


public class ERDataAnalyzer {
	
	
	/** 
	 * If you find yourself writing the same code over and over, 
	 * consider creating a private method which you can call instead.
	 */
	
	// private methods here

	/**
	 * Returns the total number of patients for each week
	 * 
	 * @param data	a 3-d integer array corresponding to the number of visitations. 
	 * 				1st dimension corresponds to the week, 2nd dimension the day, 3rd dimension the hour 				
	 * @return 		an 1-d integer array of weekly totals
	 */
	public static int[] patientsPerWeek(int[][][] data) {
		
	}
	
	/**
	 * Returns the total number of visits for each day, for each week.
	 * 
	 * @param data	
	 * @return		2-d integer array of daily totals. 1st dimension is the week, 2nd is the day
	 */
	public static int[][] patientsPerDayPerWeek(int[][][] data) {
		
	}
	
	/**
	 * Returns the average number of patients seen in a day for each week.
	 * For example, given the following two weeks of daily visitations:
	 * 
	 * twoWeekDailyTotals = [[10, 10, 10, 15, 20, 20 20], [20, 20, 20, 30, 40, 40, 40]]
	 * assert averagePatientsPerWeek(twoWeekDailyTotals) == [15.0, 30.0]
	 * 
	 * @param data
	 * @return 		1-d double array of the average number of daily patients for each week
	 */
	public static double[] averagePatientsPerWeek(int[][][] data) {
		
	}
	
	/**
	 * Returns the average number of patients seen on Sundays, Mondays, Tuesdays, etc. 
	 * over an n week period.
	 * 
	 * @param data
	 * @return 		a 1-d double array of daily average visitations
	 * 				where the 1st dimension corresponds to the day
	 */
	public static double[] averagePatientsPerDayAcrossWeeks(int[][][] data) {
		
	}
	
	/**
	 * Returns an array of integers indexing the busiest day (most visits)
	 * of the week, for each week. For example, if the daily total visits
	 * over a two week period are:
	 * 
	 * twoWeekDailyTotals = [[10, 50, 20, 15, 30, 9 25], [20, 30, 60, 60, 10, 15, 5]]
	 * assert busiestDayPerWeek(twoWeekDailyTotals) == [1,  2]
	 * (In case of ties, just choose one of the busiest days)
	 * 
	 * 
	 * @param data
	 * @return		1-d integer array of array indices indicating, for each
	 *              week, the (or one of the) day(s) with the most visits 
	 */
	public static int[] busiestDayPerWeek(int[][][] data) {
		
	}
	
	/**
	 * Returns an array of integers indexing the least busy day (fewest visits)
	 * of the week, for each week.
	 * 
	 * @param data
	 * @return		1-d integer array of array indices indicating, for each
	 * 				week, the (or one of the) day(s) with the fewest visits 
	 */
	public static int[] leastBusyDayPerWeek(int[][][] data) {
		
	}
}