package abstractTest1Pack;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("Enter Greeting: ");
		String greetingInput = scanner.next();
		
		XYZ xyz = new XYZ();
		xyz.FOO();
		
	    String result = xyz.DAY(greetingInput); 
        System.out.println(result);

		
		scanner.close();
	}

}
