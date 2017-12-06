package java_6;

public class sum_cal {
	int sum1(int[]value) {
		int sum = 0;
		 int i;
 for (i=0; i< value.length; i++) {
	 sum += value[i];
	 
 }
	return sum;
	}
	
	
	int sum2(int[]value) {
		int sum = 0;
		int i;
		for (i=0; i< value.length; i++) {
			sum += value[i];
	}
		return sum;
	}
	
}
