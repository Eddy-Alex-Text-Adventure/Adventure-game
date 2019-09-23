import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome Warrior! what is your name?");
        String charName = scan.nextLine();
//        System.out.println("charName = " + charName);
        System.out.println("Would you like to go on an adventure " + charName + "?");
        String yesOrNo = scan.nextLine();

        if (yesOrNo.equalsIgnoreCase("y")) {
            System.out.println("Awesome sauce! Here is your first challenge!");
        } else {
            System.out.println("FATALITY!!!");
        }
     }
}
