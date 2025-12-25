package level_1;
public class EarthVolume {
	public static void main(String[] args) {
		double Radius_KM = 6378;
		double Volume_KM= (4/3)*Math.PI*Radius_KM*Radius_KM*Radius_KM;
		double Radius_Miles=Radius_KM/1.6;
		double Volume_Miles=(4/3)*Math.PI*Radius_Miles*Radius_Miles*Radius_Miles;
		 System.out.println("The volume of earth in cubic kilometers is " + Volume_KM +
	                " and cubic miles is " + Volume_Miles);
	}
}
