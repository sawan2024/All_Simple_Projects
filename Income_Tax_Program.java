import java.util.Scanner;
public class Income_Tax_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=300000){
            System.out.println("under 3 Lakh no income tax");
        } else if (income>300000 && income<=500000) {
            tax = tax + 0.05f *(income-300000);
            System.out.println( "Your total Tax :" + tax + "Rs ");
        }else if (income>500000 && income<=1000000) {
            tax = tax + 0.05f *(income-300000);
            tax = tax + 0.1f *(income-500000);
            System.out.println( "Your total Tax under 10 Lakh:" + tax + "Rs ");
        }else if (income>1000000 && income<=50000000) {
            tax = tax + 0.05f *(income-300000);
            tax = tax + 0.1f *(income-500000);
            tax = tax + 0.2f *(income-1000000);
            System.out.println( "Your total Tax under 50 Lakh:" + tax + "Rs ");
        }
    }
}
