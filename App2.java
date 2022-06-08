import java.nio.file.ProviderMismatchException;
import java.util.Scanner;


public class App2 {

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
        Calculator calculator = new Calculator();
        double num1 = getDouble("Please enter a number: ");
        double num2 = getDouble("Please enter second number: ");
        String operation = getString("What would you like to do? add, subtract, multiply, divide, exit").toLowerCase();
        if (operation .equals("add")) {
            double addAnswer = calculator.add(num1, num2);
            System.out.println(addAnswer);
        }
        if (operation .equals("subtract")){
            double subAnswer = calculator.sub(num1, num2);
            System.out.println(subAnswer);
        }
        if (operation .equals("multiply")){
            double mulAnswer = calculator.mul(num1, num2);
            System.out.println(mulAnswer);
        }
        if (operation .equals("divide")){
            double divAnswer = calculator.div(num1, num2);
            System.out.println(divAnswer);
        }
        else {
            System.out.println("GoodBye");
        }
       String yOrN = getString("Would you like to continue? y/n");
        while (yOrN .equals("y")) {
            num1 = getDouble("Please enter a number: ");
            num2 = getDouble("Please enter second number: ");
            operation = getString("What would you like to do? add, subtract, multiply, divide, exit");
        if (operation .equals("add")) {
            double addAnswer = calculator.add(num1, num2);
            System.out.println(addAnswer);
        }
        if (operation .equals("subtract")){
            double subAnswer = calculator.sub(num1, num2);
            System.out.println(subAnswer);
        }
        if (operation .equals("multiply")){
            double mulAnswer = calculator.mul(num1, num2);
            System.out.println(mulAnswer);
        }
        if (operation .equals("divide")){
            double divAnswer = calculator.div(num1, num2);
            System.out.println(divAnswer);
        }
        else {
            System.out.println("GoodBye");
            System.out.println("Check");
        }
            
        }
       
       
      
       }
    }

