package temperature;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter the temp in Celcius");
      float f = input.nextFloat();
      double d = (f*1.8)+32;
      System.out.println("temp in farenheit is "+d);
	}

}
