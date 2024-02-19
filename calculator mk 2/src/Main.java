import java.util.Scanner;

public class Main {

        //while(continueStatus)
    public static void main(String[] args) {

        while(true) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input operation ");
        String operation = scanner.next();

            /*if(operation.equals("+")) {
                System.out.println("\"" + operation + "\" is not a valid operation. please try again");
            } else*/

        System.out.println("input first number ");
        int number1 = scanner.nextInt();

        System.out.println("input second number ");
        int number2 = scanner.nextInt();


        if (operation.equals("/") && number2 == 0) {
            String results = "you cannot divide by zero. please try again ";
            System.out.println(results);
        } else {


            int result = 0;
            switch (operation) {
                case "+", "plus":
                    result = number1 + number2;
                    break;
                case "-", "minus":
                    result = number1 - number2;
                    break;
                case "*", "multiplied by":
                    result = number1 * number2;
                    break;
                case "/", "divided by":
                    result = number1 / number2;
                    break;
                default:
                    result = 0;
                    break;
            }


            String results = (number1 + " " + operation + " " + number2 + " " + "=" + " " + result);
            System.out.println(results);

            System.out.println("do you wish to make another calculation? (y/n)");
            if (!scanner.next().equals("y")) {
                break;
            }

        }

            //runLoop();
        }
    }


    /*public static int runLoop() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\ndo you wish to make another calculation? (y/n)");
        int continueStatus = 1;
        if (!scanner1.next().equals("y")) {
            continueStatus = 0;
            return continueStatus;
        }
        return continueStatus;

    }*/


}

