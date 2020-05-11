import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:  ");
        String name = scanner.next();// response
        System.out.println("Hello " + name
                + " do you wish to continue to the interactive portion? \nEnter 'yes' or 'y', continue:");
                        
        String response = scanner.next();// response
        switch (response) {
            case "yes":
            case "y":
                break;
            default:
                System.out.println("Thank you for visiting, I will see you all later bye!");
                System.exit(0);

        }
        String playAgain;
        do {
            // System.out.println("Do you have a red car? (yes, no):");
            // String car = scan.next();
            System.out.println("What is the name of your favorite pet? :  ");
            String pet = scanner.next();
            System.out.println("what is the age of your favorite pet.");
            int petAge = scanner.nextInt();
            System.out.println("What is your lucky number?");
            int lucky = scanner.nextInt();
            System.out.println("Do you have a favorite quarterback?");
            String jersey = scanner.next();

            int jerseyNum;// saves jersey number
            switch (jersey) {
                case "yes":
                case "y":
                    System.out.println("What is their jersey number?");
                    jerseyNum = scanner.nextInt(); 
                    break;
                case "no":
                    break;
                default:
                    break;
            }
            System.out.println("What is the two-digit model year of your car?  ");
            int modelYear = scanner.nextInt();
            System.out.println("What is the first name of the your favorite actor or actress?  ");
            String actor = scanner.next();
            System.out.println("Enter a random number between 1 and 50:  ");
            int userRandomNum = scanner.nextInt();

            Random rand = new Random();
            int upperbound = 76; 
            int int_random = rand.nextInt(upperbound);
            int int_random1 = rand.nextInt(upperbound);
            int int_random2 = rand.nextInt(upperbound);

            int magicBall = (int_random * lucky);
            while (magicBall > 75) {
                magicBall = magicBall - 75;
            } 
            System.out.println(magicBall);

            int favPetNum = pet.charAt(2);
            while (favPetNum > 65) {
                favPetNum = favPetNum - 65;
            } 
            int value = 42;
            int random = userRandomNum - int_random1;
            if (random < 1) {
                random = random + 64;
            }
            int luckycar = lucky + modelYear;
            int lastnum = petAge + modelYear;
            System.out.println("Lottery Numbers: " + magicBall + ", " + favPetNum + ", " + value + ", " + random + ", "
                    + luckycar + " " + lastnum);
            System.out.println("Do you want to play again? :  ");
            playAgain = scanner.next();}
            while (playAgain.equals("yes") || playAgain.equals("y"));

        System.out.print("Thanks for Playing!");
        System.exit(0);

        scanner.close();

    }

}