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
            //entering betsy stats
            System.out.println("Betsy the Spider\n");
            int attackPoints = 8;
            int hp = 50;
            System.out.println("Betsy's attack is " + attackPoints + ".\n");
            System.out.println("Betsy's Hitpoints are " + hp + ".\n");
            System.out.println("Betsy the Spider: Your mother was a hamster and " +
                    "your father smelt of elderberries!\n");

            int heroAtk = 10;
            int heroHealth = 100;
            System.out.println(charName + ", your health is " + heroHealth + " and your trusty stick does "
                    + heroAtk + " damage! BOOYAH!");




        } else {
            System.out.println("FATALITY!!!");
        }
     }

//     public static String giantSpider() {
//        String name = "Betsy";
//        int betsyAttk = 8;
//        int betsyHP = 50;
//         System.out.println(name);
//
//     }

}
