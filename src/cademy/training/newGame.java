package cademy.training;

import java.util.Random;
import java.util.Scanner;

public class newGame {

    String newPlayer;
    Scanner sc = new Scanner(System.in);
    int count;
    int numberOfAttempts;
    String ask;
    String questionsAsk;


    public void introduction(){
        System.out.println("Hello and welcome to the 8ball! Who do I have the pleasure of speaking with?");
        newPlayer = sc.nextLine();
        System.out.println("Ah! Well, it's nice to meet you " + newPlayer);

        do{

            System.out.println("Okay " + newPlayer + "Are you ready to play (Y/N)");
            ask = sc.nextLine();
            if(ask.equals("Y")){
                break;
            }else if(ask.equals("N")){
                System.out.println("Please let me know when you're ready");
                count++;
            }




        }while(count < 3);

    }

    public void startGame(){
        do{

            System.out.println("Okay " + newPlayer + ", what questions do you want to ask? btw, you only get to ask five questions");
            questionsAsk = sc.nextLine();

            Random randomResults = new Random();
            int gameQuestions = randomResults.nextInt(9);

            switch(gameQuestions){
                case 0:
                    System.out.println("Ask again later");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;
                case 1:
                    System.out.println("My source of information says no");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;
                case 2:
                    System.out.println(" Affirms it's certain");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;
                case 3:
                    System.out.println("You're definitely fine the answer you're looking for");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;
                case 4:
                    System.out.println("This is probably the best question to ask");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;
                case 5:
                    System.out.println("Stop be afraid about accomplishing your goal");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;
                case 6:
                    System.out.println("Don't know what I can do to help you out with that homie");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;
                case 7:
                    System.out.println("This is the way of lie");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;
                case 8:
                    System.out.println("This is NOT the  way of lie");
                    numberOfAttempts++;
                    System.out.println("How many attempts you used : " + numberOfAttempts);
                    break;

            }






        }while(numberOfAttempts < 5);

        System.out.println("Thank you for playing! You have used all five attempts");
    }



}
