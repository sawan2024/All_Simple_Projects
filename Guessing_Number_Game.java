import java.util.Scanner;

class Ramdom1{
    int a =(int)(Math.random()*101);
}
class user extends Ramdom1{
    Scanner x = new Scanner(System.in);
    int b ,i =0;
    public void num(){
        System.out.println("Welcome to Game Zone \nGuess the number do you have 10 chances :");
        for(; i<10;i++){
        while(!x.hasNextInt()){
            System.out.println("Invalid Input");
            x.next();
        }
        b =x.nextInt();
        if (b == super.a){
            System.out.println("You Guess The Right Answer");
            break;
        }
        if (b > super.a){
            System.out.println("Guess number is large");
        } else if (b < super.a){
            System.out.println("Guess number is low");
        }
    }
    }
}

public class Guessing_Number_Game {
    public static void main(String[] args) {
        user bj =new user();
        bj.num();
    }
}
