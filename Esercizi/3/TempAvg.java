public class TempAvg {
	public static void main(String[] args) {

        float temp1 = Float.parseFloat(args[0]);
        float temp2 = Float.parseFloat(args[1]);
        float temp3 = Float.parseFloat(args[2]);
        float temp4 = Float.parseFloat(args[3]);
        float temp5 = Float.parseFloat(args[4]);
        float temp6 = Float.parseFloat(args[5]);
		float tempAvg = (float)(temp1 +temp2 +temp3 +temp4 +temp5 +temp6)/6;
		System.out.println("temp1: "+ temp1 +"°C");
		System.out.println("temp2: "+temp2+"°C");
		System.out.println("temp3: "+temp3+"°C");
		System.out.println("temp4: "+temp4+"°C");
		System.out.println("temp5: "+temp5+"°C");
		System.out.println("temp6: "+temp6+"°C");		
		System.out.printf("tempAvg: %.2f°C", tempAvg);		
	}
}
