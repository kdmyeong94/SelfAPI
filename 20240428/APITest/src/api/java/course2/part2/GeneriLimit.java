package api.java.course2.part2;

import api.java.model2.AverageCalculator;

public class GeneriLimit {
	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5};
		Double[] doubles = {1.0,2.0,3.0,4.0,5.0};
		
		AverageCalculator<Integer> integercalculator = new AverageCalculator<Integer>(integers);
		
		double integerAverage = integercalculator.calulateAverage();
		System.out.println(integerAverage);
		
		
		AverageCalculator<Double> doublescalculator = new AverageCalculator<Double>(doubles);
		
		double doubleAverage = integercalculator.calulateAverage();
		System.out.println(integerAverage);
		
	}
}
