import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num, guess, tries, level, points, i;
        points = 0;
        i = 0;
        System.out.println("Number guessing game:");
        System.out.println(
                "There are 5 levels of this game, and 10 tries for each level to guess the number. If the number is guessed");
        System.out.println(
                "correctly in the first try itself one obtains 100 points, on 2nd try one obtains 90 points and so on.....");
        System.out.println("If the number is not guessed correctly in any of the tries, one obtains zero points.");
        System.out.println("If the points obtained is more than 150, then one unlocks one special round.");
        for (level = 1; level <= 5; level++) {
            System.out.println(" ");
            System.out.println("Round no:" + level);
            num = rand.nextInt(100);
            {
                tries = 1;
                while (tries <= 8) {
                    System.out.println("Guess a number between 0 and 100:");
                    guess = sc.nextInt();
                    tries++;
                    if (guess == num) {
                        System.out.println("Your guess is correct!!!");
                        System.out.println("It took " + tries + " tries to guess the correct number");
                        i = 110 - (10 * tries);
                        points = points + i;
                        break;

                    } else if (guess > num) {
                        System.out.println("The number guessed is too high");
                    } else {
                        System.out.println("The number guessed is too low");
                    }

                }
                System.out.println("The random number was: " + num);
                System.out.println("The points obtained in Round " + level + " is " + i);
            }
            System.out.println("The total points obtained upto this round is=" + points);
        }
        System.out.println("The total points obtained in this game is=" + points);
        if (points > 150) {
            System.out.println("Congratulations!!!! You have unlocked the Special Round");
            System.out.println(
                    "This round is to guess 1 number in 5 tries, any get a total 100 points in any of the tries.");
            System.out.println("Special round:");
            num = rand.nextInt(100);
            {
                tries = 1;
                while (tries <= 5) {
                    System.out.println("Guess a number between 0 and 100:");
                    guess = sc.nextInt();
                    tries++;
                    if (guess == num) {
                        System.out.println("Your guess is correct!!!");
                        System.out.println("It took " + tries + " tries to guess the correct number");
                        i = 100;
                        points = points + i;
                        break;

                    } else if (guess > num) {
                        System.out.println("The number guessed is too high");
                    } else {
                        System.out.println("The number guessed is too low");
                    }

                }
                System.out.println("The random number was: " + num);
                System.out.println("Hence, the total points obtained is " + points);
            }
        } else {
            System.out.println("This is the end of the number game.");
        }
        sc.close();

    }

}
