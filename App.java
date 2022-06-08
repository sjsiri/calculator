import java.nio.file.ProviderMismatchException;
import java.util.Scanner;


public class App {

    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt){
        System.out.println(prompt);
        String stringInput = inputScanner.next();
        return stringInput;
    }

    private static double getDouble(String prompt){
        System.out.println(prompt);
        double doubleInput = inputScanner.nextDouble();
        return doubleInput;
    }

    public static void main(String[] args) {
        
        double num1 = getDouble("Please enter a number: ");
        double num2 = getDouble("Please enter second number: ");
       Calculator calculator = new Calculator();
       double addAnswer = calculator.add(num1, num2);
       double subAnswer = calculator.sub(num1, num2);
       double mulAnswer = calculator.mul(num1, num2);
       double divAnswer = calculator.div(num1, num2);
       System.out.println(addAnswer);
       System.out.println(subAnswer);
       System.out.println(mulAnswer);
       System.out.println(divAnswer);
       String yOrN = getString("Would you wish to continue? Y or N");
       while (yOrN .equals("y")){
        num1 = getDouble("Please enter a number: ");
        num2 = getDouble("Please enter second number: ");
        addAnswer = calculator.add(num1, num2);
        subAnswer = calculator.sub(num1, num2);
        mulAnswer = calculator.mul(num1, num2);
        divAnswer = calculator.div(num1, num2);
       System.out.println(addAnswer);
       System.out.println(subAnswer);
       System.out.println(mulAnswer);
       System.out.println(divAnswer);
        yOrN = getString("would you wish to continue? y/n");
       }
       if (yOrN .equals("n")) {
           System.out.println("GoodBye");
       }
       }
    }

