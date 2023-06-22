import java.util.Scanner;

public class HelloGithub {

    public static void main(String[] args) {
        double studentGPA;
        double freshmen, sophomore, junior, senior;
        String studentName;
        System.out.println("What is your name?");

        Scanner input = new Scanner(System.in);
        studentName = input.next();

        System.out.println("Hey, " + studentName + "!");
        System.out.println("What was your GPA Freshmen year?");
        freshmen = input.nextDouble();
        System.out.println("How about sophomore year?");
        sophomore = input.nextDouble();
        System.out.println("Junior?");
        junior = input.nextDouble();
        System.out.println("What about senior year?");
        senior = input.nextDouble();

        studentGPA = ((freshmen + sophomore + junior + senior)/4);
        System.out.println("Your GPA is " + studentGPA);
    }

}
