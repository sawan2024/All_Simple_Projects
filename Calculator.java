import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1 =0.0, num2;
        int Choise;
        boolean first = true;
        System.out.println("All operation");
        System.out.println("0. Exit the Calculator\n1. +\n2. -\n3. *\n4. /\n5. %\n6.Clear Calculator");
        Scanner x = new Scanner(System.in);
        while(true){
        System.out.println("choice the operation : ");
        if (!x.hasNextInt()) {
            System.out.println("Invalid input");
            x.next();
            continue;
        }
        Choise = x.nextInt();
        if(Choise == 0)break;
            if (Choise >= 1 && Choise <= 6) {
                if (Choise == 6){
                    num1 = 0;first = true;
                    System.out.println("Let Start Fresh Calculator");continue;
                }
            if(first){
                System.out.println("enter the value 1");
               while(!x.hasNextDouble()) {
                    System.out.println("Invalid input");
                    x.next();
                }
                num1 = x.nextDouble();
                first = false;
                }
            System.out.println("enter the value 2");
            while(!x.hasNextDouble()){
                    System.out.println("Invalid input");
                    x.next();
            }
                num2 = x.nextDouble();
            if(Choise == 4 || Choise == 5){if (num2 == 0 || num1 == 0){System.out.println("Can not be divide by zero");continue;}}
            switch (Choise) {
                case 1:
                    num1 = num1 + num2;
                    System.out.println("Total Sum: "+ num1);
                    break;
                case 2:
                    num1 = num1 - num2;
                    System.out.println("Total - : "+ num1);
                    break;
                case 3:
                    num1 = num1 * num2;
                    System.out.println("Total x : "+ num1);
                    break;
                case 4:
                    num1 = num1 / num2;
                    System.out.println("Total divide : "+ num1);
                    break;
                case 5:
                    num1 = num1 % num2;
                    System.out.println("Total % : "+ num1);
                    break;
                    default:
                    System.out.println("invalid input");
            }
        } }x.close();
    }
}
