import java.util.Scanner;

public class HelloGithub {

    public static void main(String[] args) {
        String hardestLanguage = "React";
        String theUsersGuess;
        System.out.println("Which is the hardest language to learn: Java or React?");

        Scanner input = new Scanner(System.in);
        theUsersGuess = input.next();

        if(theUsersGuess.toLowerCase().equals(hardestLanguage.toLowerCase())) {
            System.out.println("Correct! React is the hardest language.");
        } else {
            System.out.println("Wrong. You must have never tried React.JS...");
            System.out.println("You guessed " + theUsersGuess + ", but the right answer is " + hardestLanguage);
        }
    }

}
