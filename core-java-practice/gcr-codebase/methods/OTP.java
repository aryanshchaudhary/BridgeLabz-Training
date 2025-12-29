package level_3;
import java.util.*;
public class OTP {
	static int genOTP() {
		return (int)(100000 + Math.random()*900000);
	}
	static boolean isUnique(int[] otps) {
		for(int i=0; i<otps.length;i++) {
			for(int j=i+1;j<otps.length;j++) {
				if(otps[i] == otps[j])
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] otps = new int[10];
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = genOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        System.out.println("\nAll OTPs Unique: " + isUnique(otps));
	}
}
