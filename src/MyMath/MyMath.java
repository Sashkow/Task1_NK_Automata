package MyMath;

import java.lang.Math;

public class MyMath {
	public static Integer pow(Integer base, Integer power){
		return (new Double(Math.pow(base, power))).intValue();
	}
	

}
