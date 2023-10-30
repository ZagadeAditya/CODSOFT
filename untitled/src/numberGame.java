import java.util.Scanner;
import java.util.Random;

class numberGame{

    public static void main(String args[]){

        Random rand =new Random();
        Scanner sc=new Scanner(System.in);

        int num=rand.nextInt(20);

        System.out.println("Guess the number - It is between 1-20");

        for(int i=10;i>0;i--){

            System.out.println("You have '"+i+"'  attempts left to guess the right number");
            System.out.println("Guess the number");
            int guess=sc.nextInt();

            if(guess==num){
                System.out.println("Congratulation!! You have guessed the number");
                break;
            }
            else if(guess<num){
                System.out.println("The number that you have guessed is less than the correct number, Try again");
            }
            else if(guess>num){
                System.out.println("The number that you have guessed is greater than the correct number, Try again");
            }
        }
    }
}