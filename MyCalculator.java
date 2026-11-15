import java.util.Scanner;
//Import Scanner object.

//Youtube video link: https://youtu.be/sP-tgTkl2Uk

public class MyCalculator {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scnr = new Scanner(System.in);
        // String variable for if the user wants to restart the program.
        String startOver = "Y";
        // While loop for if the user wants to restart the program.
        while (startOver.equals("Y")) {

            // Ask the user for their preferred calc mode.
            System.out.print("Enter the calculator mode: ");
            System.out.println("Standard/Scientific?");
            String mode = scnr.next();
            // String variable for the mode the user wants to use.

            // While loop to check if the mode input is valid or not.
            while (!(mode.equalsIgnoreCase("standard") || mode.equalsIgnoreCase("scientific"))) {
                System.out.println("Invalid mode.");
                System.out.print("Enter the calculator mode:");
                System.out.print("Standard/Scientific?");
                mode = scnr.next().trim();
                scnr.nextLine();

                // If the mode is valid then the user can continue.
                if (mode.equalsIgnoreCase("standard") || mode.equalsIgnoreCase("scientific")) {
                    break;
                }

            }
            // String for the type of operation the user wants to make.
            String userOperator;
            // If the user wants to use the standard mode.
            if (mode.equalsIgnoreCase("standard")) {
                System.out.println("The calculator will operate in standard mode.");
                // Asks the user what operation they want to do.
                System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
                userOperator = scnr.next();

                // While loop to check for invalid input.
                while (!(userOperator.equals("+") || userOperator.equals("-") || userOperator.equals("*") || userOperator.equals("/"))) {
                    System.out.println("Invalid operator " + userOperator);

                    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
                    userOperator = scnr.next();
                    // Breaks the while loop once the user inputs a valid operation.
                    if (userOperator.equals("+") || userOperator.equals("-") || userOperator.equals("*") || userOperator.equals("/")) {
                        break;
                    }
                }
                // String variable and switch statement that reads the type of operation the user wants to make when
                // asking the amount of times they want to operate.
                String operation = "";

                switch (userOperator) {
                    case "+": operation = "add"; break;
                    case "-": operation = "subtract"; break;
                    case "*": operation = "multiply"; break;
                    case "/": operation = "divide"; break;
                }
                // int variable that reads the amount of times the user wants to operate.
                int timesOfOperation;
                double operationNums = 0;
                // double variable that reads the numbers the user wants to operate.
                // Ask the user how many numbers they want to operate.
                System.out.println("How many numbers do you want to " + operation + "?");
                timesOfOperation = scnr.nextInt();

                // Ask the user to enter the numbers they want to operate.
                System.out.println("Enter " + timesOfOperation + " numbers");
                double result = scnr.nextDouble();
                // For loop that calculates the amount of times the user wants to operate
                // given the operation they chose
                for (int i = 1; i < timesOfOperation; i++) {
                    operationNums = scnr.nextDouble();

                    if (userOperator.equals("+")) {
                        result += operationNums;
                    } else if (userOperator.equals("-")) {
                        result -= operationNums;
                    } else if (userOperator.equals("*")) {
                        result *= operationNums;
                    } else if (userOperator.equals("/")) {
                        result /= operationNums;
                    }
                }
                System.out.println("Result: " + result);

                // Ask the user if they want to start over.
                System.out.println("Do you want to start over? (Y/N)");
                startOver = scnr.next().trim().toUpperCase();
                // if statement if the user ends the program.
                if (startOver.equals("N")) {
                    System.out.println("Goodbye");
                }

                // If the user wants to use the standard mode.
            } else if (mode.equalsIgnoreCase("scientific")) {

                System.out.println("The calculator will operate in scientific mode.");

                System.out.print("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for");
                System.out.println(" sin x, 'cos' for cos x, 'tan' for tan x:");
                userOperator = scnr.next().trim();


                while (!(userOperator.equals("+") || userOperator.equals("-") || userOperator.equals("*") || userOperator.equals("/") || userOperator.equals("sin") || userOperator.equals("cos") || userOperator.equals("tan"))) {
                    System.out.println("    Invalid Operator " + userOperator);

                    System.out.println("\nEnter '+' for addition, '-' for \nsubtraction, '*' for multiplication, '/' for division, 'sin' for");
                    System.out.println("sin x, 'cos' for cos x, 'tan' for tan x:");
                    userOperator = scnr.next();

                    if (userOperator.equals("+") || userOperator.equals("-") || userOperator.equals("*") || userOperator.equals("/") || userOperator.equals("sin") || userOperator.equals("cos") || userOperator.equals("tan")) {
                        break;
                    }
                }

                String operation = "";

                switch (userOperator) {
                    case "+": operation = "add"; break;
                    case "-" : operation = "subtract"; break;
                    case "*": operation = "multiply"; break;
                    case "/": operation = "divide"; break;
                    case "sin": operation = "Sine"; break;
                    case "cos": operation = "cosine"; break;
                    case "tan": operation = "tangent"; break;
                }

                if(userOperator.equals("+") || userOperator.equals("-") || userOperator.equals("*") || userOperator.equals("/")){
                    int timesOfOperation;
                    double operationNums = 0;


                    System.out.println("How many numbers do you want to " + operation + "?");
                    timesOfOperation = scnr.nextInt();

                    System.out.println("Enter " + timesOfOperation + " numbers");
                    double result = scnr.nextDouble();

                    for (int i = 1; i < timesOfOperation; i++) {
                        operationNums = scnr.nextDouble();

                        if (userOperator.equals("+")) {
                            result += operationNums;
                        } else if (userOperator.equals("-")) {
                            result -= operationNums;
                        } else if (userOperator.equals("*")) {
                            result *= operationNums;
                        } else if (userOperator.equals("/")) {
                            result /= operationNums;
                        }
                    }
                    System.out.println("Result: " + result);


                    System.out.println("Do you want to start over? (Y/N)");
                    startOver = scnr.next().trim().toUpperCase();

                    if (startOver.equals("N")) {
                        System.out.println("Goodbye");
                    }

                }
                else if(userOperator.equals("sin") || userOperator.equals("cos") || userOperator.equals("tan")) {
                    System.out.println("Enter a number in radians to find the " + operation);
                    double radians = scnr.nextDouble();
                    double result = 0.0;


                    if(userOperator.equals("sin")){
                        result = Math.sin(radians);
                        System.out.println("Result: " + result);
                    }
                    else if(userOperator.equals("cos")){
                        result = Math.cos(radians);
                        System.out.println("Result: " + result);
                    }
                    else if(userOperator.equals("tan")){
                        result = Math.tan(radians);
                        System.out.println("Result: " + result);
                    }


                    System.out.println("Do you want to start over? (Y/N)");
                    startOver = scnr.next().trim().toUpperCase();


                    if (startOver.equalsIgnoreCase("N")) {
                        System.out.println("Goodbye");
                    }

                }



            }

        }
        scnr.close();
    }
}
