package week_2;
public class TemperaturAnalyzer {
	static void analyzeTemperature(float[][] temp) {
		float hottestavg = temp[0][0];
		float coldestavg = temp[0][0];
		int hottestDay = 0;
		int coldestDay = 0;	
		for(int day=0;day<7;day++) {
			float sum = 0;
			for(int hour=0; hour<24; hour++) {
				sum += temp[day][hour];
			}
			float avg = sum/24;
			System.out.println("Average temperature of day " + (day + 1) + " = " + avg );
			if(avg>hottestavg) {
				hottestavg=avg;
				hottestDay=day;
			}
			if(avg<coldestavg) {
				coldestavg = avg;
				coldestDay = day;
			}
		}
		System.out.println("Hottest Day: " + (hottestDay+1));
		System.out.println("Coldest Day: " + (coldestDay+1));	
	}
	public static void main(String[] args) {
		float[][] temperature = new float[7][24];
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 24; j++) {
				temperature[i][j] = 20 + (float)(Math.random() * 15);
			}
		}
		analyzeTemperature(temperature);
	}
}
